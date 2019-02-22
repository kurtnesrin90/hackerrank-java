import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Complete the classes below
class Flower {

    public String whatsYourName() {
        // TODO Auto-generated method stub
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName() {
        // TODO Auto-generated method stub
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName() {
        // TODO Auto-generated method stub
        return "Lily";
    }
}

abstract class Region {

    public abstract Flower yourNationalFlower();
}

class WestBengal extends Region{

    @Override
    public Flower yourNationalFlower() {
        // TODO Auto-generated method stub
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{

    @Override
    public Flower yourNationalFlower() {
        // TODO Auto-generated method stub
        return new Lily();
    }
}