package com.matheus.juan.nearby.core.network

import android.util.Log
import com.matheus.juan.nearby.core.network.KtorHttpClient.httpClientAndroid
import com.matheus.juan.nearby.data.model.Category
import com.matheus.juan.nearby.data.model.Coupon
import com.matheus.juan.nearby.data.model.Market
import com.matheus.juan.nearby.data.model.MarketDetails
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.patch

object NearbyRemoteDataSource {

    private const val LOCAL_HOST_BASE_URL = "http://192.168.15.3:3333"
    private const val LOCAL_HOST_EMULATOR_BASE_URL = "htpp://10.0.2.2:3333"

    private const val BASE_URL = LOCAL_HOST_BASE_URL


    suspend fun getCategories(): Result<List<Category>> = try {
        val categories =
            httpClientAndroid.get("${BASE_URL}/categories").body<List<Category>>()

        Result.success(categories)
    } catch (e: Exception) {
        Log.e("Categories", e.message!!)
        Result.failure(e)
    }

    suspend fun getMarkets(categoryId: String): Result<List<Market>> = try {
        val markets =
            httpClientAndroid.get("${BASE_URL}/markets/category/${categoryId}").body<List<Market>>()

        Result.success(markets)
    } catch (e: Exception) {
        Log.e("Markets", e.message!!)
        Result.failure(e)
    }

    suspend fun getMarketDetails(marketId: String): Result<MarketDetails> = try {
        val marketDetails =
            httpClientAndroid.get("${BASE_URL}/markets/${marketId}").body<MarketDetails>()

        Result.success(marketDetails)
    } catch (e: Exception) {
        Log.e("MarketDetails", e.message!!)
        Result.failure(e)
    }

    suspend fun patchCoupon(marketId: String): Result<Coupon> = try {
        val coupon =
            httpClientAndroid.patch("${BASE_URL}/coupons/${marketId}").body<Coupon>()

        Result.success(coupon)
    } catch (e: Exception) {
        Log.e("Coupon", e.message!!)
        Result.failure(e)
    }
}