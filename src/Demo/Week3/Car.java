package Demo.Week3;

public class Car{
    private String make;
    private String model;
    private String reg;
    private double engine;
    private String fuel;
    private double currentMileage;
    private String driverSide;
    private int currentGear;
    private boolean airConOn;
    private boolean lightsOn;
    private String colour;

    public Car(String cMake, String cModel, String cReg, double cEngine, String
            cFuel, String cDriverSide, String cColour)
    {
        make = cMake;
        model = cModel;
        reg = cReg;
        engine = cEngine;
        fuel = cFuel;
        currentMileage = 0;
        driverSide = cDriverSide;
        currentGear = 1;
        airConOn = true;
        lightsOn = false;
        colour = cColour;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getRegistration()
    {
        return reg;
    }

    public void setRegistration(String newReg)
    {
        reg = newReg;
    }

    public boolean getLightsOn()
    {
        return lightsOn;
    }

    public void setLightsOn(boolean newLightsOn)
    {
        lightsOn = newLightsOn;
    }

    public int getCurrentGear()
    {
        return currentGear;
    }

    public void setCurrentGear(int newGear)
    {
        if (newGear <= 0)
        {
            System.out.println("Gear cannot be less than 1");
        }
        else if (newGear > 5)
        {
            System.out.println("Gear cannot be more than 5");
        }
        else
        {
            currentGear = newGear;
        }
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String newColour)
    {
        colour = newColour;
    }

    public double getCurrentMileage()
    {
        return currentMileage;
    }

    public void setCurrentMileage(double newMileage)
    {
        if (newMileage < currentMileage)
        {
            System.out.println("Mileage cannot go backwards");
        }
        else
        {
            currentMileage = newMileage;
        }
    }

    public String getCarInformation()
    {
        String printString = "Make: " + make;
        printString += "; Model: " + model;
        printString += "; Registration: " + reg;
        printString += "; Engine Size: " + engine;
        printString += "; Fuel: " + fuel;
        printString += "; Current Mileage: " + currentMileage;
        printString += "; Drivers Side: " + driverSide;
        printString += "; Colour: " + colour;

        return printString;
    }
        }