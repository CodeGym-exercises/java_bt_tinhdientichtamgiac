import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Canh 1: ");
        double c1 = scanner.nextDouble();
        System.out.printf("Canh 2: ");
        double c2 = scanner.nextDouble();
        System.out.printf("Canh 3: ");
        double c3 = scanner.nextDouble();

        if(isValid(c1,c2,c3)){
            System.out.printf("The area of the triangle is %e", area(c1,c2,c3));
        }else {
            System.out.printf("c1, c2, c3 is not valid! ");
        }
    }
    public static boolean isValid(double side1, double side2, double side3){
        return (side1+side2)>side3||(side1+side3)>side2||(side2+side3)>side1?true:false;
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1+side2+side3)/3;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
