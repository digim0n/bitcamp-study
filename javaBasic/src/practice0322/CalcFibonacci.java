package practice0322;

class Fibonacci{
    public int calcFibonacci(int prev1, int prev2){
        return (prev1 + prev2);
    }
}

public class CalcFibonacci {
    public static void main(String[] args){
        //Declaration
        Fibonacci calc = new Fibonacci();
        int[] fibArray = new int[21];

        //Initialize FibArray with first two values
        fibArray[0] = 0;
        fibArray[1] = 1;

        //Calculate fibonacci from 0 ~ 20
        for(int i=2; i<fibArray.length; i++){
            fibArray[i] = calc.calcFibonacci(fibArray[(i-2)], fibArray[(i-1)]);
        }

        System.out.print("11번째부터 20번째까지의 피보나치 수열은: ");
        for(int i=11; i<fibArray.length; i++){
            System.out.print(fibArray[i] + " ");
        }
    }
}
