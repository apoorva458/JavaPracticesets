public class practiceset6 {
    public static void main(String[] args) {
        //problem1
        float [] marks = {45.7f, 56.7f, 89.89f, 78.90f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum of 5 numbers is " + sum);
    //problem2
        float [] marks2 = {45.7f, 56.7f, 89.89f, 78.90f, 100.0f};
        float num  = 48.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
        //question3
        float [] marks3 = {45.7f, 56.7f, 89.89f, 78.90f, 100.0f};
        float sum3 = 0;
        for(float element:marks){
            sum3 = sum3 + element;
        }
        System.out.println("The value of avg marks  is " + sum3/marks.length);
        //question4
        int [][] mat1 = { {1,2,3},
                          {4,5,6}};
        int [][] mat2 = { {2,6,13},
                           {7,9,8}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0;i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                //System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
        //question5
        /*int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
             temp = arr[i];
             arr[i] = arr[l-i-1];
             arr[l-i-1] = temp;

        }
        for(int element:arr){
            System.out.print(element + " ");
        }*/
        //question6
        int [] arr1 = {1, 2, 3, 67, 5, 6};
        int max = 0;
        for(int e: arr1){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum value of the array is: " + max);
        //question7
        boolean isSorted = true;
        int [] arr2 = {1, 34, 4567, 789, 567};
        for(int i =0;i<arr2.length-1; i++){
            if(arr2[i] > arr2[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
