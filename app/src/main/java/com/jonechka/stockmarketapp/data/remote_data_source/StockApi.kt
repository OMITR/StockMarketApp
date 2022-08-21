package com.jonechka.stockmarketapp.data.remote_data_source

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    companion object {
        const val API_KEY = "N0O6MK1IZVJ94714"
        const val BASE_URL = "https://alphavantage.co"
    }
}