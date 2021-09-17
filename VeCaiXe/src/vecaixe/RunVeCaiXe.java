/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vecaixe;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class RunVeCaiXe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("bảng vẽ cái xe");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VeXe hinhVe = new VeXe();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
    
}
