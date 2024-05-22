/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package json93847;

import org.json.*;

/**
 *
 * @author sprin
 */
public class XMLTOJSON {

    public static void main(String[] args) {

        String xm = "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note>";
        JSONObject json = XML.toJSONObject(xm);
        String out = json.toString();
        System.out.println(out);
    }
}
