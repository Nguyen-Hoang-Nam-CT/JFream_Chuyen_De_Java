/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve_dau_x_bang_hinh_tron_co_to_mau;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Run_Ve_Dau_X_Bang_Hinh_Tron_Co_To_Mau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ dấu x bằng các vòng tròn có màu");
        frame.setSize(417,440);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Ve_Dau_X_Bang_Hinh_Tron_Co_To_Mau hinhVe = new Ve_Dau_X_Bang_Hinh_Tron_Co_To_Mau();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
    
}
