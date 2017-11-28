
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmz
 */
public class Dosyaolusturma {
    public static void main(String[] args) {
        
        PrintWriter printWriter=null;
            File file=new File("deneme2452.txt");
            try{
            printWriter = new PrintWriter(file);
            printWriter.println("mamaz");
            printWriter.println("mamaz");
            printWriter.println("mamaz");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dosyaolusturma.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printWriter.close();
        }
    }   
}
