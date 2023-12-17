package day23_array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);


        ArrayList<Integer> num2 = new ArrayList<>(num1);
        num2.addAll(1,num1);
        System.out.println(num2);


    }
}
/*
 Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */