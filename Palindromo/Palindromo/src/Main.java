import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba una palabra y después #:\n");
        String input = teclado.nextLine();
        teclado.close();

        // Eliminamos el caracter '#' del final
        String word = input.substring(0, input.length() - 1);

        // Comparamos la palabra original con su versión invertida
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println(word + " es un palíndromo");
        } else {
            System.out.println(word + " no es un palíndromo");
        }
    }
}
