public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //Car car = null; -- null pointer exception
        car.setColor("blue");
        car.setDoors(2);
        car.setMake("buccatti");
        System.out.println(car.getDoors());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        car.discribeCar();

        Car targe = new Car();
        targe.setConvertible(false);
        targe.discribeCar();
    }
}
