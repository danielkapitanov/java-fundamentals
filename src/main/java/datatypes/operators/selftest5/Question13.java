package main.java.datatypes.operators.selftest5;

/**
 * Created by daniel on 06.07.17.
 */
public class Question13 {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min,max;
        min=max=nums[0];
        int count=0;
        for (int i: nums) {
            if (nums[count]<min) min=nums[count];
            if (nums[count]>max) max=nums[count];
            count++;
        }
        System.out.println("min and max are: "+min+" "+max);
    }
}
