/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminActivities;

import CommonClasses.ImageResizer;
import LoginFrames.Home;
import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.Timer;

/**
 *
 * @author chand
 */
public class AdminViewMessage extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewMessage
     * @param adminUsername
     */
    
    private final DrawerController drawer;
    public String adminUsername;
    
    public AdminViewMessage(String adminUsername) {
        initComponents();
        
        this.adminUsername = adminUsername;
        lbl_adminUsername.setText(adminUsername);

        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

        String AdminBanner = "src\\main\\java\\LoginFrames\\Images\\Error.png";
        lbl_lecturerLoginImage.setIcon(ImageResizer.resizeImage(AdminBanner, 400, 400));
        
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

        // Optionally, display the admin username in the dashboard
        lbl_adminUsername.setText(adminUsername);
    }
    
    private DrawerItem createDrawerItem(String title) {
        DrawerItem item = new DrawerItem(title)
                .build();

        // Add an action listener to handle item selection
        item.addActionListener(e -> handleDrawerItemSelection(title));

        return item;
    }

    private void handleDrawerItemSelection(String title) {
        switch (title) {
            case "Dashboard":
                AdminDashboard adminDashboard = new AdminDashboard(adminUsername);
                adminDashboard.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Student":
                AdminViewStudent adminViewStudent = new AdminViewStudent(adminUsername);
                adminViewStudent.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Lecturer":
                AdminViewLecturer adminViewLecturer = new AdminViewLecturer(adminUsername);
                adminViewLecturer.setVisible(true);
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Time Table":
                AdminViewTimetable adminViewTimetable = new AdminViewTimetable();
                adminViewTimetable.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Course Content":
                AdminViewCourseContent adminViewCourseContent = new AdminViewCourseContent(adminUsername);
                adminViewCourseContent.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Examination":
                AdminViewExamination adminViewExamination = new AdminViewExamination(adminUsername);
                adminViewExamination.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Message":
                AdminViewMessage adminViewMessage = new AdminViewMessage(adminUsername);
                adminViewMessage.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Settings":
                AdminViewSettings adminViewSettings = new AdminViewSettings(adminUsername);
                adminViewSettings.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Logout":
                Home home = new Home();
                home.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            default:
                // Handle unknown cases
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Menu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_adminUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_lecturerLoginImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\StudentActivities\\Icons\\MenuColored.png")); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Lecturers");

        lbl_adminUsername.setText("AdminID");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        lbl_lecturerLoginImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\LoginFrames\\Images\\Error.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(330, 330, 330)
                        .addComponent(lbl_adminUsername)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_lecturerLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_adminUsername))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_lecturerLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btn_MenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminViewMessage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_adminUsername;
    private javax.swing.JLabel lbl_lecturerLoginImage;
    // End of variables declaration//GEN-END:variables
}
