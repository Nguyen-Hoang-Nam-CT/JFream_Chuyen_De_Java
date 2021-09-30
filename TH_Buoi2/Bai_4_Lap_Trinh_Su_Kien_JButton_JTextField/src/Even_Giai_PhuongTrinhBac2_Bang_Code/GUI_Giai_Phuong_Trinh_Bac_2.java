/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Even_Giai_PhuongTrinhBac2_Bang_Code;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class GUI_Giai_Phuong_Trinh_Bac_2 extends JFrame
{
    public static float denta(float a, float b, float c)
    {
        return b*b - 4*a*c;
    }
    public static float nghiem2(float a, float b, float denta)
    {
        return (float)((-b - sqrt(denta))/(2*a));
    }
    public static float nghiem1(float a, float b, float denta)
    {
        return (float)((-b + sqrt(denta))/(2*a));
    }
    public void createGUI()
    {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0,2));
        JTextField txt1 = new JTextField(15),
                   txt2 = new JTextField(15),
                   txt3 = new JTextField(15),
                   txt4 = new JTextField(15);
        
        p.add(new JLabel("a"));
        p.add(txt1);
        p.add(new JLabel("b"));
        p.add(txt2);
        p.add(new JLabel("c"));
        p.add(txt3);
        p.add(new JLabel("Result"));
        p.add(txt4);
        
        add(p, BorderLayout.NORTH);
        Button btnGiaiPhuongTrinh = new Button("Giải phương trình");
        add(btnGiaiPhuongTrinh, BorderLayout.SOUTH);
        
        btnGiaiPhuongTrinh.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                float DT = denta(Float.parseFloat(txt1.getText()), Float.parseFloat(txt2.getText()), Float.parseFloat(txt3.getText()));
                if(DT < 0)
                    txt4.setText("Phương trình vô nghiệm");
                else if(DT == 0)
                    txt4.setText("x1 = x2 = " + (-Float.parseFloat(txt2.getText())/2*Float.parseFloat(txt1.getText())));
                else if(DT > 0)
                    txt4.setText("x1 = " + nghiem1(Float.parseFloat(txt1.getText()),
                            Float.parseFloat(txt2.getText()), DT) + ", x2 = " + nghiem2(Float.parseFloat(txt1.getText()), Float.parseFloat(txt2.getText()), DT));
            }
        });
        
        setSize(400,400);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
