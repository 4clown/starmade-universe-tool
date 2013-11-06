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
public class Console extends Thread {

    @Override
    public void run() {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                switch (br.readLine()) {
                    case "help":
                        this.showHelp();
                }
            } catch (IOException ex) {
                Logger.getLogger(StarmadeUniverseTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showHelp() {
        System.out.println("");
    }
}
