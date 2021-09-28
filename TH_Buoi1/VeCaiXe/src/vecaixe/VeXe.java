/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vecaixe;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author Admin
 */
public class VeXe extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 200);
        g.setColor(Color.GRAY);
        g.fillRect(0, 200, 400, 100);
        g.setColor(Color.cyan);
        g.fillRect(270, 30, 130, 75);
        g.setColor(Color.red);
        g.fillOval(50, 160, 80, 80);
        g.fillOval(240, 160, 80, 80);
    }
    
}
