package com.study.wes.revit.model

import com.study.wes.revit.model.interfaces.Iterativo

/** Created by Wes Vicent 09/01/2022*/
data class Interacao (
    val tamanho: Int,
    val momento: Int,
    override val duracao: Double
): Iterativo