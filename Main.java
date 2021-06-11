package academy.learprogramming;

public class Main {

    public static void main(String[] args) {
	/*
         write your code here
        byte
        short
        int
        long
        float
        double
        char
        boolean
        */
        String myString = "This is a String";
        System.out.println("my string= " + myString);
        myString += "more";
        System.out.println("my string is now equal to=" + myString);
        myString+=" \u00A9 2019";
        System.out.println(myString);
        String numberString = "260.55";
        numberString+="49.95";
        System.out.println(numberString);
        int myInt = 5;
        String lastString="10";
        lastString+= myInt;
        System.out.println("last="+ lastString);

    }
}
