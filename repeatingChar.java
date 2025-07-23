// // You’re given a string where multiple characters are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :


// // Sample Test Cases

// // Input :
// // aabbbbeeeeffggg

// Output:

// a2b4e4f2g3

// Input :

// abbccccc

// Output:

// ab2c5


import java.util.Scanner;

public class repeatingChar {

    // Method left empty for you to solve
    public static String compressString(String input) {
        // Your code goes here
        StringBuilder str = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if(i < input.length() - 1 && input.charAt(i) == input.charAt(i+1)){
                count++;
            }else{
                str.append(input.charAt(i));

                if(count>1){
                    str.append(count);
                }
                count = 1;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String compressedString = compressString(input);
        System.out.println("Compressed String: " + compressedString);
    }
}
