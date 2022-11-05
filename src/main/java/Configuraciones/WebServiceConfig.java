package Configuraciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WebServiceConfig {
    private final String path = System.getProperty("user.home") + "/.GymAdmin/.properties";
    private HashMap<String, String> configs;

    public WebServiceConfig() throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String linea;
            configs = new HashMap<>();

            System.out.println("Utilizando archivo de configuracion: " + path);

            while((linea = reader.readLine()) != null){
                if(!linea.startsWith("#")) {
                    String[] config = linea.split("=");
                    configs.put(config[0], config[1]);
                }
            }
        } catch(Exception e) {
            throw new Exception("Error leyendo archivo " + path);
        }
    }

    public String getConfigOf(String nombre) {
        return configs.get(nombre);
    }
}
