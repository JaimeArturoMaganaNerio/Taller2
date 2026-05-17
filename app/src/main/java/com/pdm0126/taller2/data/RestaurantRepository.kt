package com.pdm0126.taller2.data

import com.pdm0126.taller2.model.Restaurant


interface RestaurantRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
    fun searchRestaurants(query: String): List<Restaurant>
}
