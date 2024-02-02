import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {

        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();
        //guests.add(name);

        System.out.println("Podaj Nazwisko gościa: ");
        String lastName = scanner.nextLine();
        //guests.add(lastName);

        System.out.println("Podaj wiek gościa: ");
        int age = scanner.nextInt();
        //guests.add(age);

        System.out.println("Podaj numer pokoju gościa: ");
        int numberRoom = scanner.nextInt();
        scanner.nextLine();
        //guests.add(numberRoom);

        System.out.println("Podaj potrawę gościa: ");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu gościa: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        //guests.add(phoneNumber);

        Guest guest = new Guest(name, lastName, age, numberRoom, meal, phoneNumber);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);

    }

    public void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu: ");
        try {
            Integer phoneNumber = Integer.valueOf(scanner.nextLine());
            Guest guest = phoneToGuest.get(phoneNumber);

            if (guest != null) {
                guest.displayGuestInformation();
            } else {
                System.out.println("Nie znaleziono gościa o podanym numerze telefonu.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Podano nieprawidłowy numer telefonu.");
        }
    }
    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInformation();
            System.out.println(" ");
        }
    }

}
