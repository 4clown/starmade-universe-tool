/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

/**
 *
 * @author nf
 */
public interface iStarmadeUniverseTool {
    public boolean loadSektor();
    public boolean startConsole();
    public boolean loadCascadingUniverseSheet(String path);
    public boolean loadConfig(String path);
}
