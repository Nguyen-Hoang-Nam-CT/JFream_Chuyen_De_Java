/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vengoisao;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class RunVeNgoiSao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ ngôi sao");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VeNgoiSao hinhVe = new VeNgoiSao();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
}
