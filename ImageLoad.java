import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImageLoad {
    private BufferedImage scrollWheel;
    private BufferedImage buttons;
    private BufferedImage logo;
    private BufferedImage base;

    private BufferedImage altscrollWheel;
    private BufferedImage altbuttons;
    private BufferedImage altlogo;
    private BufferedImage altbase;

    public ImageLoad() {
        try {
            scrollWheel = ImageIO.read(getClass().getResource("scrollWheel.png"));
            buttons = ImageIO.read(getClass().getResource("buttons.png"));
            logo = ImageIO.read(getClass().getResource("logo.png"));
            base = ImageIO.read(getClass().getResource("base.png"));
            altscrollWheel = ImageIO.read(getClass().getResource("altScrollWheel.png"));
            altbuttons = ImageIO.read(getClass().getResource("altButtons.png"));
            altlogo = ImageIO.read(getClass().getResource("altLogo.png"));
            altbase = ImageIO.read(getClass().getResource("altBase.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getScrollWheel() {
        return scrollWheel;
    }

    public BufferedImage getButtons() {
        return buttons;
    }

    public BufferedImage getLogo() {
        return logo;
    }

    public BufferedImage getBase() {
        return base;
    }

    public BufferedImage getAltScrollWheel() {
        return altscrollWheel;
    }

    public BufferedImage getAltButtons() {
        return altbuttons;
    }

    public BufferedImage getAltLogo() {
        return altlogo;
    }

    public BufferedImage getAltBase() {
        return altbase;
    }
}
