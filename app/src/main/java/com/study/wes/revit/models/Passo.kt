package com.study.wes.revit.models

import com.study.wes.revit.models.interfaces.Iterativo

/** Created by Wes Vicent 09/01/2022*/

data class Passo(
    override var id: Int,
    val titulo: String,
    val img: String,
    val descricao: String,
    val interacoes: List<Interacao>?,
    val instrucaoID: Int,
    override val duracao: Double,

    override val fillable: Map<String, String> = mapOf(
        "id" to id.toString(),
        "titulo" to titulo,
        "img" to img,
        "descricao" to descricao,
        "duracao" to duracao.toString(),
        "instrucao_id" to instrucaoID.toString()
    )
) : Iterativo, Model {
    constructor() : this(0, "", "", "", null, 0, 0.0)
}