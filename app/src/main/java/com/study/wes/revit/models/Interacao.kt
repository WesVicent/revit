package com.study.wes.revit.models

import com.study.wes.revit.models.interfaces.Iterativo

/** Created by Wes Vicent 09/01/2022*/
data class Interacao(
    override var id: Int,
    val tamanho: Int,
    val momento: Int,
    val passoID: Int,
    override val duracao: Double,

    override val fillable: Map<String, String> = mapOf(
        "id" to id.toString(),
        "tamanho" to tamanho.toString(),
        "momento" to momento.toString(),
        "duracao" to duracao.toString(),
        "passo_id" to passoID.toString()
    )
) : Iterativo, Model {
    constructor() : this(0, 0, 0, 0, 0.0)
}