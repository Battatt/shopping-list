package com.example.shoppinglist.domain

class GetShopItemByIdUseCase(
    private val shopListRepository: ShopListRepository
) {
    fun getShopItemById(id: Int): ShopItem {
        shopListRepository.getShopItemById(id)
    }
}