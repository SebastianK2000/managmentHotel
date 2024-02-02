public class Guest {
    private String name;
    private String lastName;
    private int age;
    private int numberRoom;
    private String meal;
    private int phoneNumber;

    public Guest(String name, String lastName, int age, int numberRoom, String meal, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.numberRoom = numberRoom;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void displayGuestInformation () {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Numer pokoju: " + numberRoom);
        System.out.println("Potrawa: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
    }


}
