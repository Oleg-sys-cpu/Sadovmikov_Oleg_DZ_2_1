public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    // Конструктор класса
    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    // Метод для вывода информации об объекте в консоль
    public void printProductInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронирован" : "Не забронирован"));
    }

    // Геттеры (если необходимо)
    public String getName() {
        return name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    // Сеттеры (если необходимо изменить значения полей после создания объекта)
    public void setName(String name) {
        this.name = name;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public static void main(String[] args) {
        // Пример использования класса Product
        Product myProduct = new Product("Пример товара", "01.01.2024", "Пример Производитель", "Пример Страна", 100.00, false);

        // Вывод информации о товаре
        myProduct.printProductInfo();
    }
}
