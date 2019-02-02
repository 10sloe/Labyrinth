import javakarol.*;

class Aufgabe
{
    // Attribute
    Welt welt;
    Roboter robo;

    // Konstruktor
    Aufgabe()
    {
        welt = new Welt("laby1.kdw");
        robo = new Roboter(welt);
    }

    void los()
    {
       
    }   

}