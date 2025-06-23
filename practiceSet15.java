public class practiceSet15 {
    public static void main(String[] args) {
        // Problem 1
        //String name = "Jack Parker";
        //name = name.toLowerCase();
        //System.out.println(name);

        // Problem 2
        //String text = "To My     Friend";
        //text = text.replace(" ", "_");
        //System.out.println(text);

        // Problem 3
        String name = "Dear <|name|>, Thanks a lot!";
        name = name.replace("<|name|>", "Sachin");
        System.out.println(name);


          // String ke baad jo variable dete hai woh aur next ek aur
        //variable banate hai aur jo print krte hai woh teeno same hona chahiye

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}