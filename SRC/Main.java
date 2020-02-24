import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String firstname;
        String Lastname;
        String[] contactno = new String[3];
        defination definte = new defination();
        System.out.println("welcome to Priyanshu's Contact list");
        System.out.println("Press 1 for adding the contact\n" +
                "Press 2 for viewing all the contacts\n" +
                "Press 3 for searching in the contacts\n" +
                "Press 4 to delete the contacts\n" +
                "Press 5 to exit from the menu option ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("You have chosen to add the contact details" +
                        "\nPlease enter the Name");
                System.out.println("First name");
                firstname = scanner.next();
                System.out.println("Last name");
                Lastname = scanner.next();
                System.out.println("Please enter the contact no");
                contactno[0] = scanner.next();
                System.out.println("Would you like to add another contact number? (yes/no)");
                char choice = scanner.next().charAt(0);
                if (choice == 'y') {
                    System.out.println("please enter another contact no");
                    contactno[1] = scanner.next();
                } else {
                    contactno[1] = null;
                }
                System.out.println("Enter the email");
                String email = scanner.next();
                Person person = new Person(firstname, Lastname, contactno, email);
                definte.add(person);
                System.out.println("Contact added \n" +
                        "First name:" + firstname + "\nlastname:" + Lastname + "\n email:" + email +
                        "\nContact no");
                for (int i = 0; i < 3; i++) {
                    System.out.print(contactno[i]);
                }
                break;

            case 2:
                definte.viewAllDetails();
                break;
            case 3:
                scanner.nextLine();
                System.out.println("you could search from the first Names");
                String str = scanner.nextLine();
                definte.search(str);
            case 4:
                System.out.println("Enter the contact to be deleted ");
                int n = scanner.nextInt();
                definte.delete(n - 1);
                break;
            case 5:
                System.out.println("Exit done, Thank you for the visting");
                break;
            default:
                System.out.println("Invalid input given I am sorry");
        }


    }
}