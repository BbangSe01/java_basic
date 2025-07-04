package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(10000);
        acc.withdraw(9000);
        acc.withdraw(2000);
        System.out.println("잔고: "+acc.balance);
    }
}
