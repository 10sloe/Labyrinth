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
        // Gehe bis zur ersten Wand
        while(!robo.IstZiegel())
        {
            robo.Schritt();
        }
        robo.RechtsDrehen();
        while(!robo.IstWand())
        {
            if(!robo.IstZiegel())
            {
                robo.Schritt();
                if(!robo.IstZiegelLinks())
                {
                    robo.LinksDrehen();
                }
            }
            else
            {
                if(robo.IstZiegelLinks())
                {
                    robo.RechtsDrehen();
                }
                else
                {
                    robo.LinksDrehen();
                }
            }
            
        }

    }
}