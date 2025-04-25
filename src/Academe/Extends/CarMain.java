package Academe.Extends;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();

        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
        electricCar.openDoor();
        electricCar.charge();
        gasCar.fillUp();
        gasCar.openDoor();
        System.out.println(Math.PI);
    }
}
