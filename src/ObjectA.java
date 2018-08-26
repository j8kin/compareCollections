public class ObjectA {
    private int id;
    private String name;
    private String value;

    /**
     * Constructor. Set private fields.
     * @param id object id
     * @param name object name
     * @param value object value
     */
    ObjectA(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    /**
     * Override Object.hashCode to be able to return the same hashCode for Objects which contain the same data
     * @return hash Code of an ObjectA
     */
    @Override
    public int hashCode() {
        return id + name.hashCode()+value.hashCode();
    }

    /**
     * Override Object.equals to be able to compare 2 objects based on field data
     * @param obj Object to compare
     * @return true if objects are equal (based on object fields) or false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ObjectA other = (ObjectA) obj;
        return id == other.id && name.equals(other.name) && value.equals(other.value);
    }
}
