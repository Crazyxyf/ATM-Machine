package com.company;
import java.util.*;
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;

    public void checkpin(){
        System.out.println("Enter your 4 digit pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }else{
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Balance");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt==1){
            checkBalance();
        }else if(opt==2){
            withdrawMoney();
        }else if(opt==3){
            depositMoney();
        }else if(opt == 4){
            return;
        }else{
            System.out.println("enter a valid option");
        }
    }

    public void checkBalance(){
        System.out.println("Balance :" + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount To Withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance-=amount;
            System.out.println("Withdrawn Succcesfull");
        }
        menu();
    }

    public void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        float amount = sc.nextFloat();
        Balance +=amount;
        System.out.println("Money deposited successfully");
        menu();
    }
}

public class AtmMachine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
