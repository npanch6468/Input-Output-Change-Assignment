import java.util.Scanner;
public class inputOutputChangeAssignment {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print( "First Double " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second Double " );
        num2 = keyboard.nextDouble();

        num3 = (num1 + num2)/2;
        System.out.println("The average value is : " + num3);
    }
}
