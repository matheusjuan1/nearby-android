package com.matheus.juan.nearby.ui.marketDetails

import com.matheus.juan.nearby.data.model.CouponRule

data class MarketDetailsUiState(
    val rules: List<CouponRule>? = null,
    val coupon: String? = null
)
