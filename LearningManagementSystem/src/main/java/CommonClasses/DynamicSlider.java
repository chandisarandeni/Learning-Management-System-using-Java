package CommonClasses;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;

public class DynamicSlider extends JFrame {

    private final DrawerController drawer;

    // Constructor for the DynamicSlider class (which extends JFrame)
    public DynamicSlider() {
        // Set up the frame's basic properties
        setTitle("Dynamic Slider Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create a menu button
        JButton btn_Menu = new JButton();
        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(resizeImage(MenuColored, 35, 35)); // Corrected to use resizeImage method
        btn_Menu.setBounds(10, 10, 50, 50); // Positioning the button
        add(btn_Menu);

        // Initialize the drawer and menu
        drawer = Drawer.newDrawer(this)
                .headerHeight(100)
                .space(100)
                .background(new Color(55, 92, 92)) // RGB values for #375C5C
                .backgroundTransparent(0.15f)
                .drawerBackground(new Color(55, 92, 92))
                .addChild(createDrawerItem("Dashboard"))
                .addChild(createDrawerItem("Student"))
                .addChild(createDrawerItem("Lecturer"))
                .addChild(createDrawerItem("Time Table"))
                .addChild(createDrawerItem("Course Content"))
                .addChild(createDrawerItem("Examination"))
                .addChild(createDrawerItem("Message"))
                .addChild(createDrawerItem("Settings"))
                .space(100)
                .addChild(createDrawerItem("Logout"))
                .build();

        setVisible(true);  // Make the frame visible
    }

    // Helper method to create individual items in the drawer
    private DrawerItem createDrawerItem(String text) {
        // Return a DrawerItem based on the provided text
        return new DrawerItem(text); // Assuming you have a DrawerItem class
    }

    // Resize method to adjust image size (Placeholder method)
    private static ImageIcon resizeImage(String imagePath, int width, int height) {
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static void main(String[] args) {
        new DynamicSlider(); // Instantiate the frame with the dynamic slider
    }
}
