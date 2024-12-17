package com.matheus.juan.nearby.data.model

import androidx.annotation.DrawableRes
import com.matheus.juan.nearby.ui.component.category.CategoryFilterChipView

data class Category(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
        get() = CategoryFilterChipView.fromDescription(description = name)?.icon
}
