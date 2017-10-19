import java.lang.annotation.*;


@Monitor
public class Screen {

    Size size;
    String aspectRatio;
    String classification;

    Screen(Size size){
        this.size = size;
        this.aspectRatio= this.getClass().getAnnotation(Monitor.class).aspectRatio();
        this.classification= this.getClass().getAnnotation(Monitor.class).classification();
    }

    @Override
    public String toString() {
        return "This monitor size: " + size + ", aspectratio: " + aspectRatio + ", classification: " + classification;
    }

    public static void main(String[] args) {

            Screen tv43 = new Screen(Size.INCH15);
            System.out.println(tv43);
            Screen tv169 = new Screen(Size.INCH23);
            System.out.println(tv169);
            Screen tv179 = new Screen(Size.INCH29);
            System.out.println(tv179);

        }
    }


