package com.pdm0126.taller2.data

import com.pdm0126.taller2.model.Dish
import com.pdm0126.taller2.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(
        //  Comida Rápida
        Restaurant(
            id = 1,
            name = "Burger House",
            description = "Las mejores hamburguesas artesanales con ingredientes frescos del día.",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(1, "Classic Burger", "Carne de res, lechuga, tomate y cebolla caramelizada",
                    "https://images.unsplash.com/photo-1550547660-d9450f859349?w=400"),
                Dish(2, "Cheeseburger Doble", "Doble carne, doble queso cheddar y pepinillos",
                    "https://images.unsplash.com/photo-1607013251379-e6eecfffe234?w=400"),
                Dish(3, "Crispy Chicken Burger", "Pollo crujiente, mayo de chipotle y col morada",
                    "https://images.unsplash.com/photo-1606755962773-d324e0a13086?w=400"),
                Dish(4, "Papas Fritas Cargadas", "Papas fritas con queso, tocino y jalapeños",
                    "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=400")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pollo Loco",
            description = "Pollo asado y frito al estilo casero, con salsas secretas de la abuela.",
            imageUrl = "https://images.unsplash.com/photo-1598515214211-89d3c73ae83b?w=400",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(5, "Pollo Entero Asado", "Pollo marinado en especias y asado al carbón",
                    "https://images.unsplash.com/photo-1587593810167-a84920ea0781?w=400"),
                Dish(6, "Alitas BBQ", "Alitas crujientes bañadas en salsa BBQ ahumada",
                    "https://images.unsplash.com/photo-1527477396000-e27163b481c2?w=400"),
                Dish(7, "Sandwich de Pollo", "Pollo frito en pan brioche con ensalada coleslaw",
                    "https://images.unsplash.com/photo-1553909489-cd47e0907980?w=400")
            )
        ),
        //Italiana
        Restaurant(
            id = 3,
            name = "Pizza Place",
            description = "Las mejores pizzas artesanales de la ciudad, con ingredientes frescos.",
            imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(8, "Pizza Margarita", "Mozzarella fresca, albahaca y salsa de tomate casera",
                    "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=400"),
                Dish(9, "Pizza Pepperoni", "Pepperoni, mozzarella y salsa picante opcional",
                    "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=400"),
                Dish(10, "Pizza Cuatro Quesos", "Mozzarella, parmesano, gorgonzola y ricotta",
                    "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400"),
                Dish(11, "Pizza Hawaiana", "Jamón, piña, mozzarella y salsa de tomate",
                    "https://images.unsplash.com/photo-1565299507177-b0ac66763828?w=400")
            )
        ),
        Restaurant(
            id = 4,
            name = "Bella Pasta",
            description = "Pasta fresca hecha a mano todos los días con recetas italianas originales.",
            imageUrl = "https://images.unsplash.com/photo-1473093226795-af9932fe5856?w=400",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(12, "Spaghetti Carbonara", "Pasta con huevo, queso pecorino, guanciale y pimienta",
                    "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400"),
                Dish(13, "Fettuccine Alfredo", "Fettuccine con salsa cremosa de mantequilla y parmesano",
                    "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?w=400"),
                Dish(14, "Lasagna Bolognesa", "Capas de pasta, carne molida y bechamel gratinada",
                    "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=400")
            )
        ),
        Restaurant(
            id = 5,
            name = "La Trattoria",
            description = "Auténtica cocina del sur de Italia en un ambiente acogedor y familiar.",
            imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=400",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(15, "Risotto ai Funghi", "Risotto cremoso con champiñones porcini y parmesano",
                    "https://images.unsplash.com/photo-1476124369491-e7addf5db371?w=400"),
                Dish(16, "Osso Buco", "Jarrete de ternera braseado con gremolata y polenta",
                    "https://images.unsplash.com/photo-1544025162-d76694265947?w=400"),
                Dish(17, "Bruschetta al Pomodoro", "Pan tostado con tomate fresco, ajo y albahaca",
                    "https://images.unsplash.com/photo-1572695157366-5e585ab2b69f?w=400")
            )
        ),
        //  Asiática
        Restaurant(
            id = 6,
            name = "Sushi Bar",
            description = "Sushi fresco preparado por chefs japoneses con pescado de primera calidad.",
            imageUrl = "https://images.unsplash.com/photo-1553621042-f6e147245754?w=400",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(18, "Roll California", "Cangrejo, aguacate y pepino envuelto en ajonjolí",
                    "https://images.unsplash.com/photo-1559466273-d95e72debaf8?w=400"),
                Dish(19, "Sashimi de Salmón", "Finas láminas de salmón fresco con wasabi y jengibre",
                    "https://images.unsplash.com/photo-1562802378-063ec186a863?w=400"),
                Dish(20, "Ramen Tonkotsu", "Caldo de cerdo cremoso con chashu, huevo y nori",
                    "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?w=400"),
                Dish(21, "Gyoza Frita", "Dumplings japoneses rellenos de cerdo y verduras",
                    "https://images.unsplash.com/photo-1496116218417-1a781b1c416c?w=400")
            )
        ),
        Restaurant(
            id = 7,
            name = "Wok Express",
            description = "Cocina china rápida y sabrosa, woks frescos preparados al momento.",
            imageUrl = "https://images.unsplash.com/photo-1603133872878-684f208fb84b?w=400",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(22, "Arroz Frito con Pollo", "Arroz salteado con pollo, huevo y verduras",
                    "https://images.unsplash.com/photo-1512058564366-18510be2db19?w=400"),
                Dish(23, "Chow Mein de Res", "Fideos salteados con tiras de res y vegetales crujientes",
                    "https://images.unsplash.com/photo-1516100882582-96c3d5c4bc2c?w=400"),
                Dish(24, "Cerdo Agridulce", "Cerdo crujiente con salsa agridulce, pimiento y piña",
                    "https://images.unsplash.com/photo-1525755662778-989d0524087e?w=400")
            )
        ),
        // Saludable
        Restaurant(
            id = 8,
            name = "Green Bowl",
            description = "Comida saludable, nutritiva y deliciosa. Ensaladas, bowls y jugos naturales.",
            imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(25, "Bowl de Açaí", "Açaí con granola, fresas, plátano y miel de abeja",
                    "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400"),
                Dish(26, "Ensalada César", "Lechuga romana, pollo a la plancha, crutones y aderezo césar",
                    "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?w=400"),
                Dish(27, "Wrap de Atún", "Tortilla integral con atún, aguacate y vegetales frescos",
                    "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=400"),
                Dish(28, "Smoothie Detox", "Espinaca, manzana verde, jengibre, limón y pepino",
                    "https://images.unsplash.com/photo-1505252585461-04db1eb84625?w=400")
            )
        ),
        // Postres
        Restaurant(
            id = 9,
            name = "Sweet Corner",
            description = "Postres artesanales, pasteles caseros y helados de sabores únicos.",
            imageUrl = "https://images.unsplash.com/photo-1551024601-bec78aea704b?w=400",
            categories = listOf("Postres"),
            menu = listOf(
                Dish(29, "Cheesecake de Fresa", "Base de galleta, relleno cremoso y coulis de fresa",
                    "https://images.unsplash.com/photo-1533134242443-d4fd215305ad?w=400"),
                Dish(30, "Brownie con Helado", "Brownie de chocolate caliente con helado de vainilla",
                    "https://images.unsplash.com/photo-1606313564200-e75d5e30476c?w=400"),
                Dish(31, "Crepes de Nutella", "Crepes suaves rellenas de Nutella con frutos del bosque",
                    "https://images.unsplash.com/photo-1519676867240-f03562e64548?w=400")
            )
        ),
        // Bebidas
        Restaurant(
            id = 10,
            name = "Juice & Co",
            description = "Jugos naturales, smoothies, aguas frescas y bebidas especiales sin azúcar.",
            imageUrl = "https://images.unsplash.com/photo-1622597467836-f3285f2131b8?w=400",
            categories = listOf("Bebidas"),
            menu = listOf(
                Dish(32, "Jugo Verde", "Apio, espinaca, pepino, manzana verde y limón",
                    "https://images.unsplash.com/photo-1610970881699-44a5587cabec?w=400"),
                Dish(33, "Limonada de Menta", "Limonada natural con hojas de menta fresca y hielo",
                    "https://images.unsplash.com/photo-1523371054106-bbf80586c38c?w=400"),
                Dish(34, "Smoothie Tropical", "Mango, maracuyá, piña y leche de coco",
                    "https://images.unsplash.com/photo-1626200419199-391ae4be7a41?w=400"),
                Dish(35, "Cold Brew Café", "Café preparado en frío durante 12 horas con leche de almendra",
                    "https://images.unsplash.com/photo-1461023058943-07fcbe16d735?w=400")
            )
        ),
        //Comida Rápida (extra)
        Restaurant(
            id = 11,
            name = "Tacos Mex",
            description = "Auténticos tacos mexicanos con recetas tradicionales y salsas artesanales.",
            imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=400",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(36, "Taco de Pastor", "Carne de cerdo marinada en achiote con piña y cilantro",
                    "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?w=400"),
                Dish(37, "Taco de Barbacoa", "Carne de res cocida lentamente con chiles y especias",
                    "https://images.unsplash.com/photo-1564767655658-4e6b8b9b1e1a?w=400"),
                Dish(38, "Quesadilla de Pollo", "Tortilla de maíz con pollo, queso y pimientos",
                    "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?w=400")
            )
        ),
        //  Asiática + Saludable
        Restaurant(
            id = 12,
            name = "Pho Saigon",
            description = "Sopa pho vietnamita preparada con caldo de hueso de res por 8 horas.",
            imageUrl = "https://images.unsplash.com/photo-1555126634-323283e090fa?w=400",
            categories = listOf("Asiática", "Saludable"),
            menu = listOf(
                Dish(39, "Pho de Res", "Caldo de hueso con fideos de arroz, res y hierbas frescas",
                    "https://images.unsplash.com/photo-1569050467447-ce54b3bbc37d?w=400"),
                Dish(40, "Banh Mi", "Baguette vietnamita con cerdo, zanahoria encurtida y cilantro",
                    "https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400"),
                Dish(41, "Rollitos de Primavera Frescos", "Arroz, camarones, aguacate y menta envueltos en papel de arroz",
                    "https://images.unsplash.com/photo-1562565652-a0d8f0c59eb4?w=400")
            )
        )
    )

    override fun getRestaurants(): List<Restaurant> = restaurants

    override fun getRestaurantById(id: Int): Restaurant? {
        return restaurants.find { it.id == id }
    }

    override fun searchRestaurants(query: String): List<Restaurant> {
        if (query.isBlank()) return emptyList()
        val lowerQuery = query.lowercase()
        return restaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(lowerQuery) ||
                    restaurant.menu.any { dish -> dish.name.lowercase().contains(lowerQuery) }
        }
    }
}