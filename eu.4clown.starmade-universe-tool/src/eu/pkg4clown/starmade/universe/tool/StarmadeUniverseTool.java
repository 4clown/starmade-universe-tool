/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nf
 */
public class StarmadeUniverseTool implements iStarmadeUniverseTool{

    private iStarmade game;
    private List<Sector> sectors;
    private List<Region> regions;
    private Config config;

    public StarmadeUniverseTool(iStarmade starmade) {
        this.game = starmade;
    }
    

    @Override
    public boolean loadSektor() {
        //Soll den Sektor auf eingaben Prüfen wenn keine Vorhanden return false
        //falls gefunden dann z.B game.setBlueprintInSektor(new Sektor(10,4,2), new Blueprint());
        return false;
        
    }

    @Override
    public boolean loadCascadingUniverseSheet(String path) {
        
        return true;
    }

    @Override
    public boolean loadConfig(String path) {
        config = new Config();
        return true;
    }

    @Override
    public boolean startConsole() {
        new Console().start();
        return true;
    }
}
