/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;
import java.io.*;
/**
 *
 * @author nf
 */
public class Config
{
    
    try {
            BufferedReader in = new BufferedReader(new FileReader("Config.txt"));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.pintln("Geleene Zeile: " + zeile);
            }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
}
