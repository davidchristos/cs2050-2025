import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChristosGE01Polymorphism {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/davidchristos/IdeaProjects/ChristosGE01Polymorphism/Animals.txt"); // Absolute path
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Check the path.");
            e.printStackTrace();
        }
    }
}
// Superclass: Animal
class Animal {
    private String name;
    private String food;
    private int weight;
    private int sleep;
    private String location;

    // Constructor
    public Animal(String name, String food, int weight, int sleep, String location) {
        this.name = name;
        this.food = food;
        this.weight = weight;
        this.sleep = sleep;
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getWeight() {
        return weight;
    }

    public int getSleep() {
        return sleep;
    }

    public String getLocation() {
        return location;
    }

    // Methods
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping - do not disturb");
    }

    public void swim() {
        System.out.println("Animal is swimming");
    }

    // Override toString() to display animal details
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Name: " + name + " - Weighs: " + weight + " lbs - Sleeps: " + sleep + " hours - Location: " + location;
    }
}

// Subclass: Bear
class Bear extends Animal {
    public Bear(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }

    @Override
    public void eat() {
        System.out.println("Bear is eating " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Bear is sleeping " + getSleep() + " hours");
    }

    @Override
    public void swim() {
        System.out.println("Bear is swimming");
    }
}

// Subclass: Elephant
class Elephant extends Animal {
    public Elephant(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping " + getSleep() + " hours");
    }
}

// Subclass: Monkey
class Monkey extends Animal {
    public Monkey(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }

    @Override
    public void eat() {
        System.out.println("Monkey is eating " + getFood());
    }

    @Override
    public void swim() {
        System.out.println("Monkey is swimming");
    }
}

// Subclass: Sloth
class Sloth extends Animal {
    public Sloth(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }
}