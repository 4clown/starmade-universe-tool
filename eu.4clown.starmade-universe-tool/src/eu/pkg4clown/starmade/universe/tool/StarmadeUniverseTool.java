/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.IOException;


/**
 *
 * @author nf
 */
public class StarmadeUniverseTool extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        new StarmadeUniverseTool().start();
    }

    public StarmadeUniverseTool() {
        init();
        //printIn ("Test");
    }
    
    private void init(){
        try {
            //Step1: Lesen der Config
            Config config = new Config();
            //Step2: Starten der Befehlsschleife
            //Step3: Einlesen der CascadingUniverseSheets
            //Step4: Starten der Serverschleife
        } catch (IOException ex) {
            System.out.println("Eine IOException ist aufgetreten");
            
        }
    }
}
