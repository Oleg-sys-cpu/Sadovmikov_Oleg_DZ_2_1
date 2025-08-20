public class productArrayExample {
    public static void main(String[] args) {
        // 1. Объявление массива объектов Product
        Product[] productsArray = new Product[5];

        // 2. Создание объектов Product и присваивание их элементам массива
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599.99, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024", "Apple Inc.", "USA", 6299.00, false);
        productsArray[2] = new Product("Sony Bravia OLED TV", "01.08.2023", "Sony Corp.", "Japan", 3499.50, true);
        productsArray[3] = new Product("Dell XPS 15 Laptop", "10.05.2024", "Dell Inc.", "USA", 2799.75, false);
        productsArray[4] = new Product("Nintendo Switch OLED", "20.10.2021", "Nintendo Co.", "Japan", 349.99, false);

        // 3.  (Дополнительно) Вывод информации о каждом товаре из массива
        System.out.println("Информация о товарах:");
        for (Product product : productsArray) {
            product.printProductInfo(); // Предполагается, что в классе Product есть метод printProductInfo()
            System.out.println("--------------------"); // Разделитель для лучшей читаемости
        }
    }
}
