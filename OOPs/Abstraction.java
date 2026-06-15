package OOPs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Abstraction {
    public static void main(String[] args) {
      Car sc = new SportsCar("Ford","Mustang");
      sc.StartEngine();
      sc.shiftGear(2);
      sc.brake();
    }
}
// abstract class
abstract class Car{
    abstract void StartEngine();
    abstract void shiftGear(int gear);
    abstract void brake();

}
class SportsCar extends Car{
String model;
String brand;
int currentSpeed;
boolean isStart;
    SportsCar(String b, String m) {
        this.brand = b;
        this.model = m;
       isStart = false;
        currentSpeed = 0;

    }
    @Override
    void StartEngine() {
        isStart=true;
        System.out.println("brand : "+brand+", model: "+model);
    }

    @Override
    void shiftGear(int gear) {
if (!isStart){
    System.out.println("brand : "+brand+", model : "+model+" Engine is off! Cannot Shift Gear.");
    return;
}
        System.out.println("brand : "+brand+", model : "+model+", Shift Gear."+gear);

    }

    @Override
    void brake() {
   currentSpeed =-20;
   if (currentSpeed<0)currentSpeed=0;
   System.out.println("brand : "+brand+", model : "+model+", break! speed is now"+currentSpeed+" km/h");
    }


}