import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleBuild();
    }
    public static void TriangleBuild() {
        float angleA, angleB, angleC;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for angleA");
        angleA = scanner.nextFloat();
        System.out.println("Enter value for angleB");
        angleB = scanner.nextFloat();
        System.out.println("Enter value for angleC");
        angleC = scanner.nextFloat();

        String validMessage = "The triangle can be build";

        float sumOfAngles = angleA + angleB + angleC;

        if (sumOfAngles != 180) {
            System.out.println("Triangle can't be build");
        } else {
            System.out.println("Triangle can be build with given angles");
        }

    }
}