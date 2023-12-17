package day23_array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZerosLast {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> NumZero = new ArrayList<>();

  nums.removeAll(Arrays.asList(0));

        NumZero.addAll(nums);

        System.out.println(NumZero);

        for (int i = 0; i < nums.size(); i++) {
            NumZero.add(0);

        }
        System.out.println(NumZero);










    }
}
/*
 Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */