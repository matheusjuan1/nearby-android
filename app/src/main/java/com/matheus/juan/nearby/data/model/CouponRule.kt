package com.matheus.juan.nearby.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CouponRule(
    val id: String,
    val description: String,
    val marketId: String
)
