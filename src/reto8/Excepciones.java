
package reto8;

import java.io.IOException;

public class Excepciones {
    public double ladoA;
    public double ladoB;
    public boolean esValido;
    
    public double calculaHipotenusa(double a, double b) throws IOException{
        return Math.sqrt((a*a)+(b*b));
    }
    private boolean validaDatos(double a, double b) throws NumberFormatException{
        
        return true;
    }
}
