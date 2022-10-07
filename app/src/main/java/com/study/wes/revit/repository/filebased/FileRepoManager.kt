package com.study.wes.revit.repository.filebased

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.study.wes.revit.models.*
import com.study.wes.revit.repository.filebased.entities.*
import com.study.wes.revit.utils.Utils

/** Created by Wes Vicent 05/10/2022*/
class FileRepoManager(private val context: Context) {
    private val entities: Array<Entity<*>> = arrayOf(
        UsuarioEntity(arrayOf(Usuario(0, "meu", "meu"), Usuario(0, "uva", "uva"), Usuario(0, "banana", "banana")))/*,
        LembreteEntity(),
        InstrucaoEntity(),
        PassoEntity(),
        InteracaoEntity()*/
    )

    init {
        createTableFiles()
    }

    private fun createTableFiles() {
        val prefs = context.getSharedPreferences(Utils.PREFS_GLOBAL, MODE_PRIVATE)

        if (!prefs.getBoolean(Utils.GLOBAL_IS_DB_CREATED, false)) {
            for (entity in entities) {
                val file = context.getSharedPreferences(entity.name, MODE_PRIVATE)
                val fileEditor = file.edit()

                fileEditor.putInt(DATA_LAST_ID, 0)
                fileEditor.apply()
            }

            val editor = prefs.edit()

            editor.putBoolean(Utils.GLOBAL_IS_DB_CREATED, true)
            editor.apply()
        }

        for (entity in entities) {
            insert(entity)
        }
    }

    /**
     * Uma nova tupla é inserida SOMENTE:
     * Se ID == 0 (gera um ID sequencial);
     * Ou se ID != 0 e não houverem tuplas com esse ID (usa o ID que vem no model).
     **/
    private fun insert(entity: Entity<*>): Boolean {
        val file = context.getSharedPreferences(entity.name, MODE_PRIVATE)
        val editor = file.edit()
        var result = false

        if (entity.dataList == null && entity.data != null) {
            result = if (proccessToCreate(entity, file, editor)) {
                iterateData(entity.data!!, editor)
                editor.apply()

                true
            } else {
                false
            }
        }

        if (entity.dataList != null && entity.data == null) {
            result = if (proccessToCreate(entity, file, editor)) {
                for (data in entity.dataList!!) {
                    iterateData(data, editor)
                }
                editor.apply()

                true
            } else {
                false
            }
        }

        return result
    }

    fun iterateData (data: Model, editor: Editor) {
        for (fill in data.fillable) {
            editor.putString(fill.key + "_${data.id}", fill.value)
        }
    }

    fun proccessToCreate(entity: Entity<*>, file: SharedPreferences, editor: SharedPreferences.Editor): Boolean {
        var result = false

        if (entity.dataList == null && entity.data != null) {
            result = manageIds(entity.data!!, file, editor)
        }

        if (entity.dataList != null && entity.data == null) {
            for (data in entity.dataList!!) {
                result = manageIds(data, file, editor) //TODO: Gerenciar erros individuais
            }
        }

        return result
    }

    private fun manageIds (data: Model, file: SharedPreferences, editor: Editor): Boolean {
        val lastId = file.getInt(DATA_LAST_ID, 0)

        if (data.id == 0) {
            data.id = lastId + 1
        } else {
            // Se o arquivo já tiver registros com o id.
            if (file.getString(
                    data.fillable.keys.elementAt(0).toString() + "_${data.id}", "")!!.isNotBlank()
            ) {
                return false
            }
        }
        // O registro de ultimo id nunca é decrementado
        if (data.id > lastId) {
            editor.putInt(DATA_LAST_ID, data.id)
            editor.apply()
        }

        return true
    }

    companion object {
        private const val DATA_LAST_ID = "last_insert"
    }
}