class Calculator {
    Scanner scanner = new Scanner(System.in);
    
    public int getUserInput(){
        System.out.println("Podaj liczbe :");
        return scanner.nextInt();
    }
    
    public int getUserInputForPower() {
        System.out.println("Podaj jej potęgę :");
        return scanner.nextInt();
    }
    
    public int Dodawanie(int a, int b) {
        return a + b;
    }

    public int Odejmowanie(int a, int b) {
        return a - b;
    }

    public int Mnozenie(int a, int b) {
        return a * b;
    }

    public int Dzielenie(int a, int b) {
        if (b == 0) {
            System.out.println("nie dziel przez 0");
            return 0;
        }
        return a / b;
    }

    public double Potega(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return Math.pow(a, b);
    }

    public int Modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Nie dziel przez 0");
            return 0;
        }
        return a % b;
    }
}
