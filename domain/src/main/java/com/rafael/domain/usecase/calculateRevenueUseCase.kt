package com.rafael.domain.usecase

import com.rafael.domain.model.Item
import io.reactivex.Single
import java.math.BigDecimal

interface calculateRevenueUseCase {
        fun calculateRevenue(revenue: List<Item>): Single<BigDecimal>
}