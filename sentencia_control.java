import java.util.Scanner;

public class sentencia_control
{
    public static void main(String args[] )
    {
        
                Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        //System.out.println("You entered string "+s);
        int a = in.nextInt();
       // System.out.println("You entered integer "+a);
        //float b = in.nextFloat();
        //System.out.println("You entered float "+b);
        ConvertirAPalabra(a);

    }
    private static void ConvertirAPalabra(int a) {
        switch (a) {
            case 1:
                imprimir("Uno");
                break;
            case 2:
                imprimir("Dos");
                break;
            case 3:
                imprimir("Tres");
                break;
             case 4:
                imprimir("Cuatro");
                break; 
            case 5:
                imprimir("Cinco");
                break;
            case 6:
                imprimir("Seis");
                break;   
            case 7:
                imprimir("Siete");
                break;
            case 8:
                imprimir("Ocho");
                break;
            case 9:
                imprimir("Nueve");
                break;
            case 10:
                imprimir("Diez");
                break;
            default:
                imprimir("Numero fuera de rango");
                break;
        }
       
    }
    private static void imprimir(int a) {
            System.out.println (a);
    }
    private static void imprimir(String a){
        System.out.println (a);
    }

}
