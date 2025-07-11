//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

 class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Digite as 8 notas do aluno (2 por bimestre):");

        // Lê as 8 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula médias bimestrais
        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        // Calcula médias semestrais
        double semestre1 = (b1 + b2) / 2;
        double semestre2 = (b3 + b4) / 2;

        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibe os resultados
        System.out.println("\nPráticas");
        System.out.printf("1º Bimestre: %.1f\n", b1);
        System.out.printf("2º Bimestre: %.1f\n", b2);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f\n", b3);
        System.out.printf("4º Bimestre: %.1f\n", b4);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
