/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singlylinkedqueue;

import javax.swing.JOptionPane;

/**
 *
 * @author gschroeder
 */
public class UnderflowException extends Exception {
       public void showMessage() {
        JOptionPane.showMessageDialog(null, "Não existem elementos para serem retirados!");
    }
    
    
}
