package vdmouselistener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VDMouselistener extends JPanel implements MouseListener
{
//-------------------------
    BufferedImage img;
    Graphics g;
//-------------------------
    int x1 = -1,
        x2 = -1,
        y1 = -1,
        y2 =  -1;
    public VDMouselistener()
    {
        img = new BufferedImage(417, 440, BufferedImage.TYPE_INT_RGB) ;// kích thước của tấm hình
        g = img.getGraphics(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }
    
    
//------------------------------------------------------------------------------------------------------------    
    @Override
    public void mouseClicked(MouseEvent e) // khi click và nhả chuột trái
    {
        //JOptionPane.showMessageDialog(this, e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) // nhấn chuột trái, phải đều xảy ra (không cần nhả)
    {
        // tự bấm
//        if(e.getButton() == 1)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột trái");
//        else if(e.getButton() == 2)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột giữa");
//        else if(e.getButton() == 3)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột phải");

        //code của thầy
//        if(e.getButton() == e.BUTTON1)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột trái");
//        else if(e.getButton() == e.BUTTON2)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột cuộn");
//        else if(e.getButton() == e.BUTTON3)
//            JOptionPane.showMessageDialog(this, "Bạn đã click chuột phải");
    }
    
    @Override
    public void mouseReleased(MouseEvent e) // nhả chuột trái, phải đều phát sinh
    {
        if(x1 == -1 && y2 == -1)
        {
            x1 = e.getX();
            y1 = e.getY();
        }
        else if(x2 == -1 && y2 == -1)
        {
            x2 = e.getX();
            y2 = e.getY();
            g.setColor(Color.red);
            g.drawLine(x1, y1, x2, y2);
            this.repaint();
            x1 = x2 = y1 = y2 = -1;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) // khi duy chuyển chuột vào cái vùng của nó
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) //khi duy chuyển chuột ra khỏi vùng
    {
        
    }
    
}