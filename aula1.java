import java.util.Scanner;

public class conti002 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        int nota1;

        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf("Digite sua primeira nota (o numero precisa ser inteiro): ");
        nota1 = leitura.nextInt();

        int nota2;

        System.out.printf("\n\n");
        System.out.printf("Digite sua segunda nota (o numero precisa ser inteiro): ");
        nota2 = leitura.nextInt();


        int nota3;

        System.out.printf("\n\n");
        System.out.printf("Digite sua terceira nota (o numero precisa ser inteiro): ");
        nota3 = leitura.nextInt();

        int media;

        media = (nota1 + nota2 + nota3) /3;

        
       System.out.println("sua media é:  "+media);


          if(media < 6){

             System.out.println("voce foi reprovado. ");

          }else{

             System.out.println("voce foi aprovado. ");

         }

            System.out.printf("\n\n");
        
    }
}
