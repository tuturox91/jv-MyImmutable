package core.basesyntax;

import java.util.Objects;

public class Engine implements Cloneable {
    private int horsePower;
    private String manufacturer;

    public Engine(int horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    @Override
    protected Engine clone() {
        Engine engine;
        try {
            engine = (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone is not supported! ", e);
        }
        return engine;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        if(!(obj instanceof Engine)) return  false;
        Engine otherObj = (Engine) obj;
        if(this.horsePower == otherObj.horsePower
                && this.manufacturer.equals(manufacturer)) return true;
        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, manufacturer);
    }

    @Override
    public String toString() {
        return "Engine{"
                + "horsePower=" + horsePower
                + ", manufacturer='" + manufacturer + '\''
                + '}';
    }
}
