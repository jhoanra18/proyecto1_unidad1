package proyecto1_unidad1;
public class MetodosFecha {
    public static String ObtenerFechaNuevaBi(int d, int m, int a) {
        if (FechaExisteB(d, m, a)) {
            //Final de año si el dia es 31 de diciembre del año n
            String cad="";
            if (d == 31 && m == 12) {
                cad="1/1/"+(a+1);
            } else if (m == 2 && d == 29) {
                //Final de febrero con dia 29
                cad="1/3/"+a;
            } else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) && d == 31) {
                //Final de mes con dias de 31 
                cad = "1/"+(m+1)+"/"+a;
            } else if ((m == 4 || m == 6 || m == 9) && d == 30) {
                //Final de mes con dias de 30
                cad="1/"+(m+1)+"/"+a;
            }else if (d >= 1 && (d <= 28 || d <= 30 || d <= 29)) {
                //Fecha que sea cualquier dia del mes menos el ultimo 1 a 30,28 o 29 
                cad=""+(d+1)+"/"+m+"/"+a;
            }
            return cad;
        } else {
            System.out.println("¡La fecha ingresada no existe!");
            return "No existe";
        }
    }

    public static boolean FechaExisteB(int d, int m, int a) {
        boolean e = false;
        //para ver si la fecha existe en febrero con dia 29
        if (m == 2 && (d >= 1 && d <= 29)) {
            e = true;
        }
        //para ver si la fecha existe en mes con dias de entre 1 y 31
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) {
            e = true;
        }
        //para ver si la fecha existe en mes con dias de entre 1 y 30
        if ((m == 4 || m == 6 || m == 9) && (d >= 1 && d <= 30)) {
            e = true;
        }
        return e;
    }

    public static String ObtenerFechaNueva(int d, int m, int a) {
        if (FechaExiste(d, m, a)) {
            //Final de año si el dia es 31 de diciembre del año n
            String cad="";
            if (d == 31 && m == 12) {
                cad="1/1/"+(a+1);
            } else if (m == 2 && d == 28) {
                //Final de febrero con dia 28
                cad="1/3/"+a;
            } else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) && d == 31) {
                //Final de mes con dias de 31 
                cad="1/"+(m+1)+"/"+a;
            } else if ((m == 4 || m == 6 || m == 9) && d == 30) {
                //Final de mes con dias de 30
                cad="1/"+(m+1)+"/"+a;
            }else if (d >= 1 && (d <= 27 || d <= 30 || d <= 29)) {
                //Fecha que sea cualquier dia del mes menos el ultimo 1 a 30,28 o 29 
                cad=""+(d+1)+"/"+m+"/"+a;
            }
            return cad;
        } else {
            System.out.println("¡La fecha ingresada no existe!");
            return "No existe";
        }
    }

    public static boolean FechaExiste(int d, int m, int a) {
        boolean e = false;
        //para ver si la fecha existe en febrero con dia 29
        if (m == 2 && (d >= 1 && d <= 28)) {
            e = true;
        }
        //para ver si la fecha existe en mes con dias de entre 1 y 31
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) {
            e = true;
        }
        //para ver si la fecha existe en mes con dias de entre 1 y 30
        if ((m == 4 || m == 6 || m == 9) && (d >= 1 && d <= 30)) {
            e = true;
        }
        return e;
    }

    public static void LlenarBisiestos(int abisiestos[]) {
        int i = 0;
        abisiestos[i] = 1972;
        for (i = 1; i <= 69; i++) {
            abisiestos[i] = abisiestos[i - 1] + 4;
        }
    }

    public static boolean CompararAño(int a, int abisiestos[]) {
        boolean encontrado = false;
        for (int i = 0; i <= 69; i++) {
            if (a == abisiestos[i]) {
                encontrado = true;
            }
        }
        return encontrado;
    }
}
