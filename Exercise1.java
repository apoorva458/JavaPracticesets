import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        //exercise 1 (board exm subject percentage)
        Scanner sc = new Scanner(System.in);
        System.out.println("Maths");
        float sub1 = sc.nextFloat();
        System.out.println("Social Science");
        float sub2 = sc.nextFloat();
        System.out.println("Science");
        float sub3 = sc.nextFloat();
        System.out.println("Hindi");
        float sub4 = sc.nextFloat();
        System.out.println("English");
        float sub5 = sc.nextFloat();
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println(sum);
        float average = sum*100/500;
        System.out.println("Total percentage is : " + average);
    }
}
