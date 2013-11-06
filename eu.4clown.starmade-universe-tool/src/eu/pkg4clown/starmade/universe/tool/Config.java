/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.*;

class Config {

    private String test;

    public Config(String path) {
        try {
            IOException ex;
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            this.test = br.readLine();

            while (test != null) {
                test = br.readLine();

                test += test;

            }

        } catch (IOException ex) {
            ex.getMessage();
            System.out.println(ex);
        }

        System.out.println(test);
    }
}
