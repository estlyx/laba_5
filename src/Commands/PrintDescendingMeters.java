package Commands;

import ForCity.City;
import ForCity.CityCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * The type Print descending meters above sea level.
 */
public class PrintDescendingMeters implements CommandWithNoArg{
    @Override
    public String execute(Object o){
        String result = "---------------------------\n";
        CityCollection collection = new CityCollection();
        if (collection.getSize() == 0) return ("Коллекция пуста");
        else {
            System.out.println("Элементы в порядке возрастания телефонного кода:");
            //ArrayList<City> set = new ArrayList<City>(CityCollection.getCollection());
            ArrayList<City> set1 = new ArrayList<>(CityCollection.getCollection());
            Meters_comparator mc = new Meters_comparator();
            Collections.sort(set1, mc);
            /*int size = set.size();
            for (int i=0;i<size;i++){
                City c = set.stream().max(City::compareTo).get();
                result+=c.getTelephoneCode()+"\n---------------------------\n";
                set.remove(c);
            }
            return result;*/
            Iterator<City> it = (Iterator<City>) set1.iterator();
            while (it.hasNext()) {
                City city = (City) it.next();
                result+=city.getMetersAboveSeaLevel()+"\n---------------------------\n";
            }
            return result;

        }

    }

    @Override
    public String getName(){return "print_field_ascending_telephone_code";}
}
