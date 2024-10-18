import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletHappyOrSadFace extends Applet implements ItemListener {
    int f = 1; // 1 for happy face, 2 for sad face
    Checkbox c1, c2;
    CheckboxGroup cbg;

    public void init() {
        cbg = new CheckboxGroup(); // Checkbox group to allow only one selection
        c1 = new Checkbox("Happy face", true, cbg); // Happy face selected by default
        c2 = new Checkbox("Sad face", false, cbg); // Sad face not selected

        // Adding ItemListener to the checkboxes
        c1.addItemListener(this);
        c2.addItemListener(this);

        // Adding checkboxes to the applet
        add(c1);
        add(c2);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Changing the face depending on the selected checkbox
        if (c1.getState()) {
            f = 1; // Happy face selected
        } else {
            f = 2; // Sad face selected
        }
        repaint(); // Repainting the applet to show the selected face
    }

    @Override
    public void paint(Graphics g) {
        // Drawing the face outline and features
        g.drawOval(150, 150, 100, 100); // Face
        g.fillOval(170, 170, 10, 10); // Left eye
        g.fillOval(220, 170, 10, 10); // Right eye
        g.drawLine(200, 190, 200, 220); // Nose

        // Drawing smile or frown based on the value of 'f'
        if (f == 1) {
            g.drawArc(175, 190, 50, 50, 0, -180); // Smile (happy)
        } else if (f == 2) {
            g.drawArc(175, 210, 50, 50, 0, 180); // Frown (sad)
        }
    }
}

/*
 * <html>
 * <applet code= "AppletHappyOrSadFace.class" width= "500"
 * height="300"></applet>
 * </html>
 */
