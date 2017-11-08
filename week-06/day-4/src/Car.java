import java.awt.color.*;

public class Car {

    Color color;
    Type type;

    Car(){
        this.color = Color.colorGenerate();
        this.type = Type.typeGenerate();
    }

    @Override
    public String toString() {
        return color + " " + type;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }
}
