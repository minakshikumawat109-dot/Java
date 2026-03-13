import java.util.Scanner;
public class AreaSquare{
    public static void main(String[] args){

        Scanner xyz = new Scanner (System.in);

        System.out.print("Enter the side of the square ");
        double side = xyz.nextDouble();

        double area = side*side;
        System.out.println("The area of square is "+area);

        xyz.close();

    }
}
