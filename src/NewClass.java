/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mmz
 */
public class NewClass {
    String yazi;
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<1000;i++){
            sb.append("eaduration"+i+",");
        }
        System.out.println(sb);
    }
}
