public class DieselCar extends AFuelCar {

    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        if (getKmPrLitre() < 5) {
            registrationFee += 10470;
            registrationFee += 15260;
        } else if (getKmPrLitre() < 10) {
            registrationFee += 5500;
            registrationFee += 2770;
        } else if (getKmPrLitre() < 15) {
            registrationFee += 2340;
            registrationFee += 1850;
        } else if (getKmPrLitre() < 20) {
            registrationFee += 1050;
            registrationFee += 1390;
        } else {
            registrationFee += 330;
            registrationFee += 130;
        }

        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + hasParticleFilter() +
                ", kmPrLitre=" + getKmPrLitre() +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", fuelType=" + getFuelType() +
                '}';
    }
}