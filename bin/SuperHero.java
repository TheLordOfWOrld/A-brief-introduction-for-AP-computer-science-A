public class SuperHero {
    String name;
    String superPower;
    int age;

    public SuperHero(String name, String superPower,int age){
               this.name = name;
               this.superPower = superPower;
               this.age = age;
    }
    public SuperHero(String name, String superPower){
        this.name = name;
        this.superPower = superPower;
    }

    public SuperHero(String name){
        this.name = name;
    }

    public void output(){
        System.out.println("the name of this hero is "+name);
        System.out.println("the superpower that he have is "+superPower);
        System.out.println("his age is"+age);
    }
}
