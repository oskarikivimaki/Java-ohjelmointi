package com.example.Teh14;

public class Pankkitili {
    public String name;
    public final String accountAdress;
    public int balance;

    public Pankkitili(String name, String accountAdress, int cents) {
        this.name = name;
        this.accountAdress = accountAdress;
        this.balance = cents;
    }
    
    protected String accountData(){
        return "Name: " + this.name + ", Account Address: " + this.accountAdress + ", Balance: " + this.balance;
    }

    public void addMoney(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }
}