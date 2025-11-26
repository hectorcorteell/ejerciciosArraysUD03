import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int[] array = pedirMedidas();

        int porEncimaMedia = porEncimaMedia(array, alturaMedia(array));
        System.out.println("Altura media: "+alturaMedia(array)+"cm");
        System.out.println("Hay "+porEncimaMedia+" personas con una altura mayor que la media.");
        System.out.println("Y "+(array.length-porEncimaMedia)+" personas con una altura menor.");
    }

    public static int[] pedirMedidas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Con cuantas persona se desea operar?");
        int longitudArray = sc.nextInt();

        while(longitudArray<1){
            System.out.println("¡Debes de introducir la altura de al menos 1 persona!");
            System.out.println("¿Con cuantas persona se desea operar?");
            longitudArray = sc.nextInt();
        }
        int[] array = new int[longitudArray];

        for(int i=0;i<array.length;){
            System.out.println("Introduce la altura(cm) de la persona "+(i+1) +"/"+array.length);
            array[i]=sc.nextInt();
            if (array[i]>0){
                i++;
            }else{
            System.out.println("¡Altura inválida!");
            }
        }

        return array;
    }

    public static int alturaMedia(int[] array){
        int suma = 0;

        for(int i=0;i<array.length;i++){
            suma+=array[i];
        }

        return suma/array.length;
    }

    public static int porEncimaMedia(int[] array, int media){
        int porEncimaMedia=0;

        for (int i=0;i<array.length;i++){
            if(array[i]>media)
                porEncimaMedia++;
        }
        return porEncimaMedia++;
    }
}
