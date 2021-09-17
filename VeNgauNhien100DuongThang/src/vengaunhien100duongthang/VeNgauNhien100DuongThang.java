/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vengaunhien100duongthang;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class VeNgauNhien100DuongThang extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        for(int i = 0; i < 100; i++)
        {
           g.setColor(VeNgauNhien100DuongThang.randColor());
           g.drawLine(VeNgauNhien100DuongThang.randInt(0, 500), VeNgauNhien100DuongThang.randInt(0, 500), VeNgauNhien100DuongThang.randInt(0, 500), VeNgauNhien100DuongThang.randInt(0, 500));
        }
    }
    public static int randInt(int min, int max)
    {
        Random r = new Random();
        return (r.nextInt(max - min) + min);
    }
    public static Color randColor()
    {
        Color c = new Color(VeNgauNhien100DuongThang.randInt(0, 255), VeNgauNhien100DuongThang.randInt(0, 255), VeNgauNhien100DuongThang.randInt(0, 255));
        return c;
    }
    
    }
