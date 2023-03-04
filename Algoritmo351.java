import java.util.Scanner;

public class Algoritmo351 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i, numero;
        String[] nomes = new String[5];

        for(i = 0; i <= 4; i++){
            System.out.println("\n Nome "+ (i + 1) +": ");
            nomes[i] = teclado.nextLine();
        }

        System.out.println("Digite o número da pessoa: ");
        numero = teclado.nextInt();

        while(numero < 1 && numero > 5 ){
            System.out.println("Número fora do intervalo.");
            System.out.println("Digite o número da pessoa: ");
            numero = teclado.nextInt();
        }
        System.out.println("\n"+ nomes[numero - 1]);
        System.out.println("\n");

        teclado.close();
    }
}
