package com.study.wes.revit.repository.filebased.entities

import com.study.wes.revit.models.Model

/** Created by Wes Vicent 06/10/2022*/
interface Entity<T: Model> {
    val name: String
    val data: T?
    val dataList: Array<T>?
}