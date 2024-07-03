package org.example;

public class Dog extends Animal{ //child class of Animal
    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt","big",50);
    }

    public Dog(String type,double weight){
        this(type,weight,"Perky","curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight); //super must be the first statement
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();  //this super keyword been used here
    }
    public void makeNoise(){ //overriding the parent class
        //if we don't change it has a property of parent class or else we can change those

        if(type == "wolf"){ // type can be initialized by typing protected
            System.out.println("Ow owwwwww");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed); //change the behaviour of the code
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            bark();
            run();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Dog Running!");
    }

    private void walk(){
        System.out.print("Dog Walking!");
    }

    private void wagTail(){
        System.out.print("Wagging Tail!");
    }
}
