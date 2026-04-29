package JDBCAssignment;
import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

public class BankingAccountManager {
    public static void main(String[] args) {

        ArrayList<Account> list = new ArrayList<>();

        list.add(new Account(1, "Rahul", 15000));
        list.add(new Account(2, "Aman", 8000));
        list.add(new Account(3, "Riya", 20000));

        System.out.println("Accounts with balance > 10000:");
        for (Account a : list) {
            if (a.balance > 10000) {
                System.out.println(a.accNo + " " + a.name + " " + a.balance);
            }
        }

        for (Account a : list) {
            if (a.accNo == 1) {
                a.balance = a.balance + 5000;
            }
        }

        for (Account a : list) {
            if (a.accNo == 2) {
                a.balance = a.balance - 2000;
            }
        }

        list.removeIf(a -> a.accNo == 3);

        System.out.println("\nFinal Accounts:");
        for (Account a : list) {
            System.out.println(a.accNo + " " + a.name + " " + a.balance);
        }
    }
}