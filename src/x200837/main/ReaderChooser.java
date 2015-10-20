package x200837.main;

import x200837.main.AbstractReader.AbstractReader;
import x200837.main.FileReader.FileReader;
import x200837.main.WebPageReader.WebPageReader;

/**
 * Created by Adam on 2015-10-19.
 */
public class ReaderChooser {
    public static AbstractReader stworz(String path)
    {
        if (path.startsWith("http://") || path.startsWith("www."))
            return new WebPageReader(path);
        return new FileReader(path);
    }
}
