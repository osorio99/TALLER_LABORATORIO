package flecha;

import javax.swing.JOptionPane;

public class Aplicacion2 {
    private double ladoA;
    private double ladoB;

    public void ingresarDatos()
    {
        String cadena;
        cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A");
        ladoA= Double.parseDouble(cadena);

        cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B");
        ladoB= Double.parseDouble(cadena);
    }

    public void calcularArea() {
        double resultado;

        resultado= ladoA * ladoB;

        JOptionPane.showMessageDialog(null,"El resultado es:"+resultado);
        }
}

