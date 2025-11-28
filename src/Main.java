import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner le premier nombre :");
        double x=scanner.nextDouble();
        System.out.print("donner le deuxième nombre :");
        double y=scanner.nextDouble();
        System.out.print("donnerf le troisième nombre :");
        double z=scanner.nextDouble();
        double min, mid, max;
        if (x<=y && x<=z) {
            min = x;
            if (y <= z) {
                mid = y;
                max = z;
            } else {
                mid = z;
                max = y;
            }
        }
        else if (y<=x && y<=z) {
            min = y;
            if (x <= z) {
                mid = x;
                max = z;
            }
            else {
                mid = z;
                max = x;
            }
        }
        else {
            min = z;
            if (x <= y) {
                mid = x;
                max = y;
            }
            else {
                mid = y;
                max = x;
            }
        }
        System.out.printf("Les nombres en ordre croissant : %.2f, %.2f, %.2f\n", min, mid, max);
        scanner.close();
    }
}