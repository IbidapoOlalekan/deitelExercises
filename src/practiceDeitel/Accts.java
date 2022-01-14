package practiceDeitel;

import com.sun.security.jgss.GSSUtil;

import java.security.PublicKey;

public class Accts {
    private String name;
    private double balance;
    private int day;
    private int month;
    private int year;

//
//    public Accts(String name, double balance, int day,int month, int year){
//        this.name= name;
//        this.balance = balance;
//        this.day = day;
//        this.month = month;
//        this.year = year;
//            }

            public void setName(String name){
                    this.name = name;
            }
            public String getName(){
            return name;
            }

            public void deposit(double depositAmount){
                if (depositAmount <= 0.0){
                    depositAmount = 0;
                    this.balance  = balance;
                    System.out.println("Deposit Cannot Be Negative");
                }
              balance =   depositAmount +  balance;
                this.balance = balance;
            }

            public double getBalance(){
                return balance;
            }

            public void setDay(int day){
                this.day = day;
            }
            public int getDay(){
                return day;
            }
            public void setMonth(int month){
                this.month= month;
            }
            public int getMonth(){
                return  month;
            }
            public void setYear(int year){
            this.year = year;
            }
            public int getYear(){
            return year;
            }

            public String displayDateOfBirth(){
                String day = String.valueOf(getDay());
                String month = String.valueOf(getMonth());
                String year = String.valueOf(getYear());
                return day+"/"+ month + "/" + year;
            }

            public void withdrawal(double withdrawalAmount){
                if (withdrawalAmount > balance){
                    System.out.println("Account balance Exceeded");
                    withdrawalAmount = 0;
                }
                if (withdrawalAmount < 0.0) {
                    System.out.println("Withdrawal Cannot Be Negative");
                    withdrawalAmount = 0.0;
                }

                balance = balance - withdrawalAmount;
            }

}
