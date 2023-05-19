package day46_AbstractClassAndInterface.animal;

public abstract class Animal {
    private String name;
    private final String breed;

    private final char gender;

    private int age;

    private String size;

    private final String color;

    public final static boolean canBreathe;

    static {
        canBreathe = true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
            System.err.println("Invalid Gender" + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Invalid Name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid Age : " + age);
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;


    }

    public abstract void eat(); // abstract class different in all animals

    public final void drink() {
        System.out.println(name + " is drinking water");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


/*Animal task:


       		Create an abstract class named Animal:
        			Variables:
        			name, breed(final), gender(final),  age, size, color(final)

        			Encapsulate all the fields

        			Add a constructor that can set all the fields

        			Methods:
        				eat(); ==> different animals eat different foods  // abstract
        				drink() ==> all the animals drink water   //
        				toString() ==> to display the full info of the animal



    Create the following subclasses of Animal:
        Dog
        eat(): eats bones

        Cat
        eat(): eats liver

        Tiger
        eat(): eats deer

        Parrot
        eat(): eats sunflower seeds

        Eagle
        eat(): eats snake
        */