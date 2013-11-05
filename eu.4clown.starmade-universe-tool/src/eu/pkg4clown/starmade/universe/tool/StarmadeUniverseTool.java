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
public class StarmadeUniverseTool extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Step1: Lesen der Config
        Config config = new Config();
        //Step2: Starten der Befehlsschleife
        new StarmadeUniverseTool().start();
        //Step3: Einlesen der CascadingUniverseSheets
        //Step4: Starten der Serverschleife
    }

    @Override
    public void run() {
        console();
    }
    
    public void console(){
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                switch(br.readLine()){ 
                    case "help": this.showHelp();
                }
            } catch (IOException ex) {
                Logger.getLogger(StarmadeUniverseTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void showHelp(){
        System.out.println("");
    }
}
