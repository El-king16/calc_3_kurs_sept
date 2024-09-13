import java.util.Scanner;
public class kalkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.print("\n Выберите +, -, *, /, log, Ln, Sin, Cos, 0 = выход: ");

            String choise = sc.nextLine();
            System.out.println(" ");
if (choise.equals("0")){
    break;
}
            switch (choise) {
                case "+":
                    Plus();
                    break;
                case "-":
                    Minus();
                    break;

                case "*":
                    Multip();
                    break;

                case "/":
                    Division();
                    break;
                case "log", "Log":
                    Log();
                    break;
                case "ln", "Ln", "log10":
                    Ln();
                    break;
                case "sin", "Sin", "sinus", "Sinus":
                    Sin();
                    break;
                case "cos", "Cos", "Cosinus", "cosinus":
                    Cos();
                    break;

            }
        }
    }
    private static void Plus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Второе число = ");
        double b = sc.nextDouble();
        System.out.print("\n" + a + " + " + b + " = ");
        System.out.printf("%.2f", a + b);
    }
    private static void Minus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Второе число = ");
        double b = sc.nextDouble();
        System.out.print("\n" + a + " - " + b + " = ");
        System.out.printf("%.2f", a - b);
    }
    private static void Multip(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Второе число = ");
        double b = sc.nextDouble();
        System.out.print("\n" + a + " x " + b + " = ");
        System.out.printf("%.2f", a * b);
    }

    private static void Division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Второе число = ");
        double b = sc.nextDouble();
        if (b == 0){
            System.out.println("На ноль делить нельзя");
            b = sc.nextDouble();
            System.out.print("\n" + a + " : " + b + " = ");
            System.out.printf("%.2f", a / b);
        }

    }
    private static void Log(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.printf("log(%.3f) = %.3f%n", a, Math.log(a));
    }
    private static void Ln(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.printf("log10(%.3f) = %.3f%n", a, Math.log10(a));
    }
    private static void Sin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.printf("Синус %.1f градусов равен %.2f%n", a, Math.sin(Math.toRadians(a)));
    }

    private static void Cos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        double a = sc.nextDouble();
        System.out.println(" ");
        System.out.printf("Косинус %.1f градусов равен %.2f%n", a, Math.cos(Math.toRadians(a)));
    }


}
