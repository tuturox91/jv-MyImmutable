package core.basesyntax;

import java.util.Objects;

public class Wheel implements Cloneable {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    //implement this class

    @Override
    public String toString() {
        return "Wheel{"
            + "radius=" + radius
            + '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected Wheel clone() {
        Wheel wheel = new Wheel(radius);
        return wheel;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        if(!(obj instanceof Wheel)) return  false;
        Wheel otherObj = (Wheel) obj;
        if(this.radius == otherObj.radius) return true;
        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
