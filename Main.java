import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // THE RIGHT CHANGE THE RIGHT CHANGE THE RIGHT CHANGE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String input = scanner.next();

        //check if string is > 2 characters check if there is 0x, replace 0x with blank if true
        if (input.length() >= 2 && input.startsWith("0x")) {
            String remove = "0x";
            input = input.replace(remove, "");
        }

        //convert all to uppercase
        input = input.toUpperCase();


        double result = 0;
        int index = 0;

        /*reads through string from right to left because I want the right most character decreasing so I don't have to
        / flip all the indexes */
        for (int i = input.length()-1; i >=0; i--) {//##################################################################

            //to compare characters
            char indexChar = input.charAt(i);

            switch (indexChar) {

                case 'A':
                    result += 10.0 * (Math.pow(16, index));
                    index++;
                    break;
                case 'B':
                    result += 11.0 * (Math.pow(16, index));
                    index++;
                    break;
                case 'C':
                    result += 12.0 * (Math.pow(16, index));
                    index++;
                    break;
                case 'D':
                    result += 13.0 * (Math.pow(16, index));
                    index++;
                    break;
                case 'E':
                    result += 14.0 * (Math.pow(16, index));
                    index++;
                    break;
                case 'F':
                    result += 15.0 * (Math.pow(16, index));
                    index++;
                    break;
                default:
                    int num = (int) indexChar - 48;  // casting as an int returns ascii value. 0 char is 48 in ascii so subtract 48
                    result+= num * (Math.pow(16,index));
                    index++;
                    break;
            }
        }//#############################################################################################################
        //remove decimal
        System.out.print("Your number is " + Math.round(result) + " in decimal");
    }
}
