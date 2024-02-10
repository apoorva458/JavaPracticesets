public class recursion {
    static int factorial(int n){
        //factorial(n) = n * factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("The value of factorial n is: " +factorial(n));

    }
}
