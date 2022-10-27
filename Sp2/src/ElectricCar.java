public class ElectricCar extends ACar {

    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (getBatteryCapacityKWh() * 1000) / getMaxRangeKm();
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = Math.round(100 / (getWhPrKm() / 91.25f));
        if (kmPrLitre < 5) {
            return 10470;
        } else if (kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + getBatteryCapacityKWh() +
                ", maxRange=" + getMaxRangeKm() +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                '}';
    }
}