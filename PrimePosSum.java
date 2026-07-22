// WIPRO TEST Problem-2

import java.util.Scanner;

public class PrimePosSum{
    
    private static void primeSum(int[] nums, int pos){
        int i, run=0, num=2, prime=0;
        while(run < pos){
            for(i=2; i<num; i++) if(num % i == 0) break;
            if(i==num){
                prime=num;
                num++;
                run++;
            }
            else{
                num++;
            }
        }
        for(int j=0; j<nums.length; j++) nums[j] += prime;
        for(int number: nums) System.out.print(number+" ");
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
        int pos = sc.nextInt();
        
        primeSum(nums, pos);
        
        sc.close();
    }
    
}

/*

User input will be an array and a position of a prime number.
Our work is return the sum of the array elements with that particular prime number in that position.
Example Test Case:
Input:-
size = 3
nums = [10, 20, 30]
pos = 5
Output:-
nums = [21, 31, 41]

Explanation:-
The prime numbers will be in the form of array: [2, 3, 5, 7, 11, 17]
the position is 5 and the 5th element prime-numer is = 11
the sum will be;
  nums = [10+11, 20+11, 30+11]
  nums = [21, 31, 41]
  
*/
