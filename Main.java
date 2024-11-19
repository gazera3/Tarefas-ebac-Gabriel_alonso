public class Main {
    public static void main(String[] args) {
        // Criar uma fábrica de SUVs
        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.assemble();

        // Criar uma fábrica de Sedans
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.assemble();
    }
}
