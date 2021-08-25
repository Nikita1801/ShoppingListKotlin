package com.example.shoppinglistkotlin.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(ShopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
    
}