package com.study.wes.revit.models

import com.study.wes.revit.models.interfaces.Iterativo

/** Created by Wes Vicent 09/01/2022*/

data class Lembrete(
    override var id: Int,
    val nome: String,
    val instrucoes: List<Instrucao>?,
    override val duracao: Double,

    override val fillable: Map<String, String> = mapOf(
        "id" to id.toString(),
        "nome" to nome,
        "duracao" to duracao.toString()
    )

) : Iterativo, Model {
    constructor() : this(0, "", null, 0.0)
}