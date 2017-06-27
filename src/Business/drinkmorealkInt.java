package Business;

import java.util.ArrayList;

/**
 * Created by wizlamar on 24.06.17.
 */
public interface drinkmorealkInt {
    public double getPrice();
    public void setPrice(double price);
    public int getAlcoholPegel();
    public void setAlcoholPegel(int alcoholPegel);
    public ArrayList<Getraenk> addList(Getraenk g);
}
