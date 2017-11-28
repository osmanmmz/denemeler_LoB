/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemeler.datasetTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mmz
 */
public class DataSetTest {
    
    public static void main(String [] args){
    
        String fileName="tmdb_5000_movies.csv";
        File file=new File(fileName);
        try{
            Scanner inputStream=new Scanner(file);
            while(inputStream.hasNext()){
                String data=inputStream.next();
                System.out.println(data);
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    
}
