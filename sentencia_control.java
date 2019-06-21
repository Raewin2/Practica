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
        if (a==1){
            imprimir("Uno");
        } else if (a==2){
            imprimir("Dos");
        }else if (a==3){
            imprimir("Tres");
        }else if(a==4){
            imprimir("Cuatro");
        }else if(a==5){
            imprimir("Cinco");
        }else if(a==6){
            imprimir("Seis");
        }else if(a==7){
            imprimir("Siete");
        }else if (a==8){
            imprimir("Ocho");
        }else if (a==9){
            imprimir("Nueve");
        }else if(a==10){
            imprimir("Diez");
        } else { 
            imprimir("Numero fuera de rango");
        }
    }
    private static void imprimir(int a) {
            System.out.println (a);
    }
    private static void imprimir(String a){
        System.out.println (a);
    }

}
