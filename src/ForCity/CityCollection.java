package ForCity;

import Commands.Phone_code_comparator;

import java.time.LocalDate;
import java.util.*;

/**
 * The type City collection.
 */
public class CityCollection {
    private static ArrayList<City> collection= new ArrayList<>();
    private static LocalDate creationDate;

    /**
     * Instantiates a new City collection.
     */
    public CityCollection(){creationDate = LocalDate.now();}

    /**
     * Gets collection.
     *
     * @return the collection
     */
    public static ArrayList<City> getCollection() {
        return collection;
    }

    /**
     * Sets collection.
     *
     * @param collection the collection
     */
    public static void setCollection(ArrayList<City> collection) {CityCollection.collection = collection;}

    /**
     * Gets creation date.
     *
     * @return the creation date
     */
    public static LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Sets creation date.
     *
     * @param creationDate the creation date
     */
    public static void setCreationDate(LocalDate creationDate) {CityCollection.creationDate = creationDate;}

    /**
     * Clear.
     */
    public void clear(){ collection.clear(); }

    /**
     * Get free id int.
     *
     * @return the int
     */
    public static long getFreeId(){
        /*long size = collection.size();
        java.util.Hashtable<Integer, String > busyIds= new java.util.Hashtable<Integer, String>();
        int id = 1;
        while (true){
            if (busyIds.get(id) == null) {
                return id;
            }
            else id ++;
        }*/
        int id = 1;
        while (true){
            if (CityCollection.isIndexBusy(id)){
                id+=1;
            }
            else{
                return id;
            }
        }
    }

    /**
     * Get size int.
     *
     * @return the int
     */
    public int getSize(){
        return collection.size();
    }

    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo() {
        return "Тип коллекции: ArrayList\nРазмер коллекции: " + this.getSize() + "\nВремя последней инициализации: " + creationDate;
    }

    /**
     * Is index busy boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public static boolean isIndexBusy(int id){
        for (City city: collection)
            if (city.getId() == id) return true;
        return false;
    }

    /**
     * Add.
     *
     * @param city the city
     */
    public void add(City city){collection.add(city);}

}
