import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(sum(num1,num2));
    }
    static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
