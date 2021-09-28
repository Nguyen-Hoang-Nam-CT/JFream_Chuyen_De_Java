/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vengoisao;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VeNgoiSao extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawLine(143, 18, 75, 243);
        g.drawLine(143, 18, 213, 243);
        g.drawLine(213, 243, 32, 105);
        g.drawLine(32, 105, 258, 105);
        g.drawLine(258, 105, 75, 243);
        
    }
    
}
