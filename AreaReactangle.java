import java.util.Scanner;
public class AreaReactangle {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.print("enter the length of recatangle ");
        double length = abc.nextDouble();

        System.out.print("enter the breadth of the rectangle ");
        double breadth = abc.nextDouble();

        double area = length*breadth;
        System.out.print("The area of rectangle is "+area);

        abc.close();

    }

}

