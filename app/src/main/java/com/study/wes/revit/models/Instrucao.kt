package com.study.wes.revit.models

/** Created by Wes Vicent 09/01/2022*/

data class Instrucao(
    override var id: Int,
    val nome: String,
    val passos: List<Passo>?,
    val lembreteID: Int,

    override val fillable: Map<String, String> = mapOf(
        "id" to id.toString(),
        "nome" to nome,
        "lembrete_id" to lembreteID.toString()
    )
) : Model {
    constructor() : this(0, "", null, 0)
}