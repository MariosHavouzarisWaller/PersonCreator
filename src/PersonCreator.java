public class PersonCreator {

    public static void main(String[] args) {

        // Creating new people using the Person object
        Person Person01 = new Person("James", "Peterson", 34, 180, 73.5, true);
        Person Person02 = new Person("Bob", "Thornley", 25, 171, 68.2, false);

        // Output
        System.out.println("Name: " + Person01.getFirstName() + " " + Person01.getLastName() + "\nAge: " + Person01.getAge() +
                "\nHeight: " + Person01.getHeight() + "cm\nWeight: " + Person01.getWeight() + "lbs");
        System.out.println("\nName: " + Person02.getFirstName() + " " + Person02.getLastName() + "\nAge: " + Person02.getAge() +
                "\nHeight: " + Person02.getHeight() + "cm\nWeight: " + Person02.getWeight() + "lbs");
    }
}
