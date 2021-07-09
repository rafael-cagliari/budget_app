package com.rafael.domain.usecase

import com.rafael.domain.model.Item
import io.reactivex.Single

interface addExpenseUseCase {
    fun addExpense(expense: Item): Single<Long>
}