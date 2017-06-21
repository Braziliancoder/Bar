import java.util.ArrayList;

/**
 * Created by wizlamar on 07.06.17.
 */

public class Daten {

    public static void main(String[] args) {

        ArrayList<Alkoholinterface> list = new ArrayList();

        Alkoholinterface a = new Alkohol(14 , 3);
        Alkoholinterface b = new Bier();

        list.add(a);
        list.add(b);

        b.berechnePromill();

    }

}
