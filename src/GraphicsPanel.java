import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel{

    public GraphicsPanel(int width, int height){
        setSize(width,height);

    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(new Color(54, 40, 177));
        g2.fillOval(0, 0, getWidth(), getHeight());


    }

}