package Car;

import java.util.Arrays;

public class AutoSalon {
   private Long id;
   private String autoName;
   private Car[] cars;

    public AutoSalon(Long id, String autoName, Car[] cars) {
        this.id = id;
        this.autoName = autoName;
        this.cars = cars;

    }
    public void AddCar(Car car){
         int number = cars.length +1;
         cars = Arrays.copyOf(cars,number);
         cars[number -1] = car;

    }

    public void AllCar(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public Car CarFindBYId(Long carId){
        for (Car car : cars) {
            if (car.getId().equals(carId)){
                return car;
            }
        }
        return null;
    }
    public void deleteCarId (Long carId){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(carId)){
                cars[i] = cars[cars.length -1];
                cars = Arrays.copyOf(cars,cars.length -1);
                break;
            }
        }

    }
    public void updateCarId(Long carId,Car newCar){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(carId)){
                cars[i]= newCar;
                break;

            }
        }
    }
    public void updateCarModelBYId(Long carId,String model){
        for (Car car : cars) {
            if (car.getId().equals(carId)){
                car.setModel(model);
            }

        }

    }

    public String toString() {
        return "AutoSalon{" +
                "id=" + id +
                ", autoName='" + autoName + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}



