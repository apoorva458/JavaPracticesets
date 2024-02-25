package calc;

class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is:" + a+b);
    }
}
class Sccalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is:" + Math.sin(a+b));
    }
}
class Hycalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: " + a+b);
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}

public class problem2{
    public static void main(String[] args) {
        System.out.println("I m main method!");
    }
}
