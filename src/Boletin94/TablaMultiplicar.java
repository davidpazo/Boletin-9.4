/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin94;

import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class TablaMultiplicar {

    double num;

    public double validarDato() {
        double valor;
        do {
            String dato = JOptionPane.showInputDialog("Introduce un número");
            valor = Double.parseDouble(dato);
            if (valor == 0) {
                JOptionPane.showMessageDialog(null, "Dato no válido");
            }
        } while (valor == 0);
        return valor;
    }

    public void calcularTabla() {
        num = this.validarDato();
        JOptionPane.showMessageDialog(null, "x1=" + num * 1 + "\n"
                + "x2=" + num * 2 + "\n"
                + "x3=" + num * 3 + "\n"
                + "x4=" + num * 4 + "\n"
                + "x5=" + num * 5 + "\n"
                + "x6=" + num * 6 + "\n"
                + "x7=" + num * 7 + "\n"
                + "x8=" + num * 8 + "\n"
                + "x9=" + num * 9 + "\n"
                + "x10=" + num * 10);
    }
}
