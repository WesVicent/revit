package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Model
import com.study.wes.revit.models.Usuario

/** Created by Wes Vicent 06/10/2022*/
class UsuarioEntity : Entity<Usuario> {
    override val name: String = "Usuario"
    override var dataList: Array<Usuario>? = null
    override var data: Usuario? = null

    /**
     * Esse constructor serve apenas para gerar o nome para a criação do DB.
     * */
    constructor()

    constructor(data: Usuario) {
        this.data = data
    }

    constructor(dataList: Array<Usuario>) {
        this.dataList = dataList
    }
}