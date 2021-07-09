package com.rafael.domain.usecase

import com.rafael.domain.model.Item
import io.reactivex.Single
import java.math.BigDecimal

interface calculateExpensesUseCase {
    fun calculateExpenses(expenses: List<Item>): Single<BigDecimal>
}