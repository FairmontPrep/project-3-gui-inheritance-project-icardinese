import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MouseControl extends JPanel {

    private ImageLoad imageLoad;
    private boolean useAltBase = false;
    private boolean useAltScrollwheel = false;
    private boolean useAltButtons = false;
    private boolean useAltLogo = false;

    private BufferedImage base;
    private BufferedImage altBase;
    private BufferedImage scrollWheel;
    private BufferedImage altScrollWheel;
    private BufferedImage buttons;
    private BufferedImage altButtons;
    private BufferedImage logo;
    private BufferedImage altLogo;
    
    public MouseControl() {
        setPreferredSize(new Dimension(600,600));
        imageLoad = new ImageLoad();

        base = imageLoad.getBase();
        altBase = imageLoad.getAltBase();
        scrollWheel = imageLoad.getScrollWheel();
        altScrollWheel = imageLoad.getAltScrollWheel();
        buttons = imageLoad.getButtons();
        altButtons = imageLoad.getAltButtons();
        logo = imageLoad.getLogo();
        altLogo = imageLoad.getAltLogo();
        setLayout(new BorderLayout());
    }
    
    public void swapLayer(String layerName) {
        switch (layerName) {
            case "Base":
                useAltBase = !useAltBase;
                break;
            case "Scroll Wheel":
                useAltScrollwheel = !useAltScrollwheel;
                break;
            case "Buttons":
                useAltButtons = !useAltButtons;
                break;
            case "Logo":    
                useAltLogo = !useAltLogo;
                break;
            default:
                System.out.println("Invalid layer name");
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        BufferedImage baseImage = useAltBase ? altBase : base;
        BufferedImage scrollWheelImage = useAltScrollwheel ? altScrollWheel : scrollWheel;
        BufferedImage buttonsImage = useAltButtons ? altButtons : buttons;
        BufferedImage logoImage = useAltLogo ? altLogo : logo;

        drawLayer(g2d, baseImage);
        drawLayer(g2d, logoImage);
        drawLayer(g2d, buttonsImage);
        drawLayer(g2d, scrollWheelImage);
    }

    private void drawLayer(Graphics2D g2d, BufferedImage image) {
        if (image != null) {
            int x = (getWidth() - image.getWidth()) / 2;
            int y = (getHeight() - image.getHeight()) / 2;
            g2d.drawImage(image, x, y, this);
        }
    }
}
