package abstractdemo;

public class Circle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Draw of Circle");
    }

    @Override
    void resize() {
        System.out.println("Resize of Circle");

    }
}
