public class sentencia_control
{
    public static void main(String args[] )
    {        
        for(int i = 1;i <= 10 && i >0;i++) {
            ConvertirAPalabra(i);
        }
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
