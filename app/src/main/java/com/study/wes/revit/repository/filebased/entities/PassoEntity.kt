package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Passo

/** Created by Wes Vicent 06/10/2022*/
class PassoEntity: Entity<Passo> {
    override val name: String = "Usuario"
    override var dataList: Array<Passo>? = null
    override var data: Passo? = null

    /**
     * Esse constructor serve apenas para gerar o nome para a criação do DB.
     * */
    constructor()

    constructor(data: Passo) {
        this.data = data
    }

    constructor(dataList: Array<Passo>) {
        this.dataList = dataList
    }
}