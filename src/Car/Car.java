package Car;

import java.time.LocalDate;

public class Car {
  private Long id;
  private  String marca;
  private String model;
  private String color;
  private int price;
  private LocalDate year;
  private double volume;

    public Car(Long id, String marca, String model, String color, int price, LocalDate year, double volume) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", volume=" + volume +
                '}';
    }
}
