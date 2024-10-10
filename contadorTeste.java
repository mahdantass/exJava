public class contadorTeste {
    public static void main(String[]args){
        int contador = 1;
        int acumulador = 0;

        while(contador<=100){
            //adicione o contador ao acumulador
            acumulador = acumulador + contador;
            contador++;//incrementa o contador
        }
        for(int i = 0; i< 100; i++){
            
        }

        System.out.println("A soma é " + acumulador);
    }
}