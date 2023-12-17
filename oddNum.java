package day23_array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class oddNum {

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < nums.size(); i++) {
             if (nums.get(i) %2 == 0){
                 continue;
             }else {
                nums.set(i, nums.get(i)*2);

             }

        }
        System.out.println(nums);





    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */