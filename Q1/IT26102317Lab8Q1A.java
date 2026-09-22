import java.util.Scanner;

public class IT26102317Lab8Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        int i = 0;
        while (i < 5) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
            i++;
        }

        System.out.println("\nArray in Reverse Order:");
        for (int k = 4; k >= 0; k--) {
            System.out.print(myArray[k] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}