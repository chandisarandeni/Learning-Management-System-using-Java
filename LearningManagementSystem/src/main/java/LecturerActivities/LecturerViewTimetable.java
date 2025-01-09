/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LecturerActivities;

import CommonClasses.ImageResizer;
import LoginFrames.Home;
import StudentActivities.StudentDashboard;
import StudentActivities.StudentViewCourseContent;
import StudentActivities.StudentViewTimetable;
import java.awt.Color;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author chand
 */
public class LecturerViewTimetable extends javax.swing.JFrame {

    /**
     * Creates new form LecturerViewTimetable
     */
    private final DrawerController drawer;

    public LecturerViewTimetable() {
        initComponents();

        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

        drawer = Drawer.newDrawer(this)
                .headerHeight(100)
                .space(100)
                .background(new Color(55, 92, 92)) // RGB values for #375C5C
                .backgroundTransparent(0.15f)
                .drawerBackground(new Color(55, 92, 92))
                .addChild(createDrawerItem("Dashboard"))
                .addChild(createDrawerItem("Time Table"))
                .addChild(createDrawerItem("Course Content"))
                .addChild(createDrawerItem("Examination"))
                .addChild(createDrawerItem("Message"))
                .addChild(createDrawerItem("Settings"))
                .space(100)
                .addChild(createDrawerItem("Logout"))
                .build();
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
                StudentDashboard studentDashboard = new StudentDashboard();
                studentDashboard.setVisible(true);
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
            case "Time Table":
                LecturerViewTimetable lecturerViewTimetable = new LecturerViewTimetable();
                lecturerViewTimetable.setVisible(true);
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
                LecturerViewCourseContent lecturerViewCourseContent = new LecturerViewCourseContent();
                lecturerViewCourseContent.setVisible(true);
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
                LecturerViewExamination lectureViewExamination = new LecturerViewExamination();
                lectureViewExamination.setVisible(true);
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
                LecturerViewMessages lecturerViewMessages = new LecturerViewMessages();
                lecturerViewMessages.setVisible(true);
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
                LecturerViewSettings lecturerViewSettings = new LecturerViewSettings();
                lecturerViewSettings.setVisible(true);
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

        btn_Verify = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();
        btn_Verify1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_studentID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCalendarPanel1 = new de.wannawork.jcalendar.JCalendarPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btn_Verify2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Verify.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify.setText("Schedule");
        btn_Verify.setAlignmentY(0.0F);
        btn_Verify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerifyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Course Content");

        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\StudentActivities\\Icons\\MenuColored.png")); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        btn_Verify1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify1.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify1.setText("Cancel");
        btn_Verify1.setAlignmentY(0.0F);
        btn_Verify1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Verify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Verify1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        lbl_studentID.setText("LecturerID");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setText("Course");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setText("Subject");

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setText("Date");

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setText("Start Time");

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel13.setText("End Time");

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel14.setText(":");

        btn_Verify2.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify2.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify2.setText("View Schedule");
        btn_Verify2.setAlignmentY(0.0F);
        btn_Verify2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Verify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Verify2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCalendarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9))
                    .addComponent(jCalendarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_studentID)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_studentID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Verify)
                    .addComponent(btn_Verify1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VerifyActionPerformed

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btn_MenuMouseClicked

    private void btn_Verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Verify1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Verify1ActionPerformed

    private void btn_Verify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Verify2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Verify2ActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerViewTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JButton btn_Verify;
    private javax.swing.JButton btn_Verify1;
    private javax.swing.JButton btn_Verify2;
    private de.wannawork.jcalendar.JCalendarPanel jCalendarPanel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_studentID;
    // End of variables declaration//GEN-END:variables
}
