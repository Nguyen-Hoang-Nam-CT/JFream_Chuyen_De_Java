/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vethaphinhchunhat;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class RunVeThapHinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ tháp hình vuông");
        frame.setSize(407,440); // màn hình hiển thị thật sự là (390, 400) //vì phần x bị hao nhót 17, phần y bị hao nhót 40
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VeThapHinhChuNhat hinhVe = new VeThapHinhChuNhat();
        frame.add(hinhVe);
        
        frame.setVisible(true);
    }
    
}
