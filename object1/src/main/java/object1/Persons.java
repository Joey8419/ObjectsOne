package object1;

public class Persons {
    // instance variables
    private String name;
    // Units for height and integer is in "centimeters"
    private int age;
    private double height;

    // defined constructor
    public Persons(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

        System.out.println(name + " is " + age + " and " +height + " cm tall" );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    // Declared and initialized a Persons object
    //Persons person1 = new Persons("Joey", 25, 152.4 );
    //Persons person2 = new Persons("Emmanuel", 37, 182.9);
    //Persons person3 = new Persons("Kamari", 8, 123.5);
}

