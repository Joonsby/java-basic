package oop1.ex;

public class Account {
    int balance = 0;
    int amount = 0;

    void deposit() {
        balance += amount;
        System.out.println(amount + "원 입금 완료.");
        System.out.println("통장 잔고 : " + balance);
    }

    void withdraw() {
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else{
            balance -= amount;
            System.out.println(amount + "원 출금 완료.");
        }
        System.out.println("통장 잔고 : " + balance);
    }
}
