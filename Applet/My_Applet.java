import java.applet.*;
import java.awt.*;
public class My_Applet extends Applet{//Here Applet Class Present in applet package
    public void paint(Graphics g){//Here we pass the object of Graphics class and Graphics class present in awt package   
       g.drawString("Mainak Podder", 100, 100);
    }
}