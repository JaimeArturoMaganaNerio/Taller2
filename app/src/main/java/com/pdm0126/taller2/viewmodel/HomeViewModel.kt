package com.pdm0126.taller2.viewmodel


import androidx.lifecycle.ViewModel
import com.pdm0126.taller2.data.RestaurantRepository
import com.pdm0126.taller2.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HomeUiState(
    val restaurantsByCategory: Map<String, List<Restaurant>> = emptyMap()
)

class HomeViewModel(private val repository: RestaurantRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        val all = repository.getRestaurants()

        // Agrupar dinámicamente: un restaurante puede aparecer en varias categorías
        val grouped = mutableMapOf<String, MutableList<Restaurant>>()
        for (restaurant in all) {
            for (category in restaurant.categories) {
                grouped.getOrPut(category) { mutableListOf() }.add(restaurant)
            }
        }

        _uiState.value = HomeUiState(restaurantsByCategory = grouped)
    }
}