import java.util.Scanner;
public class practiceset2 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
        //question2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //decrypting the above grade
        grade = (char)(grade - 8);
        System.out.println(grade);
        //question3
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(c>8);
        //question4
        float v = 10;
        float u = 2;
        float m = 5;
        float s = 4;
        float d = (v * v - u * u) / (2 * m * s);
        System.out.println(d);
        //question5
        int x = 7;
        int y = 7*49/7+35/7;
        System.out.println(y);


    }
}
