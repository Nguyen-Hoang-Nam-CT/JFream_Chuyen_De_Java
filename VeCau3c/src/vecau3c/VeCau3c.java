/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vecau3c;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VeCau3c extends JPanel
{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.YELLOW);
        g.fillPolygon(new int[] {200,400,200,0}, new int[] {0,200,400,200},4);
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.green);
        g.fillOval(100, 100, 200, 200);
    }
    
}
