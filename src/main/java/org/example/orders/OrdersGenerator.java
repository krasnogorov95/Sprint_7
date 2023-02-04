package org.example.orders;

public class OrdersGenerator {
    public static Orders getDefault() {
        return new Orders("Иван",
                "Иванов",
                "ул. Пушкина, д. Колотушкина",
                "Планерная",
                "+7 800 555 35 35",
                5,
                "2020-06-06",
                "Тест"
        );
    }
}
