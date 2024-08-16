import Car.Car;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car деген класс тузобуз полелери
//                ( id, marka, model, color, price,
//                        year, volume(объем ));
//        AvtoSalon деген класс полелери (id,avtoName,
//                Car[] cars);
//        main методдорду чакырып иштетебиз.
//        Бир метод тузобуз кайсы машына эн орточо
//        баада.
//        public void addCar(Car car);
//        public void getAllCar();
//        public Student getCartById(Long carId)
//        public void deleteCar(Long carId)
//        public void updateCar(Long carId,
//                Car newCar;

        Car[] cars = new Car[]{
              new Car(1L,"Mercedes","Luparik","white",12000, LocalDate.of(2002,1,21),2.5),
              new Car(1L,"BMW","34","black",9800, LocalDate.of(1995,3,2),1.8)
        };






    }
}