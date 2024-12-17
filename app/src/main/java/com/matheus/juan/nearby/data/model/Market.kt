package com.matheus.juan.nearby.data.model

data class Market(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val coupons: Int,
    val rules: List<CouponRule> = emptyList(),
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String
)
