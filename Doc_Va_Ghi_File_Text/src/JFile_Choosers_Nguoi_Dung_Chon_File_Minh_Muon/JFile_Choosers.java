/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFile_Choosers_Nguoi_Dung_Chon_File_Minh_Muon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Admin
 */
public class JFile_Choosers {
    public static void main(String[] args) 
    {
        try 
        {
            JFileChooser jFileChooser = new JFileChooser();
            if(jFileChooser.showOpenDialog(jFileChooser) == JFileChooser.APPROVE_OPTION)
            {
                File file = jFileChooser.getSelectedFile();
                System.out.println("Cac so doc duong la:");
                Scanner sc = new Scanner(file);
                int a;
                do{
                    a = sc.nextInt();
                    System.out.print(a);
                }while(sc.hasNext());
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(JFile_Choosers.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("\nKhong the mo file ban chon");
        }        
    }
}
