import java.util.Scanner;

public class Clase1_1c {
   // import java.util.Scanner;
    public static class Clase1_1b {
        //Utilizando la sentencia while,
        // imprima todos los números PARES entre 2 variables “a”
        //y “b”
        public static void main(String[] args) {
            Scanner miScanner = new Scanner(System.in);
            System.out.print("Ingrese el valor de a: ");
            int i;
            int a = miScanner.nextInt();
            System.out.print("Ingrese el valor de b: ");
            int b = miScanner.nextInt();

            for (i=a;i<=b;i++ ){
                if(i%2==0){
                    System.out.print(i + " ");
                }

            }
        }
    }





}
