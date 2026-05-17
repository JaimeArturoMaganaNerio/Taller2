package com.pdm0126.taller2.navegation


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.taller2.data.RestaurantRepositoryImpl
import com.pdm0126.taller2.screen.DetailScreen
import com.pdm0126.taller2.screen.HomeScreen
import com.pdm0126.taller2.screen.SearchScreen
import com.pdm0126.taller2.viewmodel.DetailViewModel
import com.pdm0126.taller2.viewmodel.HomeViewModel
import com.pdm0126.taller2.viewmodel.SearchViewModel

@Composable
fun AppNavigation() {
    // Repositorio compartido entre pantallas
    val repository = RestaurantRepositoryImpl()

    // Back stack de Navigation 3 — arranca en Home
    val backStack = rememberNavBackStack(AppRoutes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
        entryProvider = { route ->
            when (route) {
                is AppRoutes.Home -> NavEntry(route) {
                    val viewModel: HomeViewModel = viewModel { HomeViewModel(repository) }
                    HomeScreen(
                        viewModel = viewModel,
                        onRestaurantClick = { id ->
                            backStack.add(AppRoutes.Detail(restaurantId = id))
                        },
                        onSearchClick = {
                            backStack.add(AppRoutes.Search)
                        }
                    )
                }

                is AppRoutes.Detail -> NavEntry(route) {
                    val viewModel: DetailViewModel = viewModel {
                        DetailViewModel(repository, route.restaurantId)
                    }
                    DetailScreen(
                        viewModel = viewModel,
                        onBackClick = { backStack.removeLastOrNull() }
                    )
                }

                is AppRoutes.Search -> NavEntry(route) {
                    val viewModel: SearchViewModel = viewModel { SearchViewModel(repository) }
                    SearchScreen(
                        viewModel = viewModel,
                        onRestaurantClick = { id ->
                            backStack.add(AppRoutes.Detail(restaurantId = id))
                        },
                        onBackClick = { backStack.removeLastOrNull() }
                    )
                }

                else -> NavEntry(route) { /* ruta desconocida */ }
            }
        }
    )
}