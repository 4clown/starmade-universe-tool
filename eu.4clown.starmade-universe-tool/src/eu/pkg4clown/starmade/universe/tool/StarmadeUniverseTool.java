/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

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
    }
    
    private void init(){
        //Step1: Lesen der Config
        //Step2: Starten der Befehlsschleife
        //Step3: Einlesen der CascadingUniverseSheets
        //Step4: Starten der Serverschleife
    }
}
