package com.rafael.domain.usecase

import com.rafael.domain.model.Item
import io.reactivex.Single

interface addRevenueUseCase {
    fun addRevenue(revenue: Item): Single<Long>
}