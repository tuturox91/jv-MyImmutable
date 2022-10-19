package core.basesyntax;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Make this class immutable. See requirements in task description.
 */
public final class Car {
    private final int year;
    private final String color;
    private final List<Wheel> wheels;
    private final Engine engine;

    public Car(int year, String color, List<Wheel> wheels, Engine engine) {
        this.year =year;
        this.color = color;
        this.wheels = getWheelsClone(wheels);
        this.engine = engine == null? null :engine.clone();
    }

    @Override
    public String toString() {
        return "Car{"
            + "year=" + year
            + ", color='" + color + '\''
            + ", wheels=" + wheels
            + ", engine=" + engine
            + '}';
    }

    public Car changeEngine(Engine engine) {
        return new Car(this.year, this.color, this.wheels, engine);
    }

    public Car addWheel(Wheel wheel) {
        List<Wheel> newWheels = getWheelsClone(this.wheels);
        newWheels.add(wheel);
        return new Car(year,color,newWheels,engine);
    }

    public Car changeColor(String color) {
        return new Car(this.year, color, this.wheels, this.engine);
    }

    public Engine getEngine() {
        return engine == null ? null : engine.clone();
    }

    public List<Wheel> getWheels() {
        return getWheelsClone(this.wheels);
    }

    public String getColor() {
        return (this.color);
    }

    public int getYear() {
        return year;
    }

    private List<Wheel> getWheelsClone(List<Wheel> wheels) {
        List<Wheel> newWheels = new ArrayList<>(wheels.size());
        for (Wheel wh:wheels) {
            newWheels.add(wh.clone());
        }
        return newWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, color, wheels, engine);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        if(!(obj instanceof Car)) return false;
        Car otherObj = (Car) obj;
        if(this.year == otherObj.year
                && this.color.equals(otherObj.color)
                && this.wheels.equals(otherObj.wheels)
                && this.engine.equals(otherObj.engine)) return true;
        return  false;
    }


}
