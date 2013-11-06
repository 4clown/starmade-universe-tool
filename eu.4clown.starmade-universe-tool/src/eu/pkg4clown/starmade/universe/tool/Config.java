/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.pkg4clown.starmade.universe.tool;

import java.io.*;

class Config {

    private String test;
    private String command;

    public Config(String path) {
        loadText(path);
        System.out.println(parseParameter(command));
    }

    private String loadText(String path) {
        try {
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
        return test;
    }

    private String parseParameter(String command) {

        int start = test.indexOf(command) + command.length();
        int end = test.indexOf("\n", start);
        return test.substring(start, end);
    }
}
