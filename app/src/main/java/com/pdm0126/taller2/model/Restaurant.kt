package com.pdm0126.taller2.model

val sampleRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Place",
        description = "Las mejores pizzas artesanales de la ciudad",
        imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=1025",
        categories = listOf("Italiana", "Pizzas"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Margarita",
                description = "Mozzarella, albahaca y tomate fresco",
                imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                id = 2,
                name = "Pizza Pepperoni",
                description = "Pepperoni con queso mozzarella derretido",
                imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=1176"
            ),
            Dish(
                id = 3,
                name = "Pizza Hawaiana",
                description = "Jamón, piña dulce y extra queso",
                imageUrl = "https://images.unsplash.com/photo-1565299507177-b0ac66763828?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "El Rincón del Taco",
        description = "Auténtica comida callejera mexicana",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=800",
        categories = listOf("Mexicana", "Tacos"),
        menu = listOf(
            Dish(
                id = 4,
                name = "Tacos al Pastor",
                description = "Carne de cerdo adobada con piña y cilantro",
                imageUrl = "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=800"
            ),
            Dish(
                id = 5,
                name = "Enchiladas Verdes",
                description = "Tortillas rellenas de pollo bañadas en salsa verde",
                imageUrl = "https://images.unsplash.com/photo-1534353436294-0dbd4bdac845?q=80&w=800"
            ),
            Dish(
                id = 6,
                name = "Guacamole Clásico",
                description = "Aguacate fresco, pico de gallo y totopos",
                imageUrl = "https://images.unsplash.com/photo-1525385133512-2f3bdd039054?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Sushi Master",
        description = "Lo mejor de la cocina tradicional japonesa",
        imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=800",
        categories = listOf("Japonesa", "Sushi"),
        menu = listOf(
            Dish(
                id = 7,
                name = "California Roll",
                description = "Cangrejo, aguacate y pepino",
                imageUrl = "https://images.unsplash.com/photo-1553621042-f6e147245754?q=80&w=800"
            ),
            Dish(
                id = 8,
                name = "Nigiri de Salmón",
                description = "Corte fino de salmón fresco sobre arroz avinagrado",
                imageUrl = "https://images.unsplash.com/photo-1553621043-f607bfbf6640?q=80&w=800"
            ),
            Dish(
                id = 9,
                name = "Sopa Miso",
                description = "Caldo tradicional con tofu y algas",
                imageUrl = "https://images.unsplash.com/photo-1582450871972-ab5ca641643d?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Burger Joint",
        description = "Hamburguesas clásicas al estilo americano",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=800",
        categories = listOf("Americana", "Hamburguesas"),
        menu = listOf(
            Dish(
                id = 10,
                name = "Classic Burger",
                description = "Carne de res, lechuga, tomate y salsa de la casa",
                imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&w=800"
            ),
            Dish(
                id = 11,
                name = "Bacon Cheese",
                description = "Doble carne, tocino crujiente y queso cheddar",
                imageUrl = "https://images.unsplash.com/photo-1586816001966-79b736744398?q=80&w=800"
            ),
            Dish(
                id = 12,
                name = "Papas Fritas Rusticas",
                description = "Papas cortadas a mano con sal de mar",
                imageUrl = "https://images.unsplash.com/photo-1576107232684-1279f390859f?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Green Bowl",
        description = "Opciones saludables, veganas y orgánicas",
        imageUrl = "https://images.unsplash.com/photo-1490645935967-10de6ba17061?q=80&w=800",
        categories = listOf("Saludable", "Vegana"),
        menu = listOf(
            Dish(
                id = 13,
                name = "Ensalada de Quinoa",
                description = "Quinoa, vegetales asados y aderezo de limón",
                imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=800"
            ),
            Dish(
                id = 14,
                name = "Acai Bowl",
                description = "Acai orgánico, granola artesanal y frutas de temporada",
                imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed35a4d7?q=80&w=800"
            ),
            Dish(
                id = 15,
                name = "Avocado Toast",
                description = "Pan de masa madre, aguacate y semillas de chía",
                imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Pasta Nostra",
        description = "La pasta fresca de la abuela en tu mesa",
        imageUrl = "https://images.unsplash.com/photo-1551183053-bf91a1d81141?q=80&w=800",
        categories = listOf("Italiana", "Pastas"),
        menu = listOf(
            Dish(
                id = 16,
                name = "Spaghetti Carbonara",
                description = "Pasta con guanciale, pecorino romano y pimienta negra",
                imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?q=80&w=800"
            ),
            Dish(
                id = 17,
                name = "Lasagna Boloñesa",
                description = "Capas de pasta con carne molida, salsa de tomate y bechamel",
                imageUrl = "https://images.unsplash.com/photo-1619881589316-56c7f9e6b587?q=80&w=800"
            ),
            Dish(
                id = 18,
                name = "Tiramisú",
                description = "Postre clásico de café, mascarpone y cacao",
                imageUrl = "https://images.unsplash.com/photo-1571115177098-24ec42ed204d?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "La Taquería VIP",
        description = "Antojitos mexicanos con un toque gourmet",
        imageUrl = "https://images.unsplash.com/photo-1504834636651-046624302d59?q=80&w=800",
        categories = listOf("Mexicana", "Fusión"),
        menu = listOf(
            Dish(
                id = 19,
                name = "Burrito Asado",
                description = "Tortilla de harina rellena de carne asada, frijoles y queso",
                imageUrl = "https://images.unsplash.com/photo-1626700051175-6818013e1d4f?q=80&w=800"
            ),
            Dish(
                id = 20,
                name = "Quesadillas de Flor",
                description = "Flor de calabaza y quesillo derretido",
                imageUrl = "https://images.unsplash.com/photo-1599974579688-8dbdd335c77f?q=80&w=800"
            ),
            Dish(
                id = 21,
                name = "Nachos Supremos",
                description = "Totopos cubiertos de queso, jalapeños y crema",
                imageUrl = "https://images.unsplash.com/photo-1513456811591-6490ea9105b0?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 8,
        name = "Tokyo Street",
        description = "Sabor urbano directamente desde Japón",
        imageUrl = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?q=80&w=800",
        categories = listOf("Japonesa", "Asiática"),
        menu = listOf(
            Dish(
                id = 22,
                name = "Tonkotsu Ramen",
                description = "Fideos artesanales en caldo de cerdo con chashu",
                imageUrl = "https://images.unsplash.com/photo-1557872943-16a5ac26437e?q=80&w=800"
            ),
            Dish(
                id = 23,
                name = "Takoyaki",
                description = "Bolas de pulpo rebozadas con salsa especial",
                imageUrl = "https://images.unsplash.com/photo-1605333396914-2314d200d720?q=80&w=800"
            ),
            Dish(
                id = 24,
                name = "Gyoza de Cerdo",
                description = "Empanadillas japonesas rellenas de carne y vegetales a la plancha",
                imageUrl = "https://images.unsplash.com/photo-1496116218417-1a781b1c416c?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 9,
        name = "Sweet Tooth",
        description = "Para los verdaderos amantes del azúcar",
        imageUrl = "https://images.unsplash.com/photo-1551024601-bec78aea704b?q=80&w=800",
        categories = listOf("Postres", "Cafetería"),
        menu = listOf(
            Dish(
                id = 25,
                name = "Cheesecake de Frambuesa",
                description = "Pastel de queso cremoso con mermelada casera",
                imageUrl = "https://images.unsplash.com/photo-1533134242443-d4fd215305ad?q=80&w=800"
            ),
            Dish(
                id = 26,
                name = "Brownie Volcán",
                description = "Bizcocho de chocolate caliente con helado de vainilla",
                imageUrl = "https://images.unsplash.com/photo-1606313564200-e75d5e30476c?q=80&w=800"
            ),
            Dish(
                id = 27,
                name = "Macarons Franceses",
                description = "Surtido de 6 macarons de diferentes sabores",
                imageUrl = "https://images.unsplash.com/photo-1569864358642-9d1684040f43?q=80&w=800"
            )
        )
    ),
    Restaurant(
        id = 10,
        name = "Steakhouse 99",
        description = "Los mejores cortes de carne a la parrilla",
        imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800",
        categories = listOf("Americana", "Carnes"),
        menu = listOf(
            Dish(
                id = 28,
                name = "Ribeye Steak",
                description = "Corte grueso de ribeye asado a tu gusto",
                imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462?q=80&w=800"
            ),
            Dish(
                id = 29,
                name = "BBQ Ribs",
                description = "Costillas de cerdo bañadas en salsa BBQ",
                imageUrl = "https://images.unsplash.com/photo-1529193591184-b1d58069ecdd?q=80&w=800"
            ),
            Dish(
                id = 30,
                name = "Mashed Potatoes",
                description = "Puré de papa rústico con mantequilla y ajo",
                imageUrl = "https://images.unsplash.com/photo-1622370773663-8d07f354fdb1?q=80&w=800"
            )
        )
    )
)