/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve_dau_x_bang_hinh_tron_co_to_mau;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Ve_Dau_X_Bang_Hinh_Tron_Co_To_Mau extends JPanel
{

    @Override
                    
    protected void paintComponent(Graphics g) 
    {
        int temp;
        int countY = 360;
        int doDay = 20;
        super.paintComponent(g); 
        for(int i = 0; i <= 360; i+=doDay)
        {
            g.setColor(Color.blue);
            g.fillOval(i, i, 40, 40);
            g.setColor(new Color(255,0,255));
            g.fillOval(i, countY, 40, 40);
            countY -= doDay;
        }
    }
    
}
