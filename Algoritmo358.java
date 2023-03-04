import java.util.Scanner;

public class Algoritmo358 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] precoCompra = new double[10];
        double[] precoVenda = new double[10];
        double lucro;
        int totalLucroMenor1 = 0, totalLucroMenor2 = 0, totalLucroMaior2 = 0, i;

        for (i = 0; i < 10; i++) {
            System.out.print("\nPreço de compra: ");
            precoCompra[i] = teclado.nextDouble();
            System.out.print("Preço de venda: ");
            precoVenda[i] = teclado.nextDouble();
        }

        for (i = 0; i < 10; i++) {
            lucro = precoVenda[i] - precoCompra[i];
            if (lucro < 10.0) {
                totalLucroMenor1++;
            } else if (lucro <= 20.0) {
                totalLucroMenor2++;
            } else {
                totalLucroMaior2++;
            }
        }

        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totalLucroMenor1);
        System.out.println("Total de mercadorias com 10% <= lucro < 20%: " + totalLucroMenor2);
        System.out.println("Total de mercadorias com lucro > 20%: " + totalLucroMaior2);

        teclado.close();
    }
}
