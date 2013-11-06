/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;


import java.io.*;

class CascadingUniverseSheetReader {
 
    private String Sector; 
    private String Platzhalter;
  
    public CascadingUniverseSheetReader (String path) {
        loadText(path);
        
    }
    
       private String loadText (String path) {
        try {
              
               FileReader fr = new FileReader(path);
               BufferedReader br = new BufferedReader(fr);
               String line = br.readLine();
               
               while(line != null) 
                                    {
                                    if (!line.startsWith("#"))
                                    {
                                    Sector += line; 
                                    }           
                                    line = br.readLine();
                                    }
            }                            
                                             catch (IOException nope) 
                                             {
                                             nope.getMessage();
                                             System.out.println(nope);
                                             }
              return Sector;  
    }    
   private String Sektorparser (String platzhalter) 
        {
            int start = Sector.indexOf("");
            int end = Sector.indexOf("");
            return Sector.substring(start, end);
        }

}