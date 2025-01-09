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
public class AdminViewLecturerEdit extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewLecturerEdit
     */
    private final DrawerController drawer;
    public String adminUsername;

    public AdminViewLecturerEdit(String adminUsername) {
        initComponents();

        this.adminUsername = adminUsername;
        lbl_adminUsername.setText(adminUsername);


        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

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

        lbl_adminUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btn_Verify1 = new javax.swing.JButton();
        btn_Verify2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_adminUsername.setText("AdminID");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\StudentActivities\\Icons\\MenuColored.png")); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Lecturers");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setText("Lecturer ID");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setText(":");

        jLabel21.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel21.setText("Full Name");

        jLabel22.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel22.setText(":");

        jLabel23.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel23.setText("NIC");

        jLabel25.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel25.setText(":");

        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel26.setText("Contact");

        jLabel27.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel27.setText(":");

        jLabel28.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel28.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        btn_Verify1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify1.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify1.setText("Save");
        btn_Verify1.setAlignmentY(0.0F);
        btn_Verify1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_Verify2.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify2.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify2.setText("Cancel");
        btn_Verify2.setAlignmentY(0.0F);
        btn_Verify2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(168, 168, 168))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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
            java.util.logging.Logger.getLogger(AdminViewLecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewLecturerEdit("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JButton btn_Verify1;
    private javax.swing.JButton btn_Verify2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbl_adminUsername;
    // End of variables declaration//GEN-END:variables
}
