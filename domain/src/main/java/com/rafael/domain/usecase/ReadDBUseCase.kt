package com.rafael.domain.usecase

import com.rafael.domain.model.Item
import io.reactivex.Single

interface readDBUseCase {
    fun readDB(): Single<List<Item>>
}