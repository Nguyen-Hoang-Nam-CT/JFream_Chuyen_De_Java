/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve_cau_3d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Ve_Cau_3d extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //vẽ nền vuông màu vàng
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 400, 400);
        
        //vẽ viền vuôn màu đen
        g.setColor(Color.black);
        g.drawRect(0, 0, 400, 400);
        
        //vè nền tròn màu xanh lá
        g.setColor(Color.green);
        g.fillOval(100, 100, 200, 200);
        
        //vẻ viền hình tròn màu đen
        g.setColor(Color.black);
        g.drawOval(100, 100, 200, 200);

        //vẻ cung để tạo miện cười
        g.drawArc(120, 105, 160, 160, 230, 80);
        
        //vẻ mắt và mũi màu đen
        g.setColor(Color.black);
        g.fillOval(145, 140, 40, 40);
        g.fillOval(215, 140, 40, 40);
        g.fillOval(180, 190, 40, 40);
    }
    
    
}
