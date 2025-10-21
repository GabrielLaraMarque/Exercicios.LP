import java.util.Scanner;

public class ExercicioLP {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int idade;

       System.out.println("Digite a sua idade: ");
       idade = ler.nextInt();

       if(idade <= 12){
        System.out.println("Você é uma criança.");
       } 
       else if((idade >= 13) && (idade <= 17)){
        System.out.println("Você é adolescente.");
       }
       else if((idade >= 18) && (idade <= 59)){
        System.out.println("Você é adulto.");
       }
       else{
        System.out.println("Você é idoso.");
       }
    }
}
