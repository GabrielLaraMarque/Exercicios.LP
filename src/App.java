import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        
        Double vCompra;

        System.out.println("Digite o valor da compra:"); 
        vCompra = ler.nextDouble();

        if (vCompra >= 200) {
            System.out.println("O desconto será de 20%");
            vCompra = vCompra - (0.20);
            System.out.println("O valor do desconto é de: R$");
        }
        else if (vCompra >= 100 && vCompra <= 199) {
            System.out.println("O desconto será de 10%");
            vCompra = vCompra - (0.10);
            System.out.println("O valor com desconto será: R$" +vCompra);
        }
        else{
            System.out.println("Não haverá desconto.");
        }
    }
}
