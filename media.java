import java.util.Scanner;
public class media {
    public static void main(String[] args){
        int contador;
        double nota, media, acumuladorNotas;
        contador = 0;
        int opj = 0;
        acumuladorNotas = 0;

        Scanner entrada = new Scanner(System.in);

        while(contador<5){
            contador++;
            System.out.println("Digite uma nota " + contador);
            nota = entrada.nextInt();
            acumuladorNotas = acumuladorNotas + nota;
    
        }


        media = acumuladorNotas / contador; 
        System.out.println("A média é " + media);
        entrada.close();
    }

}
