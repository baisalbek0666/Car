package Car;

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
              new Car(2L,"BMW","34","black",9800, LocalDate.of(1995,3,2),1.8)
        };
        AutoSalon autoSalon = new AutoSalon(1L,"Baisalbek",cars);

        autoSalon.AddCar(new Car(3L,"KIA","K5","blue",20000,LocalDate.of(2020,12,3),2.2));
        autoSalon.AllCar();
        System.out.println();
        System.out.println(autoSalon.CarFindBYId(2L));
        autoSalon.deleteCarId(3L);
        System.out.println();
        autoSalon.AllCar();
        autoSalon.updateCarId(2L,new Car(2L,"Hyundai","Sanata","white",15000,LocalDate.of(2022,1,21),2.5));
        System.out.println("Update method");
        autoSalon.AllCar();


        autoSalon.updateCarModelBYId(6L,"Toyota");
        System.out.println("Update method");
        autoSalon.AllCar();

    }
}