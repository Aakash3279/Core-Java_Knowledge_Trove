import java.util.Locale;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "grey";
    private int doors = 4;
    private boolean convertible = true;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }

    public int getDoors(){
        return doors;
    }

    public void setMake(String make) {
        if(make == null) make = "unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "tesla", "buccatti","porsche" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setModel(String model){
        this.model = model;
    }


    public void discribeCar(){
        System.out.println(doors+"-doors "+color+" "+make+" "+model+" "+(convertible ? "convertible" : "Not Convertible"));
    }
}
