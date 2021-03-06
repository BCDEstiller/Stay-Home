/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.Point;
import javax.swing.Timer;
/**
 *
 * @author zslay
 */
public class Dashboard extends javax.swing.JFrame {
    
    private String DefaultCountry = "philippines";
    private static int mSec = 1000;
    public Point p;
    
    public Dashboard() {
        initComponents();
        api.SelectedCountry(DefaultCountry);
        api.WorldData();
        api.LocalData();
        api.CountryList();
        api.countries.forEach((elem) -> Addto(elem));
        CountryLabel.setText(DefaultCountry.toUpperCase());
        UpdateDisplay();
        new Timer(mSec, ClockCycle).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectiondialog = new javax.swing.JDialog();
        selectionbox = new javax.swing.JComboBox<>();
        DLabel = new javax.swing.JLabel();
        DLabel1 = new javax.swing.JLabel();
        DLabel2 = new javax.swing.JLabel();
        DLabel3 = new javax.swing.JLabel();
        SidebarIcon4 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        Subtitle1 = new javax.swing.JLabel();
        Subtitle2 = new javax.swing.JLabel();
        Subtitle3 = new javax.swing.JLabel();
        lineSub = new javax.swing.JLabel();
        lineSub1 = new javax.swing.JLabel();
        lineSub2 = new javax.swing.JLabel();
        lineSub3 = new javax.swing.JLabel();
        UpdateLabel = new javax.swing.JLabel();
        UpdateLabel1 = new javax.swing.JLabel();
        UpdateLabel2 = new javax.swing.JLabel();
        UpdateLabel3 = new javax.swing.JLabel();
        subicon = new javax.swing.JLabel();
        subicon1 = new javax.swing.JLabel();
        subicon2 = new javax.swing.JLabel();
        subicon3 = new javax.swing.JLabel();
        Subtitle4 = new javax.swing.JLabel();
        Subtitle5 = new javax.swing.JLabel();
        Subtitle6 = new javax.swing.JLabel();
        Subtitle7 = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        CasesLabel = new javax.swing.JLabel();
        NewCasesLabel = new javax.swing.JLabel();
        DeathsLabel = new javax.swing.JLabel();
        RecoveredLabel = new javax.swing.JLabel();
        WorldCLabel = new javax.swing.JLabel();
        WorldDLabel = new javax.swing.JLabel();
        WorldRLabel = new javax.swing.JLabel();
        ViewCountry = new javax.swing.JLabel();
        SideBar = new javax.swing.JLabel();
        MiniPanel = new javax.swing.JLabel();
        MiniPanel1 = new javax.swing.JLabel();
        MiniPanel2 = new javax.swing.JLabel();
        MiniPanel3 = new javax.swing.JLabel();
        Panel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();

        selectiondialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        selectiondialog.setTitle("Select Country");
        selectiondialog.setAlwaysOnTop(true);
        selectiondialog.setLocation(new java.awt.Point(0, 0));
        selectiondialog.setMinimumSize(new java.awt.Dimension(300, 200));
        selectiondialog.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        selectiondialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        selectiondialog.setResizable(false);
        selectiondialog.setSize(new java.awt.Dimension(300, 200));
        selectiondialog.setType(java.awt.Window.Type.POPUP);
        selectiondialog.getContentPane().setLayout(null);

        selectionbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        selectionbox.setModel(selectionbox.getModel());
        selectionbox.setMaximumSize(new java.awt.Dimension(200, 30));
        selectionbox.setMinimumSize(new java.awt.Dimension(200, 30));
        selectionbox.setName(""); // NOI18N
        selectionbox.setPreferredSize(new java.awt.Dimension(200, 30));
        selectionbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectionboxItemStateChanged(evt);
            }
        });
        selectiondialog.getContentPane().add(selectionbox);
        selectionbox.setBounds(50, 25, 200, 30);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stay@Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1100, 576));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("Main"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 576));
        getContentPane().setLayout(null);

        DLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        DLabel.setForeground(new java.awt.Color(251, 250, 250));
        DLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/dashboard.png"))); // NOI18N
        DLabel.setText("DASHBOARD");
        DLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DLabelMousePressed(evt);
            }
        });
        getContentPane().add(DLabel);
        DLabel.setBounds(30, 80, 160, 40);

        DLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        DLabel1.setForeground(new java.awt.Color(251, 250, 250));
        DLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/todolist.png"))); // NOI18N
        DLabel1.setText("TO-DO-LIST");
        getContentPane().add(DLabel1);
        DLabel1.setBounds(30, 150, 150, 40);

        DLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        DLabel2.setForeground(new java.awt.Color(251, 250, 250));
        DLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/tips.png"))); // NOI18N
        DLabel2.setText("TIP-O'-THE-DAY");
        getContentPane().add(DLabel2);
        DLabel2.setBounds(30, 220, 190, 40);

        DLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        DLabel3.setForeground(new java.awt.Color(251, 250, 250));
        DLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/about.png"))); // NOI18N
        DLabel3.setText("ABOUT");
        getContentPane().add(DLabel3);
        DLabel3.setBounds(30, 290, 110, 40);

        SidebarIcon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SidebarIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/selected.png"))); // NOI18N
        SidebarIcon4.setFocusable(false);
        SidebarIcon4.setRequestFocusEnabled(false);
        SidebarIcon4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(SidebarIcon4);
        SidebarIcon4.setBounds(220, 86, 30, 30);

        line.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/lineF0.png"))); // NOI18N
        line.setFocusable(false);
        line.setRequestFocusEnabled(false);
        line.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(line);
        line.setBounds(20, 40, 210, 30);

        Subtitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Subtitle.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle.setText("Cases");
        Subtitle.setFocusable(false);
        Subtitle.setRequestFocusEnabled(false);
        Subtitle.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle);
        Subtitle.setBounds(390, 65, 45, 20);

        Subtitle1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Subtitle1.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle1.setText("New Cases");
        Subtitle1.setFocusable(false);
        Subtitle1.setRequestFocusEnabled(false);
        Subtitle1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle1);
        Subtitle1.setBounds(560, 65, 80, 20);

        Subtitle2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Subtitle2.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle2.setText("Deaths");
        Subtitle2.setFocusable(false);
        Subtitle2.setRequestFocusEnabled(false);
        Subtitle2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle2);
        Subtitle2.setBounds(795, 65, 50, 20);

        Subtitle3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        Subtitle3.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle3.setText("Recovered");
        Subtitle3.setFocusable(false);
        Subtitle3.setRequestFocusEnabled(false);
        Subtitle3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle3);
        Subtitle3.setBounds(970, 65, 80, 20);

        lineSub.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lineSub.setForeground(new java.awt.Color(102, 102, 102));
        lineSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/line-grey.png"))); // NOI18N
        lineSub.setFocusable(false);
        lineSub.setRequestFocusEnabled(false);
        lineSub.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lineSub);
        lineSub.setBounds(290, 135, 150, 20);

        lineSub1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lineSub1.setForeground(new java.awt.Color(102, 102, 102));
        lineSub1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineSub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/line-grey.png"))); // NOI18N
        lineSub1.setFocusable(false);
        lineSub1.setRequestFocusEnabled(false);
        lineSub1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lineSub1);
        lineSub1.setBounds(495, 135, 150, 20);

        lineSub2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lineSub2.setForeground(new java.awt.Color(102, 102, 102));
        lineSub2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineSub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/line-grey.png"))); // NOI18N
        lineSub2.setFocusable(false);
        lineSub2.setRequestFocusEnabled(false);
        lineSub2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lineSub2);
        lineSub2.setBounds(700, 135, 150, 20);

        lineSub3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        lineSub3.setForeground(new java.awt.Color(102, 102, 102));
        lineSub3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineSub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/line-grey.png"))); // NOI18N
        lineSub3.setFocusable(false);
        lineSub3.setRequestFocusEnabled(false);
        lineSub3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lineSub3);
        lineSub3.setBounds(905, 135, 150, 20);

        UpdateLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        UpdateLabel.setForeground(new java.awt.Color(102, 102, 102));
        UpdateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLabel.setText("Latest Update");
        UpdateLabel.setFocusable(false);
        UpdateLabel.setRequestFocusEnabled(false);
        UpdateLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(UpdateLabel);
        UpdateLabel.setBounds(335, 150, 110, 20);

        UpdateLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        UpdateLabel1.setForeground(new java.awt.Color(102, 102, 102));
        UpdateLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLabel1.setText("Latest Update");
        UpdateLabel1.setFocusable(false);
        UpdateLabel1.setRequestFocusEnabled(false);
        UpdateLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(UpdateLabel1);
        UpdateLabel1.setBounds(540, 150, 110, 20);

        UpdateLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        UpdateLabel2.setForeground(new java.awt.Color(102, 102, 102));
        UpdateLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLabel2.setText("Latest Update");
        UpdateLabel2.setFocusable(false);
        UpdateLabel2.setRequestFocusEnabled(false);
        UpdateLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(UpdateLabel2);
        UpdateLabel2.setBounds(745, 150, 110, 20);

        UpdateLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        UpdateLabel3.setForeground(new java.awt.Color(102, 102, 102));
        UpdateLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLabel3.setText("Latest Update");
        UpdateLabel3.setFocusable(false);
        UpdateLabel3.setRequestFocusEnabled(false);
        UpdateLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(UpdateLabel3);
        UpdateLabel3.setBounds(950, 150, 110, 20);

        subicon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        subicon.setForeground(new java.awt.Color(102, 102, 102));
        subicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cases.png"))); // NOI18N
        subicon.setFocusable(false);
        subicon.setRequestFocusEnabled(false);
        subicon.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(subicon);
        subicon.setBounds(280, 65, 65, 70);

        subicon1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        subicon1.setForeground(new java.awt.Color(102, 102, 102));
        subicon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/new.png"))); // NOI18N
        subicon1.setFocusable(false);
        subicon1.setRequestFocusEnabled(false);
        subicon1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(subicon1);
        subicon1.setBounds(485, 65, 65, 70);

        subicon2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        subicon2.setForeground(new java.awt.Color(102, 102, 102));
        subicon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/deaths.png"))); // NOI18N
        subicon2.setFocusable(false);
        subicon2.setRequestFocusEnabled(false);
        subicon2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(subicon2);
        subicon2.setBounds(690, 65, 65, 70);

        subicon3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        subicon3.setForeground(new java.awt.Color(102, 102, 102));
        subicon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subicon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/recovered.png"))); // NOI18N
        subicon3.setFocusable(false);
        subicon3.setRequestFocusEnabled(false);
        subicon3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(subicon3);
        subicon3.setBounds(895, 65, 65, 70);

        Subtitle4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Subtitle4.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle4.setText("Worldwide COVID-19 cases:");
        Subtitle4.setFocusable(false);
        Subtitle4.setRequestFocusEnabled(false);
        Subtitle4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle4);
        Subtitle4.setBounds(520, 220, 300, 30);

        Subtitle5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Subtitle5.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle5.setText("Deaths:");
        Subtitle5.setFocusable(false);
        Subtitle5.setRequestFocusEnabled(false);
        Subtitle5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle5);
        Subtitle5.setBounds(427, 330, 90, 30);

        Subtitle6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Subtitle6.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle6.setText("Recovered:");
        Subtitle6.setFocusable(false);
        Subtitle6.setRequestFocusEnabled(false);
        Subtitle6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle6);
        Subtitle6.setBounds(823, 330, 130, 30);

        Subtitle7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Subtitle7.setForeground(new java.awt.Color(102, 102, 102));
        Subtitle7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle7.setText("Data from worldometers.info/coronavirus/");
        Subtitle7.setFocusable(false);
        Subtitle7.setRequestFocusEnabled(false);
        Subtitle7.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Subtitle7);
        Subtitle7.setBounds(550, 500, 240, 20);

        TimeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(102, 102, 102));
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("HH:mm:ss Local Time");
        TimeLabel.setFocusable(false);
        TimeLabel.setRequestFocusEnabled(false);
        TimeLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(TimeLabel);
        TimeLabel.setBounds(570, 465, 200, 30);

        DateLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(102, 102, 102));
        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateLabel.setText("DDDD, dd MMMM yy");
        DateLabel.setFocusable(false);
        DateLabel.setRequestFocusEnabled(false);
        DateLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(DateLabel);
        DateLabel.setBounds(545, 430, 250, 30);

        CasesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        CasesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CasesLabel.setText("000000");
        CasesLabel.setFocusable(false);
        CasesLabel.setPreferredSize(new java.awt.Dimension(100, 32));
        CasesLabel.setRequestFocusEnabled(false);
        CasesLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(CasesLabel);
        CasesLabel.setBounds(355, 90, 80, 50);

        NewCasesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        NewCasesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewCasesLabel.setText("000000");
        NewCasesLabel.setFocusable(false);
        NewCasesLabel.setMaximumSize(new java.awt.Dimension(100, 32));
        NewCasesLabel.setPreferredSize(new java.awt.Dimension(100, 32));
        NewCasesLabel.setRequestFocusEnabled(false);
        NewCasesLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(NewCasesLabel);
        NewCasesLabel.setBounds(560, 90, 80, 50);

        DeathsLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        DeathsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DeathsLabel.setText("000000");
        DeathsLabel.setFocusable(false);
        DeathsLabel.setMaximumSize(new java.awt.Dimension(100, 32));
        DeathsLabel.setPreferredSize(new java.awt.Dimension(100, 32));
        DeathsLabel.setRequestFocusEnabled(false);
        DeathsLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(DeathsLabel);
        DeathsLabel.setBounds(765, 90, 80, 50);

        RecoveredLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        RecoveredLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RecoveredLabel.setText("000000");
        RecoveredLabel.setFocusable(false);
        RecoveredLabel.setMaximumSize(new java.awt.Dimension(100, 32));
        RecoveredLabel.setPreferredSize(new java.awt.Dimension(100, 32));
        RecoveredLabel.setRequestFocusEnabled(false);
        RecoveredLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(RecoveredLabel);
        RecoveredLabel.setBounds(970, 90, 80, 50);

        WorldCLabel.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        WorldCLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorldCLabel.setText("0");
        WorldCLabel.setMaximumSize(new java.awt.Dimension(300, 40));
        WorldCLabel.setMinimumSize(new java.awt.Dimension(300, 40));
        WorldCLabel.setPreferredSize(new java.awt.Dimension(300, 40));
        getContentPane().add(WorldCLabel);
        WorldCLabel.setBounds(520, 250, 300, 40);
        WorldCLabel.getAccessibleContext().setAccessibleParent(WorldCLabel);

        WorldDLabel.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        WorldDLabel.setForeground(new java.awt.Color(244, 69, 74));
        WorldDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorldDLabel.setText("0");
        WorldDLabel.setFocusable(false);
        WorldDLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WorldDLabel.setMaximumSize(new java.awt.Dimension(300, 40));
        WorldDLabel.setMinimumSize(new java.awt.Dimension(300, 40));
        WorldDLabel.setPreferredSize(new java.awt.Dimension(300, 40));
        WorldDLabel.setRequestFocusEnabled(false);
        WorldDLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(WorldDLabel);
        WorldDLabel.setBounds(320, 360, 300, 40);

        WorldRLabel.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        WorldRLabel.setForeground(new java.awt.Color(118, 179, 137));
        WorldRLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WorldRLabel.setText("0");
        WorldRLabel.setFocusable(false);
        WorldRLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WorldRLabel.setMaximumSize(new java.awt.Dimension(300, 40));
        WorldRLabel.setMinimumSize(new java.awt.Dimension(300, 40));
        WorldRLabel.setPreferredSize(new java.awt.Dimension(300, 40));
        WorldRLabel.setRequestFocusEnabled(false);
        WorldRLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(WorldRLabel);
        WorldRLabel.setBounds(740, 360, 300, 40);

        ViewCountry.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ViewCountry.setForeground(new java.awt.Color(153, 153, 255));
        ViewCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewCountry.setText("view country");
        ViewCountry.setFocusable(false);
        ViewCountry.setRequestFocusEnabled(false);
        ViewCountry.setVerifyInputWhenFocusTarget(false);
        ViewCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCountryMouseClicked(evt);
            }
        });
        getContentPane().add(ViewCountry);
        ViewCountry.setBounds(632, 300, 80, 20);

        SideBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/menu-sidebar.png"))); // NOI18N
        SideBar.setFocusable(false);
        SideBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SideBar.setInheritsPopupMenu(false);
        SideBar.setMaximumSize(new java.awt.Dimension(250, 576));
        SideBar.setMinimumSize(new java.awt.Dimension(250, 576));
        SideBar.setPreferredSize(new java.awt.Dimension(250, 576));
        SideBar.setRequestFocusEnabled(false);
        SideBar.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(SideBar);
        SideBar.setBounds(0, 0, 250, 576);

        MiniPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/minipanel.png"))); // NOI18N
        MiniPanel.setFocusable(false);
        MiniPanel.setRequestFocusEnabled(false);
        MiniPanel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(MiniPanel);
        MiniPanel.setBounds(275, 50, 180, 140);

        MiniPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/minipanel.png"))); // NOI18N
        MiniPanel1.setFocusable(false);
        MiniPanel1.setRequestFocusEnabled(false);
        MiniPanel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(MiniPanel1);
        MiniPanel1.setBounds(480, 50, 180, 140);

        MiniPanel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniPanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/minipanel.png"))); // NOI18N
        MiniPanel2.setFocusable(false);
        MiniPanel2.setRequestFocusEnabled(false);
        MiniPanel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(MiniPanel2);
        MiniPanel2.setBounds(685, 50, 180, 140);

        MiniPanel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniPanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/minipanel.png"))); // NOI18N
        MiniPanel3.setFocusable(false);
        MiniPanel3.setRequestFocusEnabled(false);
        MiniPanel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(MiniPanel3);
        MiniPanel3.setBounds(890, 50, 180, 140);

        Panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/panel.png"))); // NOI18N
        Panel.setFocusable(false);
        Panel.setRequestFocusEnabled(false);
        Panel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Panel);
        Panel.setBounds(275, 210, 790, 320);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 102, 102));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("DASHBOARD");
        Title.setFocusable(false);
        Title.setRequestFocusEnabled(false);
        Title.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Title);
        Title.setBounds(275, 5, 130, 30);

        CountryLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(102, 102, 102));
        CountryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CountryLabel.setText("COUNTRY");
        CountryLabel.setFocusable(false);
        CountryLabel.setRequestFocusEnabled(false);
        CountryLabel.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(CountryLabel);
        CountryLabel.setBounds(700, 5, 360, 30);

        line1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/line-grey.png"))); // NOI18N
        line1.setFocusable(false);
        line1.setRequestFocusEnabled(false);
        line1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(line1);
        line1.setBounds(275, 20, 790, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLabelMousePressed
        System.out.println("DASHBOARD");
  
    }//GEN-LAST:event_DLabelMousePressed

    private void ViewCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewCountryMouseClicked
        //dPopup._dPopup();
        //this.setVisible(false);
        if(!selectiondialog.isVisible()){
            p = this.getLocation();
            selectiondialog.setLocation(p.x + 400, p.y + 200);
            selectiondialog.setVisible(true);
            selectionbox.setEnabled(true);
        }
    }//GEN-LAST:event_ViewCountryMouseClicked

    private void selectionboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectionboxItemStateChanged
        if(selectiondialog.isVisible()){
            String item = selectionbox.getSelectedItem().toString();
            item = item.replaceAll(" ", "%20");
            api.SelectedCountry(item);
            item = item.replaceAll("%20", " ");
            CountryLabel.setText(item.toUpperCase());
            selectiondialog.dispose();           
        }
    }//GEN-LAST:event_selectionboxItemStateChanged

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);

            }
        });
    }
    
    private void Addto(String item){
        selectionbox.addItem(item);
    }
    
    private void UpdateDisplay(){
        api.WorldData();
        api.LocalData();        
        WorldDisplay();
        LocalDisplay();
        //CountryLabel.setText(api.Country.toUpperCase());
        DateLabel.setText(datetime.DisplayDate());
        TimeLabel.setText(datetime.DisplayTime());
    }
    
    private void WorldDisplay(){
        String WCases = api.WorldCases;
        WorldCLabel.setText(WCases);
        WCases = api.WorldDeaths;
        WorldDLabel.setText(WCases);
        WCases = api.WorldRecovered;
        WorldRLabel.setText(WCases);
    }
    
    private void LocalDisplay(){
        String LCases = api.LocalCases;
        CasesLabel.setText(LCases);
        LCases = api.NewCases;
        NewCasesLabel.setText("+" + LCases);
        LCases = api.LocalDeaths;
        DeathsLabel.setText(LCases);
        LCases = api.LocalRecovered;
        RecoveredLabel.setText(LCases);
    }
    
    ActionListener ClockCycle = (ActionEvent e) -> {
        UpdateDisplay();
    };
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CasesLabel;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JLabel DLabel;
    private javax.swing.JLabel DLabel1;
    private javax.swing.JLabel DLabel2;
    private javax.swing.JLabel DLabel3;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DeathsLabel;
    private javax.swing.JLabel MiniPanel;
    private javax.swing.JLabel MiniPanel1;
    private javax.swing.JLabel MiniPanel2;
    private javax.swing.JLabel MiniPanel3;
    private javax.swing.JLabel NewCasesLabel;
    private javax.swing.JLabel Panel;
    private javax.swing.JLabel RecoveredLabel;
    private javax.swing.JLabel SideBar;
    private javax.swing.JLabel SidebarIcon4;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Subtitle1;
    private javax.swing.JLabel Subtitle2;
    private javax.swing.JLabel Subtitle3;
    private javax.swing.JLabel Subtitle4;
    private javax.swing.JLabel Subtitle5;
    private javax.swing.JLabel Subtitle6;
    private javax.swing.JLabel Subtitle7;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UpdateLabel;
    private javax.swing.JLabel UpdateLabel1;
    private javax.swing.JLabel UpdateLabel2;
    private javax.swing.JLabel UpdateLabel3;
    private javax.swing.JLabel ViewCountry;
    private javax.swing.JLabel WorldCLabel;
    private javax.swing.JLabel WorldDLabel;
    private javax.swing.JLabel WorldRLabel;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel lineSub;
    private javax.swing.JLabel lineSub1;
    private javax.swing.JLabel lineSub2;
    private javax.swing.JLabel lineSub3;
    private javax.swing.JComboBox<String> selectionbox;
    private javax.swing.JDialog selectiondialog;
    private javax.swing.JLabel subicon;
    private javax.swing.JLabel subicon1;
    private javax.swing.JLabel subicon2;
    private javax.swing.JLabel subicon3;
    // End of variables declaration//GEN-END:variables
}
