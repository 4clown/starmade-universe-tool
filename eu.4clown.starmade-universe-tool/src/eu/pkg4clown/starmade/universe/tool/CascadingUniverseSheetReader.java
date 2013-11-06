/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;


import java.io.*;

public class CascadingUniverseSheetReader {
 
    private String Text; 
    
    public CascadingUniverseSheetReader(String path)
    {
        try {
               IOException nope;
               FileReader fr = new FileReader(path);
               BufferedReader br = new BufferedReader(fr);
               this.Text = br.readLine();
               
               while(Text != null) 
                                   {
                                   Text = br.readLine();
                                   Text += Text; 
                                   }
             }     catch (IOException nope) 
                                             {
                                             nope.getMessage();
                                             System.out.println(nope);
                                             }
    
    int start = Text.indexOf("");
    int end = Text.indexOf("");
    String x = Text.substring(start,end);
    
    int start2 = Text.indexOf("");
    int end2 = Text.indexOf("");
    String y = Text.substring(start2,end2);
    
    int start3 = Text.indexOf("");
    int end3 = Text.indexOf("");
    String z = Text.substring(start3,end3);
    
    
    
    
    } 
    
}

