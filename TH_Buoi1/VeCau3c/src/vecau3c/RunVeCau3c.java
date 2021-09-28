/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vecau3c;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class RunVeCau3c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("bảng vẽ cái xe");
        frame.setSize(417,440);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VeCau3c hinhVe = new VeCau3c();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
    
}
