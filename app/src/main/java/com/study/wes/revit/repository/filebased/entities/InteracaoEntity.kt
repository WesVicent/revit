package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Interacao

/** Created by Wes Vicent 06/10/2022*/
class InteracaoEntity: Entity<Interacao> {
    override val name: String = "Usuario"
    override var dataList: Array<Interacao>? = null
    override var data: Interacao? = null

    /**
     * Esse constructor serve apenas para gerar o nome para a criação do DB.
     * */
    constructor()

    constructor(data: Interacao) {
        this.data = data
    }

    constructor(dataList: Array<Interacao>) {
        this.dataList = dataList
    }
}