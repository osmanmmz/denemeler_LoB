/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordtest;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author mmz
 */
public class wordtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileOutputStream outputStream=new FileOutputStream("12358seample.docx");
            XWPFDocument doc=new XWPFDocument();
            XWPFParagraph paraTit=doc.createParagraph();
            paraTit.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paraTitRun=paraTit.createRun();
            paraTitRun.setBold(true);
            paraTitRun.setFontSize(20);
            paraTitRun.setText("osman mamaz yapar mıııı?");
            doc.write(outputStream);
            outputStream.close();
            JOptionPane.showMessageDialog(null, "oldu be gardaş");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
