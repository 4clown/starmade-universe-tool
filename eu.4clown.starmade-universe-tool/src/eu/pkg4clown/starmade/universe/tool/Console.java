/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nf
 */
class Console extends Thread {

    @Override
    public void run() {
         System.out.println("Wilkommen im Starmade Universe Tool!");
         System.out.println("Irgendwelche Befehle?");
         
         while (true) {
           
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                
                switch (br.readLine()) {
                    case "help":
                        this.showHelp();
                        break;
                    default:
                        this.showDefault();
                }
            } catch (IOException ex) {
                Logger.getLogger(StarmadeUniverseTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showHelp() {
        System.out.println("Help    Zeigt dir alle Befehle an");
        System.out.println("Test1   Test1");
        System.out.println("Test2   Test2");
        System.out.println("Test3   Test3");
    }
}
    public void showDefault() {
            System.out.println("Befehl nicht gefunden");
}