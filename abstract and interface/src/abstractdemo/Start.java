package abstractdemo;

public class Start {

    int x,y;

    public static void main(String[] args) {
        GraphicObject graphicObject= new Circle();
        graphicObject.draw();
        Circle circle = new Circle();
        circle.draw();

        GraphicObject graphicObject1 = new Rectangle();
        graphicObject1.draw();
        graphicObject1.resize();


    }

}
