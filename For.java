import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limit");
        int limit = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}