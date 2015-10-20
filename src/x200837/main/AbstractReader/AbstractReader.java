package x200837.main.AbstractReader;

/**
 * Created by Adam on 2015-10-18.
 */
public abstract class AbstractReader
{
    protected String path;
    public abstract String wczytaj(String path);

    public void wywal()
    {
        System.out.println(wczytaj(path));
    }
}
