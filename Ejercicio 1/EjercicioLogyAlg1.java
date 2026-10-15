/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciologyalg1;

import javax.swing.JOptionPane;




/**
 *
 * @author SENA
 */
public class EjercicioLogyAlg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Se declaran las variables.
double base,altura,area,perimetro;

JOptionPane.showMessageDialog(null,"¡Bienvenido(a)!");

//Se solicitan los valores para realizar el calculo.
base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de 'Base'"));

altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de 'Altura'"));

//Formulas para el calculo.
area = base*altura;
perimetro = base+base+altura+altura;

//Se imprimen los resultados.

JOptionPane.showMessageDialog(null,"El valor de area es: "+area+"\n"
        + "El valor del perimetro es: "+perimetro);
        // TODO code application logic here
    }//Llave que cierra Main.
    
}//Llave que cierra Class.
