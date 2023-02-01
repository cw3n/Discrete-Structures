package Exam1;
 
class OperationsCounter{
 
            private int ifCount = 0;
            private int arithmiticCount = 0;
            private long startTime = 0;
            private long stopTime = 0;
            private int assignmentCount = 0;
 
            public void increaseIf(){
                        this.ifCount++;
            }
            public void increaseArithmitic(int operations){
                        this.arithmiticCount += operations;
            }
            public void increaseAssignmentOperations(int i){
                        this.assignmentCount += i;
            }
 
            public int getIfCount(){
                        return ifCount;
            }
            public int getAddCount(){
                        return this.arithmiticCount;
            }
            public int getAssignment(){
                        return this.assignmentCount;
            }
 
            public void resetCount(){
                        this.ifCount = 0;
                        this.arithmiticCount = 0;
            }
 
            //Timer
            public void startTimer(){
                        this.startTime = System.currentTimeMillis();
            }
            public void stopTimer(){
                        this.stopTime = System.currentTimeMillis();
            }
            public long getTime(){
                        long time = (this.stopTime - this.startTime);
                        return time;
            }
}
 
Code:
package Exam1;
 
public class Exam4{
            public static void main(String[] args){
                        OperationsCounter recursiveStats = new OperationsCounter();
                        OperationsCounter iterativeStats = new OperationsCounter();
 
                        System.out.println("Recursive");
 
                        for(int num = 10; num <= 45; num+=5){
                                    recursiveStats.startTimer();
                                    System.out.print("R " + num + "th fib: " + fib(num, recursiveStats)
                                                + ", ifs: " + recursiveStats.getIfCount()
                                                + ", + or -: " + recursiveStats.getAddCount());
                                    recursiveStats.stopTimer();
                                    System.out.println(", millis: " + recursiveStats.getTime());
                                    recursiveStats.resetCount();
                        }
 
 
                        System.out.println("Iterative");
                        for(int num = 10; num <= 45; num+=5){
                                    iterativeStats.startTimer();
                                    System.out.print("I " + num +"th fib: " + fibIt(num, iterativeStats)
                                                + ", ifs: " + iterativeStats.getIfCount()
                                                + ", + or -: " + iterativeStats.getAddCount()
                                                + ", =: " + iterativeStats.getAssignment());
                                    iterativeStats.stopTimer();
                                    System.out.println(", millis: " + iterativeStats.getTime());
                                    iterativeStats.resetCount();
                        }
            }
 
            private static long fib(long n, OperationsCounter recursiveStats){
                        if((n == 0) || (n == 1)){
                                    recursiveStats.increaseIf();
                                    return n;
                        }
                        else{
                                    recursiveStats.increaseArithmitic(3);
                                    return fib(n-1, recursiveStats) + fib(n-2, recursiveStats);
                        }
            }
 
            private static long fibIt(int n, OperationsCounter iterativeStats){
                        int numberOne, numberTwo = 0, currentNumber = 1;
 
                        iterativeStats.increaseAssignmentOperations(3);
                        iterativeStats.increaseIf();
 
                        for(int i = 1; i < n; i++){
                                    iterativeStats.increaseAssignmentOperations(1);
                                    iterativeStats.increaseIf();
 
                                    numberOne = numberTwo;
                                    numberTwo = currentNumber;
                                    currentNumber = numberOne + numberTwo;
 
                                    iterativeStats.increaseAssignmentOperations(3);
                                    iterativeStats.increaseArithmitic(1);
                        }
                        return currentNumber;
            }
}
