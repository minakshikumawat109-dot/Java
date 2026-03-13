import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args){

        Scanner mini = new  Scanner(System.in);

        System.out.print("Enter the side of the triangle ");
        double side =  mini.nextDouble();

        double area = side*side*side;
        System.out.print("The area of the triangle "+area);

        mini.close();
    }
}
