import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int a, b;

        System.out.println("Wybierz opcje: ");
        System.out.println("1 = dod, 2 = odej, 3 = mnoz, 4 = dziel, 5 = potęga, 6 = modulo :");

        int operator = scanner.nextInt();
        switch (operator) {
         
            case 1:
                System.out.println("Wybrałeś dodawanie!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInput();
                System.out.println(calculator.Dodawanie(a, b));
                break;
            
            case 2:
                System.out.println("Wybrałeś odejmowanie!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInput();
                System.out.println(calculator.Odejmowanie(a, b));
                break;
                
            case 3:
                System.out.println("Wybrałeś mnożenie!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInput();
                System.out.println(calculator.Mnozenie(a, b));
                break;
                
            case 4:
                System.out.println("Wybrałeś dzielenie!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInput();
                System.out.println(calculator.Dzielenie(a, b));
                break;
                
            case 5:
                System.out.println("Wybrałeś Potęgowanie!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInputForPower();
                System.out.println(calculator.Potega(a, b));
                break;
                
            case 6:
                System.out.println("Wybrałeś Modulo!!!");
                a = calculator.getUserInput();
                b = calculator.getUserInput();
                System.out.println(calculator.Modulo(a, b));
                break;
                
            default:
                System.out.println("Podałeś zły wybór!!!");
                main(args);
        }
    }
}
