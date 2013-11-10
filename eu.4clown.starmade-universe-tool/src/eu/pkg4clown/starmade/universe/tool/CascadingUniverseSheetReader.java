/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;


import java.io.*;

class CascadingUniverseSheetReader {
 
    private String sectorString; 

    private String platzhalter;
    
    private static final String testcvs = ""
            + "#SECTOR 44,-87,4 {"
            + "   command1: wert;"
            + "   command2: wert;"
            + "   funktion(var1,var2);"
            + "}"
            + "#REGION 24,-87,4 to 2,2,2 {"
            + "   command2: wert;"
            + "   funktion(var1,var2);"
            + "}"
            + "#SECTOR 12,-4,3 {"
            + "   command1: wert;"
            + "   command2: wert;"
            + "   funktion(var1,var2);"
            + "}";
    

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
                                    sectorString += line; 
                                    }           
                                    line = br.readLine();
                                    }
            }                            
                                             catch (IOException nope) 
                                             {
                                             nope.getMessage();
                                             System.out.println(nope);
                                             }
              return sectorString;  
    }    
   private String sectorParser (String SectorNr) 
        {
            int startx = sectorString.indexOf(SectorNr) + SectorNr.length() + 1;  //wenn in der sectoren config: sector1=x,y,z
            int endx = sectorString.indexOf(",",startx);


            int starty = sectorString.indexOf(platzhalter) + platzhalter.length(); //liest die x koordinate anstelle der y koordinate
            int endy = sectorString.indexOf(",",starty);
            int startz = sectorString.indexOf(platzhalter) + platzhalter.length(); //liest die x koordinate anstelle der z koordinate

            int endz = sectorString.indexOf(",", startz); 
            return sectorString.substring(startx, endx) + "," + sectorString.substring(starty, endy) + "," + sectorString.substring(startz, endz);
        }

}