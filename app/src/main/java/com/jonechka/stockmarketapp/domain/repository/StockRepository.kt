package com.jonechka.stockmarketapp.domain.repository

import com.jonechka.stockmarketapp.domain.model.CompanyListing
import com.jonechka.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}