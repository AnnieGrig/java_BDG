package homework_class8;

public class Car {
    public String model;
    public String color;
    public int currentSpeed = 0;
    public boolean isEngieStart;

    public Car(String model, String color, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void stopEngie() {
        isEngieStart = false;
    }

    public void startEngie(){
        isEngieStart = true;
    }
}
