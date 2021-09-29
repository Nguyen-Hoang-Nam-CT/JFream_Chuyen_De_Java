/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyendong;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ChuyenDong extends JPanel
{
    public void run()
    {
        int dx = 1, dy = 1;
        Graphics g = this.getGraphics();
        
            int x = 80,y = 80;
        int count = 0;
        setBackground(Color.BLUE);
        while(true)
        {  
                if(x == 0 || x == 600)
                    dx *= -1;
                if(y == 0 || y == 320)
                    dy *= -1;
                g.setColor(Color.red);
                g.fillOval(x, y, 40, 40);
                
                try 
                { 
                    Thread.sleep(1);
                } 
                catch (InterruptedException ex) 
                {
                    System.err.print(ex.getMessage());
                }
                
                g.setColor(Color.white);
                g.fillOval(x, y, 40, 40);
                
                x += dx;
                y += dy;
                
                count++;
                if(count == 50000)
                    break;
            
        }
    }
}


