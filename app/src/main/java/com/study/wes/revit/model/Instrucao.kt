package com.study.wes.revit.model

/** Created by Wes Vicent 09/01/2022*/

data class Instrucao (
    val nome: String,
    val passos: List<Passo>
)