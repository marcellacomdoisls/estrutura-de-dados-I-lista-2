import java.util.Scanner;

public class Algoritmo346 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        int opcao, x, tamanho;

        do {
            System.out.println("\nMENU");
            System.out.println("\n1 - Imprime o comprimento da frase.");
            System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase.");
            System.out.println("\n3 - Imprime a frase espelhada.");
            System.out.println("\n4 - Termina o algoritmo.");
            System.out.print("\nOPÇÃO: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite uma frase: ");
                    teclado.nextLine(); 
                    frase = teclado.nextLine();
                    System.out.println("\nNúmero de caracteres da frase: " + frase.length());
                    break;
                case 2:
                    System.out.print("\nDigite uma frase: ");
                    teclado.nextLine(); 
                    frase = teclado.nextLine();
                    System.out.println("\nOs dois primeiros caracteres: " + frase.substring(0, 2));
                    tamanho = frase.length() - 2;
                    System.out.println("\nOs dois ultimos caracteres: " + frase.substring(tamanho));
                    break;
                case 3:
                    System.out.print("\nDigite uma frase: ");
                    teclado.nextLine();
                    frase = teclado.nextLine();
                    for (x = frase.length() - 1; x >= 0; x--) {
                        System.out.print(frase.charAt(x));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nFim do algoritmo.");
                    break;
                default:
                    System.out.println("\nOpção nao disponível.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 4);
        
        teclado.close();
    }
}
