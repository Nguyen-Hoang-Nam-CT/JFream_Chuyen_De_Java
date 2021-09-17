/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vethaphinhchunhat;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VeThapHinhChuNhat extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int count = 0;
        for(int i = 400 - 15; i > 0; i -= 15)
        {
           for(int j = 0; j <= 390 - 30*(count+1); j += 30)
           {
                g.drawRect(j + 15 * count, i, 30, 15);
           } 
            count++;
        } 
    }
    
}
