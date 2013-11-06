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
public class StarmadeUniverseTool extends Thread implements iStarmadeUniverseTool{

    private iStarmade game;

    public StarmadeUniverseTool(iStarmade starmade) {
        this.game = starmade;
    }

    @Override
    public void run() {
        Config config = new Config();
        console();
    }
    
    void console(){
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

    @Override
    public boolean loadSektor() {
        //Soll den Sektor auf eingaben Prüfen wenn keine Vorhanden return false
        //falls gefunden dann z.B game.setBlueprintInSektor(new Sektor(10,4,2), new Blueprint());
        return false;
        
    }
}
