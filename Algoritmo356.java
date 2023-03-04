import java.util.Scanner;

public class Algoritmo356 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, j, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] situacao = new String[15];
        double[] nota1 = new double[15];
        double[] nota2 = new double[15];
        
        for (i = 0; i <= 14; i++) {
            System.out.printf("\n\nDigite %dº nome: ", i + 1);
            nomes[i] = teclado.nextLine();
            while (nomes[i].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres");
                System.out.printf("\n\nDigite %d nome: ", i + 1);
                nomes[i] = teclado.nextLine();
            }

            t = 30 - nomes[i].length();
            for (j = 1; j <= t; j++) {
                nomes[i] += " ";
            }
            System.out.print("Digite a 1ª nota: ");
            nota1[i] = Double.parseDouble(teclado.nextLine());
            System.out.print("Digite a 2ª nota: ");
            nota2[i] = Double.parseDouble(teclado.nextLine());
            media[i] = (int) ((nota1[i] + nota2[i]) / 2 + 0.0001);
            if (media[i] >= 5) {
                situacao[i] = "APROVADO";
            } else {
                situacao[i] = "REPROVADO";
            }
        }

        System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL\n");
        for (i = 0; i <= 14; i++) {
            System.out.printf(" %d- %s\t%.2f\t%.2f\t%d\t%s\n",
                i + 1, nomes[i], nota1[i], nota2[i], media[i], situacao[i]);
        }
        
        teclado.close();
    }

}
