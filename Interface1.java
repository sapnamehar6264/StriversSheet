interface Engine {
    void start();
}

class ElectricalEngine implements Engine {

    public void start() {
        System.out.println("Electrical engine starts");
    }
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petro Engine starts");
    }
}

public class Interface1 {

    Engine engine;

    Interface1(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }

    public static void main(String[] args) {
        Interface1 car1 = new Interface1(new ElectricalEngine());
        car1.startCar();

        Interface1 car2 = new Interface1(new PetrolEngine());
        car2.startCar();
    }
}
