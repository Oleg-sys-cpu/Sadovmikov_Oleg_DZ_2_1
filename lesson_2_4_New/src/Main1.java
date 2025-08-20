//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Базовый класс Животное
class Animal {
    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

// Класс Собака, наследуется от Животного
class Dog extends Animal {
    private static int dogCount = 0;
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м. Максимальная дистанция: " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            super.swim(distance);
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м. Максимальная дистанция: " + maxSwimDistance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

// Класс Кот, наследуется от Животного
class Cat extends Animal {
    private static int catCount = 0;
    private int maxRunDistance = 200;
    private boolean isFull = false; // Добавляем поле "сытость"

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м. Максимальная дистанция: " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }

    // Метод, чтобы кот покушал из миски
    public void eat(Plate plate, int foodAmount) {
        if (!isFull && plate.getFoodAmount() >= foodAmount) {
            plate.decreaseFood(foodAmount);
            isFull = true;
            System.out.println(name + " покушал " + foodAmount + " еды и теперь сыт.");
        } else if (isFull) {
            System.out.println(name + " уже сыт.");
        } else {
            System.out.println(name + " не смог покушать, недостаточно еды в миске.");
        }
    }

    // Геттер для сытости
    public boolean isFull() {
        return isFull;
    }
}

// Класс Миска
class Plate {
    private int foodAmount;

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    // Метод для уменьшения количества еды в миске
    public void decreaseFood(int amount) {
        foodAmount -= amount;
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавили " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
    }

    public void info() {
        System.out.println("В миске: " + foodAmount + " еды.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Пример использования

        // Создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");

        // Действия животных
        dogBobik.run(400);
        dogBobik.swim(8);
        catBarsik.run(150);
        catBarsik.swim(5); // Коты не умеют плавать
        catMurzik.run(400);
        catMurzik.swim(100); // Коты не умеют плавать

        // Подсчет созданных животных
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        System.out.println("----------------------------------");

        // Расширенная задача: коты и миска

        // Создаем массив котов
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Том");
        cats[1] = new Cat("Саймон");
        cats[2] = new Cat("Леопольд");

        // Создаем миску с едой
        Plate plate = new Plate(10);
        plate.info();

        // Кормим котов
        for (Cat cat : cats) {
            cat.eat(plate, 20);
        }
        plate.info();

        // Выводим информацию о сытости котов
        System.out.println("Информация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску
        plate.addFood(10);
        plate.info();

        // Пробуем еще раз покормить кота
        cats[0].eat(plate, 20); //Том теперь сыт

        // Пробуем еще раз покормить кота
        cats[1].eat(plate, 20); //Саймон голодный

        //Пробуем кота который точно голоден
        cats[2].eat(plate, 20); //Леопольд голодный
        plate.info();

    }
}