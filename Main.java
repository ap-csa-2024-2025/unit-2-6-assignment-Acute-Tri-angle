import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1

    Scanner sc = new Scanner(System.in);
    System.out.println("Radius of circle?");
    double r = sc.nextDouble();
    Circle c = new Circle(r);
    System.out.println(c.toString() + " has a circumference of " + c.getCircumference() + " and an area of " + c.getArea());


    //Problem 2
    System.out.println("Number of sides?");
    int sNum = sc.nextInt();
    System.out.println("Side length?");
    double sLength = sc.nextDouble();
    RegularPolygon polygon = new RegularPolygon(sNum, sLength);
    System.out.println("Area w/ " + sNum + " sides: " + polygon.getArea());
    polygon.addSides(2);
    System.out.println("Increasing number of sides on polygon by 2.\nArea w/ " + polygon.getNumSides() + " sides: " + polygon.getArea());

    sc.close();
  }
}
