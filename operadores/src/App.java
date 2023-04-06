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
        System.out.println("Fim Atribuição\n\n");
        
        //Aritmétricos
        double soma = 10.5 + 60.4; //Operador de soma faz a concatenação numa String
        int subtracao = 40 - 20;
        int multiplicacao = 19 * 3;
        int divisao = 15 / 5;
        int modulo = 15 % 4; //retorna o resto da divisão
        double operacaoMatematica = (10.5 * 30.5) + (9 / 9);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao+"\n");

        concatenacao = "1"+1+1+"1";
        System.out.println(concatenacao+"\n");

        concatenacao = 1+"1"+1+"1"; 
        System.out.println(concatenacao);
        System.out.println("Fim Aritmétricos\n\n");
       


        //Unários
        int resultado = +1;
        System.out.println(resultado);
 
        resultado--;
        System.out.println(resultado);
 
        resultado++;
        System.out.println(resultado);
 
        resultado = -resultado;
        System.out.println(resultado);
 
        boolean success = false;
        System.out.println(success +" (valor declarado false)");
        System.out.println(!success +" (na memória: false)");// saída: true
        System.out.println(success +" (false)");
        success = !success;
        System.out.println(success);
        System.out.println("Fim Unários\n\n");
    
        //Operador ternário

        int a = 5;
        int b = 6;

        String valor = a==b ? "Verdadeiro" : "Falso"; // condição em uma linha
        System.out.println(valor);
        int valor2 = a==b ? 1 : 0; // condição em uma linha
        System.out.println(valor2);
        System.out.println("Fim ternário\n\n");

        //Operador relacional
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Número 1 é igual a número 2? "+simNao);
        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferente a número 2? "+simNao);

        System.out.println("Fim relacional\n\n");
    
    }
}
