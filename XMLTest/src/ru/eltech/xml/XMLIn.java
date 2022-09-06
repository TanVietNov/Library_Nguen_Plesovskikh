package ru.eltech.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.File;

public class XMLIn {
    public static void main(String[] args) {
        XStream xStream = new XStream();
        xStream .addPermission(AnyTypePermission.ANY);
        Settings settings = (Settings) xStream.fromXML(new File("C:\\Projects\\XMLTest\\xml.xml"));
//        String password = settings.getPassword();
//        System.out.println(password);
        System.out.println(xStream.toXML(settings));
    }
}
