public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("BC 00 294", "Lancia", "Kappa", 5, 24));
        fleetOfCars.addCar(new GasolineCar("KK 45 566", "Ford", "B-MAX", 5, 12));
        fleetOfCars.addCar(new GasolineCar("HJ 99 911", "Skoda", "Octavia", 5, 39));

        fleetOfCars.addCar(new DieselCar("LO 83 007", "AUDI", "A5 S", 5, 27, true));
        fleetOfCars.addCar(new DieselCar("OP 43 912", "Peugeot", "206", 5, 33, false));
        fleetOfCars.addCar(new DieselCar("MV 34 134", "Mercedes", "A220", 5, 24, true));

        fleetOfCars.addCar(new ElectricCar("CC 55 476", "Audi", "Etron", 5, 100, 473));
        fleetOfCars.addCar(new ElectricCar("QY 19 109", "Audi", "Etron S", 5, 140, 560));
        fleetOfCars.addCar(new ElectricCar("MO 47 284", "Tesla", "Model X", 5, 100, 402));

        System.out.println("**************************************");
        System.out.println("Fleet of cars:\n");
        System.out.println(fleetOfCars);
        System.out.println("**************************************");
        System.out.println();
        System.out.println("**************************************");
        System.out.println("Total registration fee for fleet: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr.");
        System.out.println("**************************************");
    }
}