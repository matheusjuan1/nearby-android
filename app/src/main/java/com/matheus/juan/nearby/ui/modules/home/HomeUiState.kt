package com.matheus.juan.nearby.ui.modules.home

import com.google.android.gms.maps.model.LatLng
import com.matheus.juan.nearby.data.model.Category
import com.matheus.juan.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)
