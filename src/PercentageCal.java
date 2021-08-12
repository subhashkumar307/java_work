import java.util.Scanner;

public class PercentageCal {
    public static void main(String[] args) {
        System.out.println("Enter the 5 Subjects Marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum Marks of each subject 100");
        System.out.print("Enter 1st subject marks");
        int a = sc.nextInt();
        System.out.print("Enter 2nd subject marks");
        int b = sc.nextInt();
        System.out.print("Enter 3rd subject marks");
        int c = sc.nextInt();
        System.out.print("Enter 4th subject marks");
        int d = sc.nextInt();
        System.out.print("Enter 5th subject marks");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        System.out.println("Total subject marks is " + sum);
        int percentage = sum*100/500;
        System.out.println("percentage(%) :");
        System.out.println(percentage);

    }
}
