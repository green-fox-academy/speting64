import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Monitor {

    String aspectRatio() default "4:3";
    String classification() default "TFT";
}
