import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements FileOperation, Transactions {
    private ArrayList<User> users;

    public Bank() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean idCheck(int input) {
        for (User user : users) {
            if (user.getId() == input) {
                return true;
            }
        }
        return false;
    }

    public void writeToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, false);

            for (User user : users) {
                writer.append(user.toString()).append("\n");
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing to file\n");
        }
    }

    public void readFromFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            Scanner reader = new Scanner(fr);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File does not exist or cannot be located\n");
        }
    }

    public double withdraw(int idInput, double withdrawAmount) {
        for (User user : users) {
            if (idInput == user.getId()) {
                if (withdrawAmount > user.getMaxWithdraw() || withdrawAmount > user.getAmount()) {
                    System.out.println("Error with withdraw amount\n");
                    return user.getAmount();
                }

                double newAmount = user.getAmount() - withdrawAmount;
                user.setAmount(newAmount);
                writeToCsv(user.getId(), "-", withdrawAmount);
                return newAmount;
            }
        }

        System.out.println("User not found\n");
        return -1.0;
    }

    public double deposit(int idInput, double depositAmount) {
        for (User user : users) {
            if (idInput == user.getId()) {
                if (depositAmount <= 0) {
                    System.out.println("Deposit must be positive\n");
                    return user.getAmount();
                }

                double newAmount = user.getAmount() + depositAmount;
                user.setAmount(newAmount);
                writeToCsv(user.getId(), "+", depositAmount);
                return newAmount;
            }
        }

        System.out.println("User not found\n");
        return -1.0;
    }

    private void writeToCsv(int userId, String transactionType, double amount) {
        String csvFile = "Transaction.csv";

        try (
            FileWriter fileWriter = new FileWriter(csvFile, true);
            PrintWriter writer = new PrintWriter(fileWriter)
        ) {
            writer.println("ID: " + userId + ", " + transactionType + amount);
        } catch (IOException e) {
            System.out.println("Error writing transaction.");
        }
    }
}
