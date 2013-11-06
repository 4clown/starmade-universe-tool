/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import eu.pkg4clown.starmade.universe.tool.Blueprint;
import eu.pkg4clown.starmade.universe.tool.Sector;
import eu.pkg4clown.starmade.universe.tool.iStarmade;

/**
 *
 * @author nf
 */
public class StarmadeGame implements iStarmade{

    @Override
    public void setBlueprintInSektor(Sector p_sektor, Blueprint p_blueprint) {
        System.out.println("Erstelle Objekt in ,... usw...");
    }
    
}
