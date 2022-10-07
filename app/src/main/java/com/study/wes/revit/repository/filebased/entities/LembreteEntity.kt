package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Lembrete

/** Created by Wes Vicent 06/10/2022*/
class LembreteEntity: Entity<Lembrete> {
    override val name: String = "Lembretes"
    override var dataList: Array<Lembrete>? = null
    override var data: Lembrete? = null

    /**
     * Esse constructor serve apenas para gerar o nome para a criação do DB.
     * */
    constructor()

    constructor(data: Lembrete) {
        this.data = data
    }

    constructor(dataList: Array<Lembrete>) {
        this.dataList = dataList
    }
}