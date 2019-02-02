import javakarol.*;

class Aufgabe
{
    // Attribute
    Welt welt;
    Roboter robo;

    // Konstruktor
    Aufgabe()
    {
        welt = new Welt("laby2.kdw");
        robo = new Roboter(welt);
    }

    void los()
    {
       
    }
}
