package com.sofkau.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Variables {
    public static List<String> getUserPasword() throws IOException {
        List<String> credentials = new ArrayList<>();
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File("src/test/resources/carpeta.properties")));
        credentials.add(prop.getProperty("USER"));
        credentials.add(prop.getProperty("PASSWORD"));
        return credentials;
    }
}
