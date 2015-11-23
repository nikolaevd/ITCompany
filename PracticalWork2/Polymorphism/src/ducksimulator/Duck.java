
package ducksimulator;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    public void setFlyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(IQuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    
    // утка может плавать
    public void swim(){
        System.out.println("Утка плывет..");
    }
    
    // утка может крякать
    public void performQuack(){
        quackBehavior.quack();
    }
    
    // утка может летать
    public void performFly(){
        flyBehavior.fly();
    }
    
    // подтип каждой конкретной разновидности утки реализует свою специфическую версию display()
    public abstract void display();
}
