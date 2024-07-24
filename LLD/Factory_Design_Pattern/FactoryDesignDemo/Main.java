package LLD.Factory_Design_Pattern.FactoryDesignDemo;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("Circle");
        shapeObj.draw();
    }
}
