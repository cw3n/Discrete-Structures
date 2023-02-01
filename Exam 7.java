package Exam1;
 
import java.lang.Math.*;
class Exam7{
            public static void main(String[] args){
/*                      Write a program to find as many prime Fibonacci numbers as you can.
                        Bonus points will be given for the largest lists.*/
                        fibonacciSequence();
            }
            public static void fibonacciSequence(){
                        long one = 0;
                        long two = 1;
                        long three = 1;
                        boolean isPrime = true;
                        while(three >= 1){
                                    three = one + two;
                                    one = two;
                                    two = three;
                                    isPrime = checkPrime(three);
                                    if(isPrime){
                                                System.out.println(three + " is prime");
                                    }
                        }
            }
 
            public static boolean checkPrime(long fibNum){
                        long check = (long)(Math.ceil(Math.sqrt(fibNum)));
                        if(fibNum == 1 || fibNum == 2){
                                    return true;
                        }
                        for(long i = 999999999; i <= check; i++){
                                    if(fibNum%i == 0){
                                                return false;
                                    }
                        }
                        return true;
            }
}
