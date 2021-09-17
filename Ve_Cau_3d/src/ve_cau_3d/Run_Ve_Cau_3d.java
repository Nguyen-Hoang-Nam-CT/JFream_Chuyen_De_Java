/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve_cau_3d;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Run_Ve_Cau_3d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẻ cô 3d (không biết gọi tên cái hình này là gì :)) biết số bài tập nó à)");
        frame.setSize(417, 440);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Ve_Cau_3d hinhVe = new Ve_Cau_3d();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
    
}
