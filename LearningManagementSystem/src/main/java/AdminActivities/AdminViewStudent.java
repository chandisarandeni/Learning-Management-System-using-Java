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
public class AdminViewStudent extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewStudent
     */
    private final DrawerController drawer;
    public String adminUsername;

    public AdminViewStudent(String adminUsername) {
        initComponents();

        this.adminUsername = adminUsername;
        lbl_adminUsername.setText(adminUsername);

        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

        String Add = "src\\main\\java\\AdminActivities\\Icons\\Add.png";
        btn_Add.setIcon(ImageResizer.resizeImage(Add, 35, 35));
        String Edit = "src\\main\\java\\AdminActivities\\Icons\\Edit.png";
        btn_Edit.setIcon(ImageResizer.resizeImage(Edit, 35, 35));
        String Delete = "src\\main\\java\\AdminActivities\\Icons\\Delete.png";
        btn_Delete.setIcon(ImageResizer.resizeImage(Delete, 35, 35));

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

        btn_Add = new javax.swing.JLabel();
        btn_Edit = new javax.swing.JLabel();
        lbl_adminUsername = new javax.swing.JLabel();
        btn_Delete = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Verify = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_Verify1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\AdminActivities\\Icons\\Add.png")); // NOI18N

        btn_Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\AdminActivities\\Icons\\Edit.png")); // NOI18N

        lbl_adminUsername.setText("AdminID");

        btn_Delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\AdminActivities\\Icons\\Delete.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setText("Search :");

        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\StudentActivities\\Icons\\MenuColored.png")); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Students");

        btn_Verify.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify.setText("Search");
        btn_Verify.setAlignmentY(0.0F);
        btn_Verify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setText("Student ID");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setText("Sample Data");

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setText("Full Name");

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setText("Sample Data");

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setText("NIC");

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel14.setText("Sample Data");

        jLabel15.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel15.setText("Contact No");

        jLabel16.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel16.setText(":");

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel17.setText("Sample Data");

        jLabel18.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel18.setText("Email");

        jLabel19.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel19.setText(":");

        jLabel20.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel20.setText("Sample Data");

        jLabel21.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel21.setText("Address");

        jLabel22.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel22.setText(":");

        jLabel23.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel23.setText("Sample Data");

        jLabel25.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel25.setText("Birthday");

        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel26.setText(":");

        jLabel27.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel27.setText("Sample Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel26))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel14)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel20))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23))))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel24.setText("Search Student ID for view student details");

        btn_Verify1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify1.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify1.setText("Print");
        btn_Verify1.setAlignmentY(0.0F);
        btn_Verify1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(301, 301, 301))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btn_MenuMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewStudent("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Add;
    private javax.swing.JLabel btn_Delete;
    private javax.swing.JLabel btn_Edit;
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JButton btn_Verify;
    private javax.swing.JButton btn_Verify1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_adminUsername;
    // End of variables declaration//GEN-END:variables
}
