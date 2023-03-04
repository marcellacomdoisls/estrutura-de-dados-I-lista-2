import java.util.Scanner;

public class Algoritmo360 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] ultimoDia = new int[12];
        String[] signo = new String[12];
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o signo: ");
            signo[i] = teclado.nextLine();
            
            System.out.print("Digite o último dia: ");
            ultimoDia[i] = teclado.nextInt();
            teclado.nextLine();
        }
        
        System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
        int data = teclado.nextInt();
        
        while (data != 9999) {
            int dia = data / 100;
            int mes = data % 100 - 1;
            
            if (dia > ultimoDia[mes]) {
                mes = (mes + 1) % 12;
            }
            
            System.out.println("Signo: " + signo[mes]);
            
            System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = teclado.nextInt();
        }
        
        teclado.close();
    }
}
