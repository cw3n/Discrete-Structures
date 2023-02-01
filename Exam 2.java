package Exam1;
 
import java.lang.Math.*;
 
public class Exam2{
            public static void main(String[] args){
                        /*Use the cashier's algorithm.
                        Develop a program that randomly selects a total charge.
                        Then randomly select a payment
                        in dollars and cents that exceeds that charge.
                        Then have the program calculate the change
                        in pennies, nickels, dimes, quarters, ones, fives, and twenties.
                        Bonus points for anyone who writes a program that can "Count change back."*/
 
                int twenties = 0;
                int tens = 0;
                int fives = 0;
                int ones = 0;
                int quarters = 0;
                int dimes = 0;
                int nickels = 0;
                int pennies = 0;
 
                        boolean moreChange = true;
                String change = "";
 
                double moneyDue = getMoney();
                double moneyPaid = getMoney();
                        while(moneyPaid < moneyDue){
                                    moneyPaid = getMoney();
                        }
                double changeDue = moneyPaid - moneyDue;
                        changeDue = Math.round(changeDue*100.0)/100.0;
 
                        System.out.println("Did you find everything okay?");
                System.out.println("Amount due: $" + moneyDue + "\n" +
                "Money paid: $" + moneyPaid + "\n" + "Change due: $" + changeDue);
 
                while(moreChange){
                                    if(changeDue < 0.01){
                                                moreChange = false;
                                    }
                            changeDue = Math.round(changeDue*100.0)/100.0;
                        while(changeDue >= 20){
                                twenties++;
                                changeDue -= 20;
                        }
                        while(changeDue >= 10){
                                tens++;
                                changeDue -= 10;
                        }
                        while(changeDue >= 5){
                                fives++;
                                changeDue -= 5;
                        }
                        while(changeDue >= 1){
                                ones++;
                                changeDue -= 1;
                        }
                        while(changeDue >= 0.25){
                                quarters++;
                                changeDue -= 0.25;
                        }
                        while(changeDue >= 0.1){
                                dimes++;
                                changeDue -= 0.1;
                        }
                        while(changeDue >= 0.05){
                                nickels++;
                                changeDue -= 0.05;
                        }
                        while(changeDue >= 0.01){
                                pennies++;
                                changeDue -= 0.01;
                        }
                }
 
                        change = getChange(twenties, tens, fives, ones, quarters, dimes, nickels, pennies, change);
 
                        System.out.println("Here is your change");
                        System.out.println("Change: " + change);
 
                        countChange(twenties, tens, fives, ones, quarters, dimes, nickels, pennies, moneyDue, moneyPaid);
                        System.out.println("Thank you, Now go away");
        }
 
            public static double getMoney(){
                        double money = Math.round((Math.random()*100.0)*100.0)/100.0;
                        return money;
            }
 
            public static String getChange(int twenties, int tens, int fives, int ones, int quarters,
                                                            int dimes, int nickels, int pennies, String change){
                if(twenties > 0){
                        change += "Twenties: " + twenties + ", ";
                }
                if(tens > 0){
                        change += "Tens: " + tens + ", ";
                }
                if(fives > 0){
                        change += "Fives: " + fives + ", ";
                }
                if(ones > 0){
                        change += "Ones: " + ones + ", ";
                }
                if(quarters > 0){
                        change += "Quarters: " + quarters + ", ";
                }
                if(dimes > 0){
                        change += "Dimes: " + dimes + ", ";
                }
                if(nickels > 0){
                        change += "Nickels: " + nickels + ", ";
                }
                if(pennies > 0){
                        change += "Pennies: " + pennies + ", ";
                }
 
                        return change;
            }
 
            public static void countChange(int twenties, int tens, int fives, int ones, int quarters,
                                                            int dimes, int nickels, int pennies, double moneyDue, double moneyPaid){
                        boolean stillMoney = true;
 
                        moneyDue = Math.round(moneyDue*100.0)/100.0;
                        System.out.println("$" + moneyDue);
 
                        while(stillMoney){
                                    if(moneyPaid == moneyDue){
                                                stillMoney = false;
                                    }
 
                                    while(pennies > 0){
                                                moneyDue += .01;
                                                pennies -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(nickels > 0){
                                                moneyDue += .05;
                                                nickels -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(dimes > 0){
                                                moneyDue += .1;
                                                dimes -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(quarters > 0){
                                                moneyDue += .25;
                                                quarters -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(ones > 0){
                                                moneyDue += 1;
                                                ones -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(fives > 0){
                                                moneyDue += 5;
                                                fives -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(tens > 0){
                                                moneyDue += 10;
                                                tens -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                                    while(twenties > 0){
                                                moneyDue += 20;
                                                twenties -= 1;
                                                moneyDue = Math.round(moneyDue*100.0)/100.0;
                                                System.out.println("$" + moneyDue);
                                    }
                        }
            }
}
