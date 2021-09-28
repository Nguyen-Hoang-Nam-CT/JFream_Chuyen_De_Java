
package DrawString;

import javax.swing.JFrame;

public class Run_drawString extends JFrame{

    Ve_drawString ve_drawString;
    
    public Run_drawString(){
        ve_drawString = new Ve_drawString();
        add(ve_drawString);
    }
    
    public static void main(String[] args) {
        
        Run_drawString frame = new Run_drawString();
        frame.setSize(400, 180);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(Run_drawString.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
