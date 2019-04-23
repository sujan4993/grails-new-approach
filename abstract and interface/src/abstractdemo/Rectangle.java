package abstractdemo;

public class Rectangle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("draw of Rectangle");

    }

    @Override
    void resize() {
        System.out.println("resize of Rectangle");

    }
}
