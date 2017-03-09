package proyecto1_unidad1;
import java.util.Scanner;
public class Proyecto1_Unidad1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int abisiestos[] = new int[70];
        int d=0,m=0,a=0;
        String cad="";
        MetodosFecha.LlenarBisiestos(abisiestos);
        System.out.println("Ingresa la fecha del dia de hoy en numero y te dare la fecha del dia siguiete");
        System.out.println("ingresa el dia:");
        d=leer.nextInt();
        System.out.println("ingresa el mes");
        m=leer.nextInt();
        System.out.println("ingresa el año");
        a=leer.nextInt();
        //Si el año es bisiesto se ejecutara el metodo para los años bisiestos sino se ejecutara otro para los años normales
        if(MetodosFecha.CompararAño(a,abisiestos)){
            cad = MetodosFecha.ObtenerFechaNuevaBi(d,m,a);
            System.out.println("\n\t\tAño Bisiesto\n\tLa fecha ingresada: "+d+"/"+m+"/"+a);   
            System.out.println("\tEl dia siguiente a esa fecha es: "+cad);  
        }else{
            cad = MetodosFecha.ObtenerFechaNueva(d,m,a);
            System.out.println("\n\t\tAño normal\n\tLa fecha ingresada: "+d+"/"+m+"/"+a);   
            System.out.println("\tEl dia siguiente a esa fecha es: "+cad);  
        }
    }
}
