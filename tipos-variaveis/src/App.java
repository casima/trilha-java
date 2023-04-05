public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bora começar!");
        //Número trocando seu tipo
        short numeroCurto = 1; //2 bytes
        int numeroNormal = numeroCurto; //4 bytes
        short numeroCurto2 = (short) numeroNormal;  //cast: pega um tipo mais ambrangente e muda para uma precisão menor
        System.out.println("\n\nNumero:" + numeroCurto2 +"\n\n");
        
    }
}
