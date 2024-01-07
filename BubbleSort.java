package lab211; //Bai J1.S.0001 Lab211

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public static Scanner sn = new Scanner(System.in);
    public static Random rd = new Random();

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { //i là số lần lặp
            for (int j = 0; j < arr.length - i - 1; j++) { //j là vị trí phần tử
                if (arr[j] > arr[j + 1]) { //Đổi vị trí 2 phần tử nếu check thấy phần tử đứng sau lớn hơn
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int checkUserInput() {
        while (true) {
            try {
                String str = sn.nextLine().trim();
                int num;
                if (str.equals("")) {
                    num = 1;
                    return num;
                } else {
                    num = Integer.parseInt(str);
                    if (num > 0) {
                        return num;
                    } else {
                        System.out.println("Please enter positive input.");
                        System.out.print("Enter again: ");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int inputSizeofArray() {
        System.out.print("Enter number of array: ");
        int n = checkUserInput();
        return n;
    }

    public static int[] inputValueofArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(n);
        }
        return arr;
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int size = inputSizeofArray();
        int[] arr = inputValueofArray(size);
        System.out.println("Unsorted array: ");
        displayArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        displayArray(arr);
    }
}
