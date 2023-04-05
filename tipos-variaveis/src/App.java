public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n\nBora começar!\n\n");
        //Número trocando seu tipo
        short numeroCurto = 1; //2 bytes
        int numeroNormal = numeroCurto; //4 bytes
        short numeroCurto2 = (short) numeroNormal;  //cast: pega um tipo mais ambrangente e muda para uma precisão menor
        System.out.println("Numero: " + numeroCurto2 +"\n");


        //Variáveis vs Constantes
        
        //Associando variável
        int numero = 5;

        numero = 10;

        System.out.println("Variável: "+numero +"\n");
        
        //Constante (nunca muda)

        final double VALOR_DE_PI = 3.14; // uso da palavra: final

        //VALOR_DE_PI = 3.15; Erro!!!

        System.out.println("Valor de PI: "+VALOR_DE_PI+"\n");
    }
}
