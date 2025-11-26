import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int[] array = pedirNumsArray();
        int positivos = numerosPositivos(array);
        int negativos = numerosNegativos(array);
        int ceros = numerosCero(array);
        double mediaPositivos = mediaPositivos(array);
        double mediaNegativos = mediaNegativos(array);

        System.out.println("Números positivos ingresados: " + positivos + "   | Media: " + mediaPositivos);
        System.out.println("Números negativos ingresados: " + negativos + "   | Media: " + mediaNegativos);
        System.out.println("Ceros ingresados: " + ceros);

    }
    public static int[] pedirNumsArray(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0;i<array.length;i++){
            System.out.println("Introduce el número "+(i+1));
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static int numerosPositivos(int[] array){
        int positivos = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                positivos++;
            }
        }
        return positivos;
    }

    public static int numerosNegativos(int[] array){
        int negativos = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                negativos++;
            }
        }
        return negativos;
    }

    public static int numerosCero(int[] array){
        int ceros = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                ceros++;
            }
        }
        return ceros;
    }

    public static double mediaPositivos(int[] array){
        int suma = 0;
        int positivos =0;

        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                suma+=array[i];
                positivos++;
            }
        }

        return (double)suma/positivos;

    }

    public static double mediaNegativos(int[] array){
        int suma = 0;
        int negativos =0;

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                suma+=array[i];
                negativos++;
            }
        }

        return (double)suma/negativos;

    }

}
