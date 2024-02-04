public class practiceset3 {
    public static void main(String[] args) {
        //question1
        String name = "Apoorva Sharan";
        System.out.println(name.toLowerCase());

        //question2
        String str = "To Lower Case";
        str = str.replace(" ", "_");
        System.out.println(str);

        //question3
        String Letter = "Dear <|name|>, Thanks a lot";
        Letter = Letter.replace(" <|name|>", "(Somename)");
        System.out.println(Letter);

        //question4
        String New = "This string contains     double and triple spaces";
        System.out.println(New.indexOf("  "));
        System.out.println(New.indexOf("   "));

        //question5
        String letter = "Dear Harry, \n\tThanks for this course.\n\tMeans a lot";
        System.out.println(letter);



    }

}
