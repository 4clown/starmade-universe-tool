/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;
import java.io.*;

public class Config
{
           public Config() throws IOException
           {
               IOException ex;
               FileReader fr = new FileReader("config.txt");
               BufferedReader br = new BufferedReader(fr);
               
               String test = br.readLine();
               
               while ( test != null )
               {
                   test = br.readLine();
                   System.out.println(test);
               }
                              
               br.close();
               
               catch (IOException ex)
               {
                       ex.getMessage();
               }
               
           }
           
}
