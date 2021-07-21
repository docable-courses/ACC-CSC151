import java.util.Scanner;

public class Chapter2Scanner {

        public static void main(String [] args) {
                Scanner in = new Scanner(System.in);
                
                System.out.println("Enter number: ");

                int num = in.nextInt();
                double aValue = in.nextDouble();
                String name = in.next();

                System.out.println("Your integer; " + num);
                System.out.println("Your double: " + aValue);
                System.out.println("Your string: " + name);
        }
}
