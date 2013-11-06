/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.*;

class Config {

    private String configString;
    private String command;

    public Config(String path) {
        loadText(path);
        System.out.println(parseParameter(command));
    }

    private String loadText(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {
                
                if (!line.startsWith("#")) {
                    configString += line;  
                }
                line = br.readLine();
            }

        } catch (IOException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
        return configString;
    }

    private String parseParameter(String command) {

        int start = configString.indexOf(command) + command.length() + 1;
        int end = configString.indexOf("\n", start);
        return configString.substring(start, end);
    }
}
