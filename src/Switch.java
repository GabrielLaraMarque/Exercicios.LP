import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int opcao, i;
      System.out.println("escolha de acordo com o cardapio: ");

      System.out.println("1 - x-salada (R$15,00)");
      System.out.println("2 - x-bacon (R$18,00)");
      System.out.println("3 - refrigerante (R$6,00)");
      System.out.println("4 - Suco (8,00)");
      opcao = ler.nextInt();

      switch (opcao) {
        case 1:
            System.out.println("pedido computado!");
            System.out.println("x-salada R$15,00");
            break;
        case 2:
        System.out.println("pedido computado!");
        System.out.println("x-bacon R$18,00");
            break;
        case 3:
        System.out.println("pedido computado!");
        System.out.println("Refrigerante R$6,00");
            break;
        case 4:
        System.out.println("pedido computado!");
        System.out.println("suco R$8,00");
        default:
        System.out.println("número inválido.");
            break;
      }

      
    }
}
