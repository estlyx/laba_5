package Commands;

import ForCity.City;
import ForCity.CityCollection;

/**
 * The type Show.
 */
public class Show implements CommandWithNoArg{
    @Override
    public String execute(Object o) {
        CityCollection collection = new CityCollection();
        if (collection.getSize() == 0) return ("Коллекция пустая.");
        else {
            String result="---------------------------\n";
            for (City city : collection.getCollection()) {
                result+=(city.getInfo())+"\n---------------------------\n";
            }
            return result;
        }
    }

    @Override
    public String getName() {
        return "show";
    }
}
