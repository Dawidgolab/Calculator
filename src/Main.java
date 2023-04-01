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
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj liczbe b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Dodawanie(a, b));
                        break;
                    case 2:
                        System.out.println("Wybrałeś odejmowanie!!!");
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj liczbe b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Odejmowanie(a, b));
                        break;
                    case 3:
                        System.out.println("Wybrałeś mnożenie!!!");
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj liczbe b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Mnozenie(a, b));
                        break;
                    case 4:
                        System.out.println("Wybrałeś dzielenie!!!");
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj liczbe b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Dzielenie(a,b));
                        break;
                    case 5:
                        System.out.println("Wybrałeś Potęgowanie!!!");
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj Potęge b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Potega(a,b));
                        break;
                    case 6:
                        System.out.println("Wybrałeś Modulo!!!");
                        System.out.println("Podaj liczbe a :");
                        a = scanner.nextInt();
                        System.out.println("Podaj liczbe b :");
                        b = scanner.nextInt();
                        System.out.println(calculator.Modulo(a,b));
                        break;

                    default:
                        System.out.println("Podałeś zły wybór!!!");
                        main(args);
                }
            }
        }
