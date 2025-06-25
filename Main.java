
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];  // Array para armazenar as 8 notas

        // Entrada das notas
        System.out.println("Digite as 8 notas anuais do aluno:");

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "º Nota: ");
            notas[i] = sc.nextDouble();
        }

        // Calculando médias bimestrais (as próprias notas já são as médias bimestrais)
        double bimestre1 = notas[0];
        double bimestre2 = notas[1];
        double bimestre3 = notas[2];
        double bimestre4 = notas[3];
        double bimestre5 = notas[4];
        double bimestre6 = notas[5];
        double bimestre7 = notas[6];
        double bimestre8 = notas[7];

        // Calculando médias semestrais (4 notas por semestre)
        double semestre1 = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        double semestre2 = (bimestre5 + bimestre6 + bimestre7 + bimestre8) / 4;

        // Média final (média das médias semestrais)
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Apresentando os resultados
        System.out.println("\nPráticas\n");

        System.out.printf("1º Bimestre: %.1f\n", bimestre1);
        System.out.printf("2º Bimestre: %.1f\n", bimestre2);
        System.out.printf("3º Bimestre: %.1f\n", bimestre3);
        System.out.printf("4º Bimestre: %.1f\n", bimestre4);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.println("----------------------");
        System.out.printf("5º Bimestre: %.1f\n", bimestre5);
        System.out.printf("6º Bimestre: %.1f\n", bimestre6);
        System.out.printf("7º Bimestre: %.1f\n", bimestre7);
        System.out.printf("8º Bimestre: %.1f\n", bimestre8);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        sc.close();
    }
}
