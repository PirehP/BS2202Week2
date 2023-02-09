package Demo.Week3;

import java.util.ArrayList;

public class CarDealership
{
    ArrayList<Car> listofCars;
    public CarDealership()
    {
        listofCars = new  ArrayList<Car>();
    }
    public void buyCar(Car car)
    {
        listofCars.add(car);
    }
    public void sellCar(Car car)
    {
        listofCars.remove(car);
    }
    public Car getCar(int index)
    {
        return listofCars.get(index);
    }

}