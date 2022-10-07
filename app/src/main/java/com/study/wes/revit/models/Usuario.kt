package com.study.wes.revit.models

/** Created by Wes Vicent 05/10/2022*/
data class Usuario(
    override var id: Int,
    val nome: String,
    val genero: String,

    override val fillable: Map<String, String> = mapOf(
        "nome" to nome,
        "genero" to genero
    ),
) : Model {
    constructor() : this(0, "", "")
}