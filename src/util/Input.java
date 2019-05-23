package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String input = getString("(yes/no)");
        return input.charAt(0) == 'y';
    }

    public int getInt(int min, int  max) {
        int num = getInt();

        if (num < min || num > max) {
            System.out.println("Error, outside of the boundaries.");
            return getInt(min, max);
        }
        return num;
    }

        public int getInt(){
            return Integer.parseInt(getString());
        }

        public double getDouble(){
        return Double.parseDouble(getString("Please Enter a Decimal"));
    }

    public double getDouble(double min, double max){
        double num = getDouble();

        if (num < min || num > max) {
            System.out.println("Error, must be inside the boundaries.");
            return getDouble(min, max);
        }
        return num;
    }


//
//    public boolean yesNo(){
//        System.out.println("Please enter a true or false value;");
//        return if(getString().equals("yes"));
//    }
//
//    public int getInt(int min, int max){
//        System.out.println("Please Enter Two Integers");
//        return scanner.nextInt();
//    }
//
//    public double getInt(){
//        System.out.println("Please enter an integer");
//        return scanner.nextInt();
//    }
//    public double getDouble(double min, double max){
//        System.out.println("Please Enter two integers");
//        return getInt();
//    }
//
//    public double getDouble(){
//        System.out.println("Please Enter Two Integers");
//        return scanner.nextDouble();
//    }
}

