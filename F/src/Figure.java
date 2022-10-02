import javax.swing.*;

abstract class Figure{
    float x;
    float y;

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }

    public abstract float getPerimeter();

}
