import java.util.Scanner;

class Atm {
    private String password;
    private double accountBalance;

    Atm(String password, double accountBalance) {
        this.password = password;
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance(String enteredPassword) {
        if (checkPassword(enteredPassword)) {
            return accountBalance;
        } else {
            System.out.println("Invalid password. Unable to get account balance.");
            return 0;
        }
    }

    public void changePassword(String currentPassword, String newPassword) {
        if (checkPassword(currentPassword)) {
            password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Invalid current password. Password not changed.");
        }
    }

    public void withdrawMoney(double amount, String enteredPassword) {
        if (checkPassword(enteredPassword) && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Unable to withdraw amount.");
        }
    }

    public void depositMoney(double amount, String enteredPassword) {
        if (checkPassword(enteredPassword)) {
            accountBalance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid password. Unable to deposit amount.");
        }
    }

    private boolean checkPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Atm atm = new Atm("1234", 1000.0);

        double accountBalance = atm.getAccountBalance(password);
        if (accountBalance > 0) {
            System.out.println("Current account balance: " + accountBalance);
        }

        System.out.print("Enter current password: ");
        String currentPassword = scanner.nextLine();

        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        atm.changePassword(currentPassword, newPassword);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter password: ");
        String withdrawPassword = scanner.nextLine();
        atm.withdrawMoney(withdrawAmount, withdrawPassword);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter password: ");
        String depositPassword = scanner.nextLine();
        atm.depositMoney(depositAmount, depositPassword);

         accountBalance = atm.getAccountBalance(password);
        System.out.println("Updated account balance: " + accountBalance);

    }
}
