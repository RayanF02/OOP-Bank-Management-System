import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Bank bankMang = new Bank();

        bankMang.addUser(new SilverUser("Silver Pack", "Demo Silver", 1001, "Jan/01/2000", 21000));
        bankMang.addUser(new GoldUser("Gold Pack", "Demo Gold", 1002, "Jan/01/2000", 18000));
        bankMang.addUser(new PlatinumUser("Platinum Pack", "Demo Platinum", 1003, "Jan/01/2000", 37000));

        Scanner input = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Welcome to the Bank Management System:");
                System.out.println("1: Create a new user");
                System.out.println("2: Update system data");
                System.out.println("3: Display all data for all users");
                System.out.println("4: Withdraw");
                System.out.println("5: Deposit");
                System.out.println("6: Exit program");

                int num;

                try {
                    num = input.nextInt();
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input, please try again.\n");
                    input.nextLine();
                    continue;
                }

                switch (num) {
                    case 1:
                        System.out.println("Creating a new user:");

                        System.out.println("Enter first and last name:");
                        String name = input.nextLine();

                        System.out.println("Enter ID number:");
                        int id = input.nextInt();
                        input.nextLine();

                        if (bankMang.idCheck(id)) {
                            System.out.println("ID already exists, please choose a new ID\n");
                            break;
                        }

                        System.out.println("Enter date of birth:");
                        String birthDate = input.nextLine();

                        System.out.println("Enter initial amount to deposit:");
                        double amount = input.nextDouble();
                        input.nextLine();

                        if (amount <= SilverUser.getMaxDeposit()) {
                            bankMang.addUser(new SilverUser("Silver Pack", name, id, birthDate, amount));
                        } else if (amount < PlatinumUser.getMinDeposit()) {
                            bankMang.addUser(new GoldUser("Gold Pack", name, id, birthDate, amount));
                        } else {
                            bankMang.addUser(new PlatinumUser("Platinum Pack", name, id, birthDate, amount));
                        }

                        break;

                    case 2:
                        System.out.println("Enter file name:");
                        String fileName = input.nextLine();
                        bankMang.writeToFile(fileName);
                        break;

                    case 3:
                        System.out.println("Enter file name:");
                        String fileName3 = input.nextLine();
                        bankMang.readFromFile(fileName3);
                        break;

                    case 4:
                        System.out.println("Enter ID number:");
                        int idInput = input.nextInt();

                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = input.nextDouble();
                        input.nextLine();

                        bankMang.withdraw(idInput, withdrawAmount);
                        break;

                    case 5:
                        System.out.println("Enter ID number:");
                        int idInput5 = input.nextInt();

                        System.out.println("Enter amount to deposit:");
                        double depositAmount = input.nextDouble();
                        input.nextLine();

                        bankMang.deposit(idInput5, depositAmount);
                        break;

                    case 6:
                        System.out.println("Exited program");
                        return;

                    default:
                        System.out.println("Invalid menu option.\n");
                }
            }
        } finally {
            input.close();
        }
    }
}
