/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vengaunhien100duongthang;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */

public class RunVeNgauNhien100DuongThang {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ ngẫu nhiên 100 đường thẳng có màu");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VeNgauNhien100DuongThang hinhVe = new VeNgauNhien100DuongThang();
        frame.add(hinhVe);
        frame.setVisible(true);
    }
}
