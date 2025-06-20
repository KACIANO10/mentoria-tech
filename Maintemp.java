import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
10000000
        // Exibe os resultados
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        // Fecha o scanner
        scanner.close();
    }
}