package patterns;


public abstract class OS {
    private String description;
    private int version;

    public OS(String description, int version) {
        this.description = description;
        this.version = version;
    }

    public OS() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "OS{" + "description=" + description + ", version=" + version + '}';
    }
    
    
    
}
