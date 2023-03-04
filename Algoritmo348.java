import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] media = new double[5];

        for (i = 0; i <= 4; i++) {
            System.out.print("\nDigite " + (i + 1) + "º nome: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Digite a 1ª nota: ");
            nota1[i] = teclado.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            nota2[i] = teclado.nextDouble();
            media[i] = (nota1[i] + nota2[i]) / 2;
            teclado.nextLine();
        }

        System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL\n");
        for (i = 0; i <= 4; i++) {
            System.out.println("\n" + (i + 1) + " - " + nomes[i]);
            System.out.println(nota1[i] + "\t" + nota2[i] + "\t" + media[i]);
        }

        System.out.println("\n");
        teclado.close();
    }
}
