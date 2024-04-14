package patterns;

public class Android extends OS{
    
    private int capacity;

    public Android(int capacity, String description, int version) {
        super(description, version);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Android{" + super.toString() + "capacity=" + capacity + '}';
    }
    
    
}
