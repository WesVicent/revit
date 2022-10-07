package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Instrucao

/** Created by Wes Vicent 06/10/2022*/
class InstrucaoEntity: Entity<Instrucao> {
    override val name: String = "Usuario"
    override var dataList: Array<Instrucao>? = null
    override var data: Instrucao? = null

    /**
     * Esse constructor serve apenas para gerar o nome para a criação do DB.
     * */
    constructor()

    constructor(data: Instrucao) {
        this.data = data
    }

    constructor(dataList: Array<Instrucao>) {
        this.dataList = dataList
    }
}