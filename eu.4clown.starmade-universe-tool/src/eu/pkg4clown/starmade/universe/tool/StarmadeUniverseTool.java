/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.util.List;


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
        config = new Config(path);
        return true;
    }

    @Override
    public boolean startConsole() {
        new Console().start();
        return true;
    }
}
