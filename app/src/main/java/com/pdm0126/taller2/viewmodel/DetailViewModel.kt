package com.pdm0126.taller2.viewmodel

import androidx.lifecycle.ViewModel
import com.pdm0126.taller2.data.RestaurantRepository
import com.pdm0126.taller2.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class DetailUiState(
    val restaurant: Restaurant? = null,
    val toastMessage: String? = null
)

class DetailViewModel(
    private val repository: RestaurantRepository,
    private val restaurantId: Int
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailUiState())
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    init {
        loadRestaurant()
    }

    private fun loadRestaurant() {
        val restaurant = repository.getRestaurantById(restaurantId)
        _uiState.value = _uiState.value.copy(restaurant = restaurant)
    }

    fun onAddToCart(dishName: String) {
        _uiState.value = _uiState.value.copy(toastMessage = "$dishName agregado al carrito")
    }

    fun clearToast() {
        _uiState.value = _uiState.value.copy(toastMessage = null)
    }
}