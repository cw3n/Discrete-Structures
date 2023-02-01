package Exam1;
 
import java.lang.*;
 
class Exam5{
            public static void main(String[] args){
 
 
 
                        int varieties = 3;
                        int donuts = 6;
 
                        long count = 0;
 
 
 
 
                        System.out.println("For 12 donuts, and 21 varieties");
                        donuts = 12;
                        varieties = 21;
                        count = 0;
 
 
                        System.out.println("Unique combinations: " + uniqueCount(donuts, varieties));
                        System.out.println("Total combinations: " + totalCount(donuts, varieties));
 
            
            }
 
            public static long uniqueCount(int r, int n){
                        long topTotal = 1;
                        long bottomTotal = 1;
                        long total;
                        n = n+r-1;
                        long top = n;
                        long bottomLeft = r;
                        long bottomRight = n - r;
 
                        while(top>bottomRight){
                                    topTotal *= top;
                                    top -= 1;
                        }
                        while(bottomLeft > 0){
                                    bottomTotal *= bottomLeft;
                                    bottomLeft -= 1;
                        }
                        total = topTotal/bottomTotal;
                        return total;
            }
 
            public static long totalCount(int slots, int numbers){
                        double answer = Math.pow(numbers, slots);
                        return (long)answer;
            }
}
