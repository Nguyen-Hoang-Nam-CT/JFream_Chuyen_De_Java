/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc_Ghi_Doi_Tuong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class Doc_Doi_Tuong_Nhan_Vien {
    public static void main(String[] args) 
    {
        JFileChooser jFileChooser = new JFileChooser();
        if(jFileChooser.showOpenDialog(jFileChooser) == JFileChooser.APPROVE_OPTION)
        {
            File file = jFileChooser.getSelectedFile();
            //--------------------------------- Trọng tâm bài học ---------------------------------
            try 
            {
                //-------------------- Đọc --------------------
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                
                NhanVien nv1 = (NhanVien)objectInputStream.readObject();
                System.out.print("\n" + nv1.toString());
                NhanVien nv2 = (NhanVien)objectInputStream.readObject();
                System.out.print("\n" + nv2.toString());
                objectInputStream.close();
                fileInputStream.close();
                //---------------------------------------------
            } 
            catch (FileNotFoundException ex) //catch của fileInputStream
            {
                Logger.getLogger(Doc_Doi_Tuong_Nhan_Vien.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) //catch của objectInputStream
            {
                Logger.getLogger(Doc_Doi_Tuong_Nhan_Vien.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (ClassNotFoundException ex)// catch của 2 thằng đọc dòng 35, 37
            {
                Logger.getLogger(Doc_Doi_Tuong_Nhan_Vien.class.getName()).log(Level.SEVERE, null, ex);
            }
            //--------------------------------------------------------------------------------------
        }
    }
}
