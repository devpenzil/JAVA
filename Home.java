import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The Sum is" + " " + sum);

    }
}
