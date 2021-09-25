/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawString;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Windows 10 Pro
 */
public class Ve_drawString extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.red);
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40); // tọa độ thằng này là tọa độ của đường thẳng nó nằm lên giống như mình viết trong tập ấy
        
        
        g.setColor(Color.green);
        g.fillRect(15, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);
        
        g.setColor(Color.blue);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 90);
        
        g.setColor(Color.orange);
        g.fillRect(15, 100, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 115);
    }

}
