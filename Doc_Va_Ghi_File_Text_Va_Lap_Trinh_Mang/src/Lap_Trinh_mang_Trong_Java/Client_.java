package Lap_Trinh_mang_Trong_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client_ {
    public static void main(String[] args) 
    {
        try 
        {
            Socket s = new Socket("127.0.0.1", 9999);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            
            String mess = in.readLine();
            System.out.println(mess);
            
            Random r = new Random();
            out.println("I'm Client" + r.nextInt());
            
            s.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Client_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
