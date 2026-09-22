import java.util.Scanner;

public class IT26102317Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int input = sc.nextInt();

            if (input <= 0) {
                System.out.println("Error Message");
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = input;
                count++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        sc.close();
    }
}