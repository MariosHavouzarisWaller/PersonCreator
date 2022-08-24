public class Person {

    // Private Variables
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private double weight;

    private boolean growOlder;

    // Constructor
    public Person(String firstName, String lastName, int age, int height, double weight, boolean growOlder) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setGrowOlder(growOlder);
    }

    // Getters and Setters for Variables

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean getGrowOlder() {
        return growOlder;
    }

    public void setGrowOlder(boolean growOlder) {
        // Checks to see if the person has gotten older or not
        if (growOlder) {
            age++;
            height--;
            weight = weight - 0.5;
        }
        else
            growOlder = false;
        this.growOlder = growOlder;
    }
}
