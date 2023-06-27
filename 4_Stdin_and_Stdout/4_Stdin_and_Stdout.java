import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner venky = new Scanner(System.in);
        
        int i = venky.nextInt();
        double d = venky.nextDouble();
        venky.nextLine();
        String s = venky.nextLine(); 

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
