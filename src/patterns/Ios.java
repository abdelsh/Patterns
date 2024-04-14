/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns;

/**
 *
 * @author hp
 */
public class Ios extends OS {
    
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Ios(int size, String description, int version) {
        super(description, version);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ios{" + super.toString() + "size=" + size + '}';
    }
    
    
}
