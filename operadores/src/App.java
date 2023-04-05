import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores"+"\n");
        
        //Atribuição =
        String nome = "Bruno";
        String nomeCompleto = "Bruno" + " " + "Alves";
        int idade = 40;
        double peso = 80.6;
        char sexo = 'M';
        boolean doarOrgao = false;
        Date dataNascimento = new Date();

        //Aritmétricos
        double soma = 10.5 + 60.4; //Operador de soma faz a concatenação numa String
        int subtracao = 40 - 20;
        int multiplicacao = 19 * 3;
        int divisao = 15 / 5;
        int modulo = 15 % 4; //retorna o resto da divisão
        double resultado = (10.5 * 30.5) + (9 / 9);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao+"\n");

        concatenacao = "1"+1+1+"1";
        System.out.println(concatenacao+"\n");

        concatenacao = 1+"1"+1+"1"; 
        System.out.println(concatenacao+"\n");


    }
}
