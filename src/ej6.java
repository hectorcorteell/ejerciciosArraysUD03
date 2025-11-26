import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        String DNI = pedirDNI();
        boolean validado = validarDNI(DNI);

        while(!validado){
            DNI = pedirDNI();
            validado = validarDNI(DNI);
        }

        int restoDNI = restoDNI(DNI);

        char[] letras = rellenarLetras();

        DNI+=String.valueOf(letras[restoDNI]);
        System.out.println(DNI);
    }

    public static char[] rellenarLetras(){
        char[] letras = new char[23];
        letras[0] = 'T';
        letras[1] = 'R';
        letras[2] = 'W';
        letras[3] = 'A';
        letras[4] = 'G';
        letras[5] = 'M';
        letras[6] = 'Y';
        letras[7] = 'F';
        letras[8] = 'P';
        letras[9] = 'D';
        letras[10] = 'X';
        letras[11] = 'B';
        letras[12] = 'N';
        letras[13] = 'J';
        letras[14] = 'Z';
        letras[15] = 'S';
        letras[16] = 'Q';
        letras[17] = 'V';
        letras[18] = 'H';
        letras[19] = 'L';
        letras[20] = 'C';
        letras[21] = 'K';
        letras[22] = 'E';

        return letras;

    }

    public static String pedirDNI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce DNI [1-8 cifras]:");

        return sc.nextLine();
    }

    public static boolean validarDNI(String DNI){
        if(DNI.length()>8 || DNI.length()<1) {
            System.out.println("El DNI supera el límite de cifras");
            return false;
        }
        if(DNI.length()<8 || DNI.length()>1) {
            for (int i = 0; i < DNI.length(); i++) {
                if (DNI.charAt(i) > 'A' && DNI.charAt(i) < 'Z' || DNI.charAt(i) > 'a' && DNI.charAt(i) < 'z') {
                    System.out.println("El DNI debe componerse de números");
                    return false;
                }
            }
        }
        return true;
    }

    public static int restoDNI(String DNI){
        int suma = 0;
        for (int i=0;i<DNI.length();i++){
            suma+=(int)DNI.charAt(i);
        }

        return suma%23;
    }
}

