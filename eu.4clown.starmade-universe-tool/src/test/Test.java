/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import eu.pkg4clown.starmade.universe.tool.StarmadeUniverseTool;
import eu.pkg4clown.starmade.universe.tool.iStarmade;
import eu.pkg4clown.starmade.universe.tool.iStarmadeUniverseTool;
import java.io.IOException;

/**
 *
 * @author nf
 */
public class Test {
    
    private iStarmadeUniverseTool isut;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Test test = new Test();
    }
    
    Test(){
        //Step1: Erstelle ein StarmadeSpiel
        iStarmade starmade = new StarmadeGame();
        //Step2: Initialisiere die Library 
        isut = new StarmadeUniverseTool(starmade);
        isut.loadConfig("c:\\config.cfg");
        isut.loadCascadingUniverseSheet("c:\\univers.cus");
        isut.startConsole();
       
        //Step3: Einlesen der CascadingUniverseSheets
        //Step4: Starten der Serverschleife
    }
}
