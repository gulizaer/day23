package day23_array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestNum {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        num.retainAll(num.subList(0,5-1));
        System.out.println(num);

        int max = Collections.max(num);
        System.out.println(max);



    }


}
/*
 write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */