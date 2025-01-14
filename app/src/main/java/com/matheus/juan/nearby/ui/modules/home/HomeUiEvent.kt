package com.matheus.juan.nearby.ui.modules.home

sealed class HomeUiEvent {

    data object OnFetchCategories : HomeUiEvent()
    data class OnFetchMarkets(val categoryId: String) : HomeUiEvent()
}