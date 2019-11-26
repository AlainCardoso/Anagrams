import java.util.Arrays;
 
import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
 
        Scanner palavra = new Scanner(System.in);
        // Instanciando um SCANNER para receber a string
        // Recebendo as strings do usuário
        System.out.print("Escreva a primeira palavra: ");
        String p1 = palavra.nextLine();
        System.out.print("Escreva a segunda palavra: ");
        String p2 = palavra.nextLine();

        //verificando se as duas palavras são anagramas
        //fechando o SCANNER
        if(verificarAnagrama(p1, p2))
            System.out.println(p1+" E "+p2+" SÃO ANAGRAMAS");
        else
            System.out.println(p1+" E "+p2+" NÃO SÃO ANAGRAMAS");
        palavra.close();
    }
 
    public static boolean verificarAnagrama(String p1, String p2)    {
 
        // Removendo os espaços em branco
        p1 = p1.replaceAll("s", "");
        p2 = p2.replaceAll("s", "");
 
        // Verificando se as duas palavras possuem o mesmo tamanho
        if(p1.length() != p2.length())
 
            return false;
 
        else
 
        {
            // Convertendo as letras para MAIÚSCULO e em um ARRAY de CHARS
            char[] arr1 = p1.toUpperCase().toCharArray();
            char[] arr2 = p2.toUpperCase().toCharArray();
 
            // Ordenando os ARRAYS
            Arrays.sort(arr1);
            Arrays.sort(arr2);
 
            // Verificando se os dois ARRAYS são iguais
            return (Arrays.equals(arr1, arr2));
        }
    }
}