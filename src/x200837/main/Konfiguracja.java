package x200837.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Adam on 2015-10-19.
 */
public class Konfiguracja
{
    private Properties p = new Properties();

    public Konfiguracja(String path)
    {
        try {
            p.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getProperty(String klucz)
    {
        return p.getProperty(klucz);
    }
}
