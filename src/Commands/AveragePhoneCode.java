package Commands;

import ForCity.City;
import ForCity.CityCollection;

/**
 * The type Average phone code.
 */
public class AveragePhoneCode implements CommandWithNoArg{
    @Override
    public String execute(Object o){
        int avg = 0;
        for (City city: CityCollection.getCollection()){
            avg += city.getTelephoneCode();
        }
        int size = CityCollection.getCollection().size();
        if (size >0){
            return "Средний код телефона в коллекции: " + String.valueOf(avg / size);
        }
        return "Коллекция пуста";
    }
    @Override
    public String getName(){return "average_of_telephone_code"; }
}
