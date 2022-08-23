package com.jonechka.stockmarketapp.data.mapper

import com.jonechka.stockmarketapp.data.local_data_source.CompanyListingEntity
import com.jonechka.stockmarketapp.data.remote_data_source.dto.CompanyInfoDto
import com.jonechka.stockmarketapp.domain.model.CompanyInfo
import com.jonechka.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}