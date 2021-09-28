/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrame;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class Jrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test JFrame");
        frame.setSize(400,400);                                 // lệnh kích thước cửa sổ
        frame.setLocationRelativeTo(null);                      //lệnh đưa vo giữa màn hình  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //lệnh tắt chương trình khi đóng cửa sổ
        frame.setVisible(true);                                 //lệnh để hiện cửa sổ ra màn hình
    }
    
}
