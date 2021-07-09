package com.rafael.domain.usecase

import io.reactivex.Single

interface deleteItemUseCase {
    fun deleteItem(id:Int): Single<Long>
}