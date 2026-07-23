// WIPRO TEST Problem-1

import java.util.Scanner;

public class MaxAndMinSumThreeNo{
   
    private static int[] maxAndMin(int n){
        int max=-1, min=9999, dig;
        while(n > 0){
            dig = n % 10;
            if(dig > max) max = dig;
            if(dig < min) min = dig;
            n /= 10;
        }
        return new int[]{max, min};
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int[] result;
        int key, maxSum=0, minSum=0, temp;
       
        for(int i=0; i<3; i++){
            temp = sc.nextInt();
            result = maxAndMin(temp);
            maxSum += result[0];
            minSum += result[1];
        }
      
        key = maxSum + minSum;
        System.out.println(key);
       
        sc.close();
    }
   
}


/*

User will provide three four digit integers we should hold three variables.
maxSum for the sum of biggest digits in all three numbers
minSum for the sum of smallest digits in all three numbers
key = maxSum + minSum
return key

Example:

num1 = 3521
num2 = 2452
num3 = 1352

maxSum = 5+5+5 = 15
minSum = 1+2+1 = 4
key = 15 + 4 = 19

*/
