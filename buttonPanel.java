import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;

public class buttonPanel extends JPanel {
    
    private MouseControl mouseControl;

    public buttonPanel(MouseControl mouseControl) {
        this.mouseControl = mouseControl;

        createButtonPanel();
    }
    
    private void createButtonPanel() {

        JButton baseBtn = new JButton("Base");
        baseBtn.addActionListener(e -> mouseControl.swapLayer("Base"));

        JButton logoBtn = new JButton("Logo");
        logoBtn.addActionListener(e -> mouseControl.swapLayer("Logo"));

        JButton scrollWheelBtn = new JButton("Scroll Wheel");
        scrollWheelBtn.addActionListener(e -> mouseControl.swapLayer("Scroll Wheel"));
        
        JButton buttonsBtn = new JButton("Buttons");
        buttonsBtn.addActionListener(e -> mouseControl.swapLayer("Buttons"));

        add(baseBtn);
        add(logoBtn);
        add(scrollWheelBtn);
        add(buttonsBtn);

        setPreferredSize(new Dimension(800, 50));
    }
}
