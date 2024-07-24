package LLD.Factory_Design_Pattern.FactoryDesignDemo;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();    
            default:
                return null;
        }
    }
}
