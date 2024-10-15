//Abstract class Vehicle
abstract class MyVehicle {
    abstract void start();
    abstract void stop();
}

// Car class extending Vehicle
class MyCar extends MyVehicle {
    @Override
   public void start() {
        System.out.println("Car is starting.");
    }

    @Override
   public void stop() {
        System.out.println("Car is stoping.");
    }

    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.start();
        myCar.stop();
    }
}

// Bike class extending Vehicle
class MyBike extends MyVehicle {
    @Override
   public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
  public void stop() {
        System.out.println("Bike is stoping.");
    }

    public static void main(String[] args) {
        MyBike myBike = new MyBike();
        myBike.start();
        myBike.stop();
    }
}


