/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JTextField;

/**
 *
 * @author u05521390170
 */
public class Util {
    public void habilitar(JTextField ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(false);
            
        }
    }
    
}
