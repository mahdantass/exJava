import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        System.out.println("Menu de Opçõs");
        System.out.println("1 - Cadastrar Produtos");
        System.out.println("2 - Lista de Produtos");
        System.out.println("3 - Sair do Sistema");
        System.out.println("Escolha uma opção:");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();

        switch(menu){
            case 1: 
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Você escolheu o menu 1");
            System.out.println("Cadastre o produto");
            String produto = entrada2.nextLine();
            break;
   
            case 2:
            System.out.println("Você escolheu o menu 2");
            System.out.println("Liste os produtos");
            break;

            case 3:
            System.out.println("Você escolheu o menu 3");
            System.out.println("Saindo do sistema");
            break;

            default:
            System.out.println("Item de menu inválido");

    }  
    
    entrada.close();
}
}
