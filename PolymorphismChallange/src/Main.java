public class Main {
    public  static void runRace(Car car){
        car.runEngine();
        car.drive();
    }
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2023 Ferrari 488 GT3",
                15.4,6);
        runRace(ferrari);

        Car tesla  = new ElectricCar("2023 Red Tesla Model 3",
                568,75);
        runRace(tesla);
        System.out.println("_--------------------_");
        Car ferrariHybrid = new HybridCar("2023 Black Ferrari SF90 Stradale",
                16,8,8);
        runRace(ferrariHybrid);
    }
}