package com.study.wes.revit.models

import com.study.wes.revit.models.interfaces.Iterativo

/** Created by Wes Vicent 09/01/2022*/

data class Passo (
    val titulo: String,
    val img: Int,
    val dercricao: String,
    val interacoes: List<Interacao>,
    override val duracao: Double

): Iterativo