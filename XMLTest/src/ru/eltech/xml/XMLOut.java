package ru.eltech.xml;

import com.thoughtworks.xstream.XStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

public class XMLOut {

    public static void main(String[] args) {
        Settings settings = new Settings();
        settings.setHost("localhost");
        settings.setPort("5432");
        settings.setLogin("postgresql");
        settings.setPassword("12345678");
        HashMap<String, String> map = new HashMap<>();
        map.put("a1", "123");
        map.put("a2", "456");
        map.put("a3", "789");
        settings.setParams(map);
        XStream xStream = new XStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Projects\\XMLTest\\xml.xml");
            xStream.toXML(settings, fileOutputStream);
//            String text = xStream.toXML(settings);
//            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
