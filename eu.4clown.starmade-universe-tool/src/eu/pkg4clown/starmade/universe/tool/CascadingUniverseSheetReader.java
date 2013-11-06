/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

/**
 *
 * @author nf
 */
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
                   }catch (IOException nope) 
                                             {
                                             nope.getMessage();
                                             System.out.println(nope);
                                             }
    
    int a = Text.indexOf("");
    int b = Text.indexOf("");
    String Sektornummer = Text.substring(a,b);
    
    
    
    
    
    }
        
        
        
        
        
        
   /* 
    int a = platzhalter.indexof("")
    int b = platzhalter.indexof("")
    String Name = platzhalter.substring(a,b) */
    
    
    
    
            
    
    
    
    
    
    
    
    
    
    
}
}
