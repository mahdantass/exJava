import java.util.Scanner;
public class Testeloop {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Digie uma nota:");
            double nota = entrada.nextDouble();
        }
    }
}