public class array {
    public static void main(String[] args) {
        /* array for 5 students in class*/
        //1st method
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 89;
        marks[3] = 56;
        marks[4] = 74;
        //System.out.println( marks[3]);
        //2nd method
        int [] marks1 = {90,78,67,54,67,90,89,};
        //System.out.println(marks1[5]);
        //sout then go for marks.length for finding length in array
        //displaying array using for loop
        for(int i = 0; i<marks1.length; i++){
            System.out.println(marks1[i]);

        }
        int [][] flats;
        flats = new int [2][3];// a 2-D array
        flats [0][0] = 101;
        flats[0][2] = 102;
        flats [0][3] = 103;
        flats [1][0] = 201;
        flats[1][1] = 202;
        flats [1][2] = 203;
        System.out.println("Printing a 2-D array using for loop");
        for(int i =0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
            }
        }
    }
}
