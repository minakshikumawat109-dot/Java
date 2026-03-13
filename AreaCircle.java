import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args){

        Scanner pqr = new Scanner(System.in);

        System.out.print("Enter the radius of a circle ");
        double radius = pqr.nextDouble();

        double pi = 3.14;
        double area = pi*radius*radius;

        System.out.print("The area of the circle is "+area);
        pqr.close();
    }
}
