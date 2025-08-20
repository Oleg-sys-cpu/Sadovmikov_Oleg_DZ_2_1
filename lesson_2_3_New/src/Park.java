public class Park {
    // Внутренний класс для представления аттракциона
    public class Attraction {
        private String name;
        private String operatingHours; // Например, "10:00 - 22:00"
        private double cost;

        // Конструктор класса Attraction
        public Attraction(String name, String operatingHours, double cost) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.cost = cost;
        }

        // Геттеры для полей (если нужно)
        public String getName() {
            return name;
        }

        public String getOperatingHours() {
            return operatingHours;
        }

        public double getCost() {
            return cost;
        }

        // Сеттеры для полей (если нужно)
        public void setName(String name) {
            this.name = name;
        }

        public void setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        // Метод для вывода информации об аттракционе (для удобства)
        public void printAttractionInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + operatingHours);
            System.out.println("Стоимость: " + cost);
        }
    }

    public static void main(String[] args) {
        // Пример использования класса Park и его внутреннего класса Attraction
        Park myPark = new Park();

        // Чтобы создать объект Attraction, нужно сначала создать объект Park
        Park.Attraction rollerCoaster = myPark.new Attraction("Roller Coaster Xtreme", "11:00 - 21:00", 25.00);
        Park.Attraction ferrisWheel = myPark.new Attraction("Giant Ferris Wheel", "10:00 - 22:00", 15.00);

        // Вывод информации об аттракционах
        System.out.println("Информация об аттракционах:");
        rollerCoaster.printAttractionInfo();
        System.out.println("--------------------");
        ferrisWheel.printAttractionInfo();
    }
}
