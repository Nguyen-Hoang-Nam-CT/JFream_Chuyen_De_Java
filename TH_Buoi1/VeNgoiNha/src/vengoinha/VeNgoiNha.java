/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vengoinha;

import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Admin
 */
public class VeNgoiNha extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 130, 400, 270);
        g.drawLine(200, 0, 0, 130);
        g.drawLine(200, 0, 400, 130);
        g.drawRect(30, 160, 80, 80);
        g.drawRect(30, 290, 80, 80);
        g.drawRect(290, 160, 80, 80);
        g.drawRect(290, 290, 80, 80);
        g.drawRect(160, 260, 80, 140);
    }
    
}
