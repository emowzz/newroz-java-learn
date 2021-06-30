public abstract class Bird extends Animal implements CanFLy{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping it's wings");
    }
}
