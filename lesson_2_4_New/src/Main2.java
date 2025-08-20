// Интерфейс для геометрической фигуры
interface GeometricFigure {
    double calculateArea();
    // Дефолтный метод для расчета периметра (можно переопределить при необходимости)
    default double calculatePerimeter() {
        return 0.0; // Базовая реализация, возвращает 0.0
    }

    String getFillColor();
    String getBorderColor();
}

// Интерфейс для установки цветов
interface Colorable {
    void setFillColor(String color);
    void setBorderColor(String color);
}

// Класс Круг
class Circle implements GeometricFigure, Colorable {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
        this.fillColor = "White"; // Цвет по умолчанию
        this.borderColor = "Black"; // Цвет по умолчанию
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
}

// Класс Прямоугольник
class Rectangle implements GeometricFigure, Colorable {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.fillColor = "White";
        this.borderColor = "Black";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
}

// Класс Треугольник
class Triangle implements GeometricFigure, Colorable {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = "White";
        this.borderColor = "Black";

    }

    @Override
    public double calculateArea() {
        // Формула Герона для площади треугольника
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Создание фигур
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Установка цветов
        circle.setFillColor("Red");
        circle.setBorderColor("Blue");

        rectangle.setFillColor("Green");
        rectangle.setBorderColor("Yellow");

        triangle.setFillColor("Purple");
        triangle.setBorderColor("Orange");

        // Вывод информации о фигурах
        printFigureInfo("Круг", circle);
        printFigureInfo("Прямоугольник", rectangle);
        printFigureInfo("Треугольник", triangle);
    }

    // Метод для вывода информации о фигуре
    public static void printFigureInfo(String figureName, GeometricFigure figure) {
        System.out.println("Фигура: " + figureName);
        System.out.println("Периметр: " + figure.calculatePerimeter());
        System.out.println("Площадь: " + figure.calculateArea());
        System.out.println("Цвет фона: " + figure.getFillColor());
        System.out.println("Цвет границ: " + figure.getBorderColor());
        System.out.println("-----------------------");
    }
}
