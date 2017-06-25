package Business;

import Percistance.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wizlamar on 24.06.17.
 */
public class DrinkLogic {

    Getraenke liste1 = new Getraenke();

    public  void addGetraenk(Getraenk g){
        liste1.addGetraenk(g);
    }

    /**
     * @return liste1
     */
    public List<Getraenk> getList(){
        return liste1.getList();
    }



}