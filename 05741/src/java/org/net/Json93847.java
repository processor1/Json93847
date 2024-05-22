/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package json93847;

import java.io.FileReader;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.ScriptEngineManager;

import static java.lang.System.*;

/**
 *
 * @author sprin
 */
public class Json93847 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        if(args.length !=1){
            out.println("usage: java RunScript script");
            return;
        }
        ScriptEngineManager sm = new ScriptEngineManager();
        ScriptEngine se = sm.getEngineByName("nashorn");
        try {
            se.eval(new FileReader(args[0]));
        } catch (ScriptException e) {

            out.println(e.getMessage());

        } catch (IOException ex) {
            out.println(ex.getMessage());
        }
    }

}
