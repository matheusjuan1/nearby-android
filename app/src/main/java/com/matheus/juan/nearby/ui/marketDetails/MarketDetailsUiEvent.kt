package com.matheus.juan.nearby.ui.marketDetails

sealed class MarketDetailsUiEvent {

    data class OnFetchRules(val marketId: String) : MarketDetailsUiEvent()
    data class OnFetchCoupon(val qrCodeContent: String) : MarketDetailsUiEvent()
    data object OnResetCoupon : MarketDetailsUiEvent()
}