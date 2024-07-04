package ArrayList;

import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Heap ke aandar aak khali list bana hoga;

        // add -- last me add karega
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // add at a index
        // range will be from 0 to size of list
        list.add(0, 30);
        System.out.println(list);
        System.out.println(list.size());

        // delete
        // range from 0 to size-1
        System.out.println(list.remove(1));
        list.add(50);
        list.add(-20);
        System.out.println(list);

        // Get method
        System.out.println(list.get(3));

        // Set-->update index pe jakar
        list.set(1, -5);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Enhanced loop
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Enhanced loop in array
        int arr[] = { 10, 20, 30 };
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // enhanced loop in 2D array
        int arr1[][] = new int[2][3];
        for (int[] a1 : arr1) {
            for (int i : a1) {
                System.out.println(i);
            }
        }
    }
}
