package Exam1;
 
import java.lang.Math;
class Exam6{
            public static void main(String[] args){
                        boolean seventy = true;
                        boolean eighty = true;
                        boolean ninety = true;
                        boolean ninetyFive = true;
                        boolean ninetyEight = true;
                        boolean ninetyNine = true;
 
                        double probability = 0;
                        int people = 1;
                        int top = 0;
                        double division = 0;
                        double total = 1.0;
 
                        for(int i = 2; i <= 100; i++){
                                    people++;
                                    top =  367 - people;
                                    division = top/366.0;
                                    total = total * division;
                                    probability = 1 - total;
 
                                    if(seventy && probability >= .7){
                                                seventy = false;
                                                System.out.println("At 70%, the number of people is " + people);
                                    }
                                    else if(eighty && probability >= .8){
                                                eighty = false;
                                                System.out.println("At 80%, the number of people is " + people);
                                    }
                                    else if(ninety && probability >= .9){
                                                ninety = false;
                                                System.out.println("At 90%, the number of people is " + people);
                                    }
                                    else if(ninetyFive && probability >=.95){
                                                ninetyFive = false;
                                                System.out.println("At 95%, the number of people is " + people);
                                    }
                                    else if(ninetyEight && probability >=.98){
                                                ninetyEight = false;
                                                System.out.println("At 98%, the number of people is " + people);
                                    }
                                    else if(ninetyNine && probability >=.99){
                                                ninetyNine = false;
                                                System.out.println("At 99%, the number of people is " + people);
                                    }
                        }
            }
}
 
