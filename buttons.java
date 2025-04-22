import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class buttons extends base {
    private BufferedImage buttons;
    private BufferedImage altbuttons;
    private boolean useAltButtons = false;
    private String message = "white buttons";


    public buttons() {
        try {
            buttons = ImageIO.read(getClass().getResource("buttons.png"));
            altbuttons = ImageIO.read(getClass().getResource("altButtons.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getButtonsImage() {
        if (useAltButtons) {
            return altbuttons;
        }
        else {
            return buttons;
        }
    }

    public BufferedImage swapButtons() {
        if (useAltButtons) {
            useAltButtons = !useAltButtons;
            messageUpdate();
            return altbuttons;
        }
        else {
            useAltButtons = !useAltButtons;
            messageUpdate();
            return buttons;
        }
    }

    private void messageUpdate() {
        if (useAltButtons) {
            message = "black buttons";
        }
        else {
            message = "white buttons";
        }
    }

    public String getButtonsMessage() {
        return super.getBaseMessage() + message + " ";  
    }
}
