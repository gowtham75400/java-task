import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First number :");
        int a = scanner.nextInt();
        System.out.println("Enter your second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter the operator + , - ,* , / , % : ");
        char operator = scanner.next().charAt(0);
        
        Arithmetic operation = new Arithmetic();

        switch (operator) {
            case '+':
                System.out.println(operation.add(a ,b ));
                break;
            case '-':
                System.out.println(operation.sub(a, b));
                break;
            case '*':
                System.out.println(operation.mul(a, b));
                break;
            case '/':
                System.out.println(operation.div(a, b));
                break;
            case '%':
                System.out.println(operation.mod(a, b));
                break;

            default:
            System.out.println("Invaild Operator");
        }

        // Arithmetic operation = new Arithmetic();
        // operation.add(0, 0);
        // System.out.println(operation.add(2, 5));


    }
}
