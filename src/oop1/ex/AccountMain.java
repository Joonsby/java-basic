package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.amount = 10000;
        account.deposit();
        account.amount = 9000;
        account.withdraw();
        account.amount = 2000;
        account.withdraw();
    }
}
