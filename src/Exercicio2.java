import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = ler.nextLine();

        System.out.println("Insira a nota do aluno: 0 a 10");
        int nota = ler.nextInt();

        if (nota < 4) {
            System.out.println("Insuficiente (I)");
        }
        else if ((nota >= 4) && (nota <= 6.9)) {
            System.out.println("Regular (R)");
        }
        else if ((nota >= 7) && (nota <= 8.9)) {
            System.out.println("Bom! (B)");
        }
        else {
            System.out.println("Excelente!");
        }
    }
}
