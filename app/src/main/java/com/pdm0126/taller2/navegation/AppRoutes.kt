package com.pdm0126.taller2.navegation


import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class AppRoutes : NavKey {

    @Serializable
    data object Home : AppRoutes()

    @Serializable
    data class Detail(val restaurantId: Int) : AppRoutes()

    @Serializable
    data object Search : AppRoutes()
}