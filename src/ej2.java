import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int size = entradaInt("Indica el tamaño del array: ");

        int min = entradaInt("Indica el límite menor: ");
        int max = entradaInt("Indica el límite mayor: ");
        int[] array = randomArray(min, max, size);
        do {
            if (min < max) {
                array = randomArray(min, max, size);
                print(array);
            } else {
                System.out.println("El límite mayor es más pequeño que el límite menor");
                System.out.println();
                System.out.println("Vuelve a ingresar los datos");
                min = entradaInt("Indica el límite menor: ");
                max = entradaInt("Indica el límite mayor: ");
                if (min < max) {
                    array = randomArray(min, max, size);
                    print(array);
                }
            }
        }while(min>max);

        System.out.println("La suma de todos los números es: " + sumaArray(array));

    }

    public static int sumaArray(int[] array){
        int suma=0;
        for (int i=0;i<array.length;i++){
            suma+=array[i];
        }
        return suma;
    }

    public static int[] randomArray(int min, int max, int size){
        int[] array = new int[size];
        for (int i=0;i<array.length;i++){
            array[i] = (int)((Math.random()*(max-min+1)+min));//Formula para generar número random entre límites
        }
        return array;
    }

    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int entradaInt(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextInt();

    }
}
