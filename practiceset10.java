abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changenib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir hello sir");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("Sleeping.....");
    }
}
public class practiceset10 {
    public static void main(String[] args) {
        //prblm1 and prblm 2(create an abstract class pen with methods as write and refil)
    FountainPen pen = new FountainPen();
    pen.changenib();
    //question3
        Human harry = new Human();
        harry.eat();
        //question5
        Monkey m1 = new Human();
        m1.jump();

        BasicAnimal lavish = new Human();
        lavish.eat();
        lavish.sleep();

    }
}
