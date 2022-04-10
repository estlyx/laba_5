package ForCity;

/**
 *The type City
 */
public class City implements Comparable{
    private int id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long area; //Значение поля должно быть больше 0
    private long population; //Значение поля должно быть больше 0, Поле не может быть null
    private float metersAboveSeaLevel;
    private java.time.LocalDate establishmentDate;
    private int telephoneCode; //Значение поля должно быть больше 0, Максимальное значение поля: 100000
    private Government government; //Поле может быть null
    private Human governor; //Поле может быть null


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets coordinates.
     *
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets coordinates.
     *
     * @param coordinates the coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Gets creation date.
     *
     * @return the creation date
     */
    public java.time.LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Sets creation date.
     *
     * @param creationDate the creation date
     */
    public void setCreationDate(java.time.LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets area size.
     *
     * @return the area size
     */
    public long getAreaSize() {
        return area;
    }

    /**
     * Sets area size.
     *
     * @param area the area size
     */
    public void setAreaSize(long area) {
        this.area = area;
    }

    /**
     * Gets population size.
     *
     * @return the population size
     */
    public long getPopulation(){return population;}

    /**
     * Sets population size.
     *
     * @param population the population size
     */
    public void setPopulation(long population){this.population = population;}

    /**
     * Gets meters above sea level.
     *
     * @return the meters above sea level
     */
    public float getMetersAboveSeaLevel() {return metersAboveSeaLevel;}

    /**
     * Sets meters above sea level.
     *
     * @param metersAboveSeaLevel the meters above sea level
     */
    public void setMetersAboveSeaLevel(float metersAboveSeaLevel) {this.metersAboveSeaLevel = metersAboveSeaLevel;}

    /**
     * Gets establishment date.
     *
     * @return the establishment date
     */
    public java.time.LocalDate getEstablishmentDate(){return establishmentDate;}
    /**
     * Sets meters above sea level.
     *
     * @param establishmentDate the meters above sea level
     */
    public void setEstablishmentDate(java.time.LocalDate establishmentDate){this.establishmentDate = establishmentDate;}

    /**
     * Gets telephone code.
     *
     * @return the telephone code
     */
    public int getTelephoneCode(){return telephoneCode;}
    /**
     * Sets telephone code.
     *
     * @param telephoneCode the telephone code
     */

    public void setTelephoneCode(int telephoneCode){this.telephoneCode = telephoneCode;}

    /**
     * Gets telephone code.
     *
     * @return the telephone code
     */
    public Government getGovernment() {return government;}
    /**
     * Sets govetnment.
     *
     * @param government the govetnment
     */
    public void setGovernment(Government government){
        this.government = government;}

    /**
     * Gets governor.
     *
     * @return the governor
     */
    public Human getGovernor() {return governor;}
    /**
     * Sets governor.
     *
     * @param governor the governor
     */
    public void setGovernor(Human governor) {this.governor = governor;}

    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo() {
        return "Город [id:" + id + "]:\n" + "Название: " + name + "\nКоординаты:\nx: " + coordinates.getX() +
                "\ny: " + coordinates.getY() +  "\nДата cоздания: " + creationDate + "\nПлощадь: " + area +
                "\nЧисленность населения: "+ population + "\nУровень над морем: " + metersAboveSeaLevel + "\nДата учреждения: "+ establishmentDate + "\nТелефонный код: "+ telephoneCode + "\nВласти: "+ government + "\nГубернатор ростом: "+ governor.getHeight();
    }

    @Override
    public int compareTo(Object o) {
        City city = (City)o;
        return (int) (this.getTelephoneCode()-city.getTelephoneCode());
    }
}
