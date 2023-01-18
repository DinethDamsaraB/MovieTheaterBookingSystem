/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class NewJFrame extends javax.swing.JFrame {

    HashMap<JToggleButton, Integer> seatSet = new HashMap<JToggleButton, Integer>();
    HashMap<JToggleButton, Integer> bookedSeatSet = new HashMap<JToggleButton, Integer>();
   
    int totFee;
    int totTickets;

    public NewJFrame() {
        initComponents();
        setSeatSet();
        addActionListnetr();

    }

    private void addActionListnetr() {
        for (JToggleButton t_b : seatSet.keySet()) {
            t_b.addActionListener(actionListener);
        }

    }
     ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            totFee = 0;
            totTickets = 0;
            String selectSeats="";

            for (JToggleButton tb : seatSet.keySet()) {
                if (tb.isSelected()) {
                    tb.setBackground(Color.green);
                    bookedSeatSet.put(tb, seatSet.get(tb));

                    if (bookedSeatSet.get(tb) == 12) {
                        totFee = totFee + 12;
                        jTotal.setText("$" + totFee);
                        totTickets++;
                        jTicket.setText(Integer.toString(totTickets));
                        

                    } else if (bookedSeatSet.get(tb) == 20) {
                        totFee = totFee + 20;
                        jTotal.setText("$" + totFee);
                        totTickets++;
                        jTicket.setText(Integer.toString(totTickets));   
                        
                    }
                   selectSeats=selectSeats+tb.getName()+", ";
                jSeat.setText(selectSeats); 
                   
                } else if (!tb.isSelected()) {
                    tb.setBackground(Color.darkGray);
                    bookedSeatSet.remove(tb, seatSet.get(tb));

                }
                
            }

        }
    };

    private void setSeatSet() {
        for (Component c : jPanel1.getComponents()) {
            JToggleButton tButton = (JToggleButton) c;
            seatSet.put(tButton, 12);
        }

        for (Component c : jPanel2.getComponents()) {
            JToggleButton tButton = (JToggleButton) c;
            seatSet.put(tButton, 20);
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        r5c2 = new javax.swing.JToggleButton();
        r4c1 = new javax.swing.JToggleButton();
        r7c8 = new javax.swing.JToggleButton();
        r7c9 = new javax.swing.JToggleButton();
        r1c9 = new javax.swing.JToggleButton();
        r6c7 = new javax.swing.JToggleButton();
        r1c4 = new javax.swing.JToggleButton();
        r6c1 = new javax.swing.JToggleButton();
        r7c3 = new javax.swing.JToggleButton();
        r6c2 = new javax.swing.JToggleButton();
        r7c5 = new javax.swing.JToggleButton();
        r7c1 = new javax.swing.JToggleButton();
        r7c4 = new javax.swing.JToggleButton();
        r2c5 = new javax.swing.JToggleButton();
        r6c3 = new javax.swing.JToggleButton();
        r6c8 = new javax.swing.JToggleButton();
        r5c3 = new javax.swing.JToggleButton();
        r2c6 = new javax.swing.JToggleButton();
        r7c6 = new javax.swing.JToggleButton();
        r4c2 = new javax.swing.JToggleButton();
        r6c9 = new javax.swing.JToggleButton();
        r7c2 = new javax.swing.JToggleButton();
        r2c7 = new javax.swing.JToggleButton();
        r2c8 = new javax.swing.JToggleButton();
        r2c9 = new javax.swing.JToggleButton();
        r2c1 = new javax.swing.JToggleButton();
        r8c7 = new javax.swing.JToggleButton();
        r8c8 = new javax.swing.JToggleButton();
        r8c9 = new javax.swing.JToggleButton();
        r8c1 = new javax.swing.JToggleButton();
        r8c2 = new javax.swing.JToggleButton();
        r2c2 = new javax.swing.JToggleButton();
        r2c3 = new javax.swing.JToggleButton();
        r2c4 = new javax.swing.JToggleButton();
        r4c5 = new javax.swing.JToggleButton();
        r4c6 = new javax.swing.JToggleButton();
        r5c7 = new javax.swing.JToggleButton();
        r5c8 = new javax.swing.JToggleButton();
        r8c3 = new javax.swing.JToggleButton();
        r1c5 = new javax.swing.JToggleButton();
        r6c6 = new javax.swing.JToggleButton();
        r1c6 = new javax.swing.JToggleButton();
        r6c5 = new javax.swing.JToggleButton();
        r5c5 = new javax.swing.JToggleButton();
        r6c4 = new javax.swing.JToggleButton();
        r5c4 = new javax.swing.JToggleButton();
        r1c1 = new javax.swing.JToggleButton();
        r4c3 = new javax.swing.JToggleButton();
        r1c2 = new javax.swing.JToggleButton();
        r5c6 = new javax.swing.JToggleButton();
        r8c5 = new javax.swing.JToggleButton();
        r1c3 = new javax.swing.JToggleButton();
        r8c4 = new javax.swing.JToggleButton();
        r4c4 = new javax.swing.JToggleButton();
        r5c9 = new javax.swing.JToggleButton();
        r7c7 = new javax.swing.JToggleButton();
        r4c7 = new javax.swing.JToggleButton();
        r1c7 = new javax.swing.JToggleButton();
        r5c1 = new javax.swing.JToggleButton();
        r1c8 = new javax.swing.JToggleButton();
        r4c8 = new javax.swing.JToggleButton();
        r8c6 = new javax.swing.JToggleButton();
        r1c10 = new javax.swing.JToggleButton();
        r2c10 = new javax.swing.JToggleButton();
        r5c10 = new javax.swing.JToggleButton();
        r6c10 = new javax.swing.JToggleButton();
        r8c10 = new javax.swing.JToggleButton();
        r7c10 = new javax.swing.JToggleButton();
        r9c1 = new javax.swing.JToggleButton();
        r9c2 = new javax.swing.JToggleButton();
        r9c3 = new javax.swing.JToggleButton();
        r9c4 = new javax.swing.JToggleButton();
        r9c5 = new javax.swing.JToggleButton();
        r9c6 = new javax.swing.JToggleButton();
        r9c7 = new javax.swing.JToggleButton();
        r9c8 = new javax.swing.JToggleButton();
        r9c9 = new javax.swing.JToggleButton();
        r9c10 = new javax.swing.JToggleButton();
        screen = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        r10c5 = new javax.swing.JToggleButton();
        r10c4 = new javax.swing.JToggleButton();
        r10c6 = new javax.swing.JToggleButton();
        r10c7 = new javax.swing.JToggleButton();
        r10c8 = new javax.swing.JToggleButton();
        r10c3 = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookNow = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTicket = new java.awt.Label();
        jTotal = new java.awt.Label();
        jSeat = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MULTIPLEX THEATER SHOWING SCREEN 1");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        r5c2.setBackground(java.awt.Color.darkGray);
        r5c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c2.setForeground(new java.awt.Color(255, 255, 255));
        r5c2.setText("2");
        r5c2.setName("R5-C2"); // NOI18N

        r4c1.setBackground(java.awt.Color.darkGray);
        r4c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c1.setForeground(new java.awt.Color(255, 255, 255));
        r4c1.setText("1");
        r4c1.setName("R4-C1"); // NOI18N

        r7c8.setBackground(java.awt.Color.darkGray);
        r7c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c8.setForeground(new java.awt.Color(255, 255, 255));
        r7c8.setText("8");
        r7c8.setName("R7-C8"); // NOI18N

        r7c9.setBackground(java.awt.Color.darkGray);
        r7c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c9.setForeground(new java.awt.Color(255, 255, 255));
        r7c9.setText("9");
        r7c9.setName("R7-C9"); // NOI18N

        r1c9.setBackground(java.awt.Color.darkGray);
        r1c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c9.setForeground(new java.awt.Color(255, 255, 255));
        r1c9.setText("9");
        r1c9.setName("R1-C9"); // NOI18N

        r6c7.setBackground(java.awt.Color.darkGray);
        r6c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c7.setForeground(new java.awt.Color(255, 255, 255));
        r6c7.setText("7");
        r6c7.setName("R6-C7"); // NOI18N

        r1c4.setBackground(java.awt.Color.darkGray);
        r1c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c4.setForeground(new java.awt.Color(255, 255, 255));
        r1c4.setText("4");
        r1c4.setName("R1-C4"); // NOI18N

        r6c1.setBackground(java.awt.Color.darkGray);
        r6c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c1.setForeground(new java.awt.Color(255, 255, 255));
        r6c1.setText("1");
        r6c1.setName("R6-C1"); // NOI18N

        r7c3.setBackground(java.awt.Color.darkGray);
        r7c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c3.setForeground(new java.awt.Color(255, 255, 255));
        r7c3.setText("3");
        r7c3.setName("R7-C3"); // NOI18N

        r6c2.setBackground(java.awt.Color.darkGray);
        r6c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c2.setForeground(new java.awt.Color(255, 255, 255));
        r6c2.setText("2");
        r6c2.setName("R6-C2"); // NOI18N

        r7c5.setBackground(java.awt.Color.darkGray);
        r7c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c5.setForeground(new java.awt.Color(255, 255, 255));
        r7c5.setText("5");
        r7c5.setName("R7-C5"); // NOI18N

        r7c1.setBackground(java.awt.Color.darkGray);
        r7c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c1.setForeground(new java.awt.Color(255, 255, 255));
        r7c1.setText("1");
        r7c1.setName("R7-C1"); // NOI18N

        r7c4.setBackground(java.awt.Color.darkGray);
        r7c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c4.setForeground(new java.awt.Color(255, 255, 255));
        r7c4.setText("4");
        r7c4.setName("R7-C4"); // NOI18N

        r2c5.setBackground(java.awt.Color.darkGray);
        r2c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c5.setForeground(new java.awt.Color(255, 255, 255));
        r2c5.setText("5");
        r2c5.setName("R2-C5"); // NOI18N
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r6c3.setBackground(java.awt.Color.darkGray);
        r6c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c3.setForeground(new java.awt.Color(255, 255, 255));
        r6c3.setText("3");
        r6c3.setName("R6-C3"); // NOI18N

        r6c8.setBackground(java.awt.Color.darkGray);
        r6c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c8.setForeground(new java.awt.Color(255, 255, 255));
        r6c8.setText("8");
        r6c8.setName("R6-C8"); // NOI18N

        r5c3.setBackground(java.awt.Color.darkGray);
        r5c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c3.setForeground(new java.awt.Color(255, 255, 255));
        r5c3.setText("3");
        r5c3.setName("R5-C3"); // NOI18N

        r2c6.setBackground(java.awt.Color.darkGray);
        r2c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c6.setForeground(new java.awt.Color(255, 255, 255));
        r2c6.setText("6");
        r2c6.setName("R2-C6"); // NOI18N

        r7c6.setBackground(java.awt.Color.darkGray);
        r7c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c6.setForeground(new java.awt.Color(255, 255, 255));
        r7c6.setText("6");
        r7c6.setName("R7-C6"); // NOI18N

        r4c2.setBackground(java.awt.Color.darkGray);
        r4c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c2.setForeground(new java.awt.Color(255, 255, 255));
        r4c2.setText("2");
        r4c2.setName("R4-C2"); // NOI18N
        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r6c9.setBackground(java.awt.Color.darkGray);
        r6c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c9.setForeground(new java.awt.Color(255, 255, 255));
        r6c9.setText("9");
        r6c9.setName("R6-C9"); // NOI18N

        r7c2.setBackground(java.awt.Color.darkGray);
        r7c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c2.setForeground(new java.awt.Color(255, 255, 255));
        r7c2.setText("2");
        r7c2.setName("R7-C2"); // NOI18N

        r2c7.setBackground(java.awt.Color.darkGray);
        r2c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c7.setForeground(new java.awt.Color(255, 255, 255));
        r2c7.setText("7");
        r2c7.setName("R2-C7"); // NOI18N

        r2c8.setBackground(java.awt.Color.darkGray);
        r2c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c8.setForeground(new java.awt.Color(255, 255, 255));
        r2c8.setText("8");
        r2c8.setName("R2-C8"); // NOI18N

        r2c9.setBackground(java.awt.Color.darkGray);
        r2c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c9.setForeground(new java.awt.Color(255, 255, 255));
        r2c9.setText("9");
        r2c9.setName("R2-C9"); // NOI18N

        r2c1.setBackground(java.awt.Color.darkGray);
        r2c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c1.setForeground(new java.awt.Color(255, 255, 255));
        r2c1.setText("1");
        r2c1.setName("R2-C1"); // NOI18N

        r8c7.setBackground(java.awt.Color.darkGray);
        r8c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c7.setForeground(new java.awt.Color(255, 255, 255));
        r8c7.setText("7");
        r8c7.setName("R8-C7"); // NOI18N

        r8c8.setBackground(java.awt.Color.darkGray);
        r8c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c8.setForeground(new java.awt.Color(255, 255, 255));
        r8c8.setText("8");
        r8c8.setName("R8-C8"); // NOI18N

        r8c9.setBackground(java.awt.Color.darkGray);
        r8c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c9.setForeground(new java.awt.Color(255, 255, 255));
        r8c9.setText("9");
        r8c9.setName("R8-C9"); // NOI18N

        r8c1.setBackground(java.awt.Color.darkGray);
        r8c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c1.setForeground(new java.awt.Color(255, 255, 255));
        r8c1.setText("1");
        r8c1.setName("R8-C1"); // NOI18N

        r8c2.setBackground(java.awt.Color.darkGray);
        r8c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c2.setForeground(new java.awt.Color(255, 255, 255));
        r8c2.setText("2");
        r8c2.setName("R8-C2"); // NOI18N

        r2c2.setBackground(java.awt.Color.darkGray);
        r2c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c2.setForeground(new java.awt.Color(255, 255, 255));
        r2c2.setText("2");
        r2c2.setName("R2-C2"); // NOI18N

        r2c3.setBackground(java.awt.Color.darkGray);
        r2c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c3.setForeground(new java.awt.Color(255, 255, 255));
        r2c3.setText("3");
        r2c3.setName("R2-C3"); // NOI18N
        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r2c4.setBackground(java.awt.Color.darkGray);
        r2c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c4.setForeground(new java.awt.Color(255, 255, 255));
        r2c4.setText("4");
        r2c4.setName("R2-C4"); // NOI18N

        r4c5.setBackground(java.awt.Color.darkGray);
        r4c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c5.setForeground(new java.awt.Color(255, 255, 255));
        r4c5.setText("5");
        r4c5.setName("R4-C5"); // NOI18N

        r4c6.setBackground(java.awt.Color.darkGray);
        r4c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c6.setForeground(new java.awt.Color(255, 255, 255));
        r4c6.setText("6");
        r4c6.setName("R4-C6"); // NOI18N

        r5c7.setBackground(java.awt.Color.darkGray);
        r5c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c7.setForeground(new java.awt.Color(255, 255, 255));
        r5c7.setText("7");
        r5c7.setName("R5-C7"); // NOI18N

        r5c8.setBackground(java.awt.Color.darkGray);
        r5c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c8.setForeground(new java.awt.Color(255, 255, 255));
        r5c8.setText("8");
        r5c8.setName("R5-C8"); // NOI18N

        r8c3.setBackground(java.awt.Color.darkGray);
        r8c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c3.setForeground(new java.awt.Color(255, 255, 255));
        r8c3.setText("3");
        r8c3.setName("R8-C3"); // NOI18N

        r1c5.setBackground(java.awt.Color.darkGray);
        r1c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c5.setForeground(new java.awt.Color(255, 255, 255));
        r1c5.setText("5");
        r1c5.setName("R1-C5"); // NOI18N
        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r6c6.setBackground(java.awt.Color.darkGray);
        r6c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c6.setForeground(new java.awt.Color(255, 255, 255));
        r6c6.setText("6");
        r6c6.setName("R6-C6"); // NOI18N

        r1c6.setBackground(java.awt.Color.darkGray);
        r1c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c6.setForeground(new java.awt.Color(255, 255, 255));
        r1c6.setText("6");
        r1c6.setName("R1-C6"); // NOI18N

        r6c5.setBackground(java.awt.Color.darkGray);
        r6c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c5.setForeground(new java.awt.Color(255, 255, 255));
        r6c5.setText("5");
        r6c5.setName("R6-C5"); // NOI18N

        r5c5.setBackground(java.awt.Color.darkGray);
        r5c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c5.setForeground(new java.awt.Color(255, 255, 255));
        r5c5.setText("5");
        r5c5.setName("R5-C5"); // NOI18N

        r6c4.setBackground(java.awt.Color.darkGray);
        r6c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c4.setForeground(new java.awt.Color(255, 255, 255));
        r6c4.setText("4");
        r6c4.setName("R6-C4"); // NOI18N

        r5c4.setBackground(java.awt.Color.darkGray);
        r5c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c4.setForeground(new java.awt.Color(255, 255, 255));
        r5c4.setText("4");
        r5c4.setName("R5-C4"); // NOI18N

        r1c1.setBackground(java.awt.Color.darkGray);
        r1c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c1.setForeground(new java.awt.Color(255, 255, 255));
        r1c1.setText("1");
        r1c1.setName("R1-C1"); // NOI18N
        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r4c3.setBackground(java.awt.Color.darkGray);
        r4c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c3.setForeground(new java.awt.Color(255, 255, 255));
        r4c3.setText("3");
        r4c3.setName("R4-C3"); // NOI18N
        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r1c2.setBackground(java.awt.Color.darkGray);
        r1c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c2.setForeground(new java.awt.Color(255, 255, 255));
        r1c2.setText("2");
        r1c2.setName("R1-C2"); // NOI18N
        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r5c6.setBackground(java.awt.Color.darkGray);
        r5c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c6.setForeground(new java.awt.Color(255, 255, 255));
        r5c6.setText("6");
        r5c6.setName("R5-C6"); // NOI18N

        r8c5.setBackground(java.awt.Color.darkGray);
        r8c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c5.setForeground(new java.awt.Color(255, 255, 255));
        r8c5.setText("5");
        r8c5.setName("R8-C5"); // NOI18N

        r1c3.setBackground(java.awt.Color.darkGray);
        r1c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c3.setForeground(new java.awt.Color(255, 255, 255));
        r1c3.setText("3");
        r1c3.setName("R1-C3"); // NOI18N
        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r8c4.setBackground(java.awt.Color.darkGray);
        r8c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c4.setForeground(new java.awt.Color(255, 255, 255));
        r8c4.setText("4");
        r8c4.setName("R8-C4"); // NOI18N

        r4c4.setBackground(java.awt.Color.darkGray);
        r4c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c4.setForeground(new java.awt.Color(255, 255, 255));
        r4c4.setText("4");
        r4c4.setName("R4-C4"); // NOI18N

        r5c9.setBackground(java.awt.Color.darkGray);
        r5c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c9.setForeground(new java.awt.Color(255, 255, 255));
        r5c9.setText("9");
        r5c9.setName("R5-C9"); // NOI18N

        r7c7.setBackground(java.awt.Color.darkGray);
        r7c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c7.setForeground(new java.awt.Color(255, 255, 255));
        r7c7.setText("7");
        r7c7.setName("R7-C7"); // NOI18N

        r4c7.setBackground(java.awt.Color.darkGray);
        r4c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c7.setForeground(new java.awt.Color(255, 255, 255));
        r4c7.setText("7");
        r4c7.setName("R4-C7"); // NOI18N

        r1c7.setBackground(java.awt.Color.darkGray);
        r1c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c7.setForeground(new java.awt.Color(255, 255, 255));
        r1c7.setText("7");
        r1c7.setName("R1-C7"); // NOI18N
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r5c1.setBackground(java.awt.Color.darkGray);
        r5c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c1.setForeground(new java.awt.Color(255, 255, 255));
        r5c1.setText("1");
        r5c1.setName("R5-C1"); // NOI18N

        r1c8.setBackground(java.awt.Color.darkGray);
        r1c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c8.setForeground(new java.awt.Color(255, 255, 255));
        r1c8.setText("8");
        r1c8.setName("R1-C8"); // NOI18N

        r4c8.setBackground(java.awt.Color.darkGray);
        r4c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r4c8.setForeground(new java.awt.Color(255, 255, 255));
        r4c8.setText("8");
        r4c8.setName("R4-C8"); // NOI18N

        r8c6.setBackground(java.awt.Color.darkGray);
        r8c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c6.setForeground(new java.awt.Color(255, 255, 255));
        r8c6.setText("6");
        r8c6.setName("R8-C6"); // NOI18N

        r1c10.setBackground(java.awt.Color.darkGray);
        r1c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r1c10.setForeground(new java.awt.Color(255, 255, 255));
        r1c10.setText("10");
        r1c10.setName("R1-C10"); // NOI18N
        r1c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c10ActionPerformed(evt);
            }
        });

        r2c10.setBackground(java.awt.Color.darkGray);
        r2c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r2c10.setForeground(new java.awt.Color(255, 255, 255));
        r2c10.setText("10");
        r2c10.setName("R2-C10"); // NOI18N
        r2c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c10ActionPerformed(evt);
            }
        });

        r5c10.setBackground(java.awt.Color.darkGray);
        r5c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r5c10.setForeground(new java.awt.Color(255, 255, 255));
        r5c10.setText("10");
        r5c10.setName("R5-C10"); // NOI18N

        r6c10.setBackground(java.awt.Color.darkGray);
        r6c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r6c10.setForeground(new java.awt.Color(255, 255, 255));
        r6c10.setText("10");
        r6c10.setName("R6-C10"); // NOI18N

        r8c10.setBackground(java.awt.Color.darkGray);
        r8c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r8c10.setForeground(new java.awt.Color(255, 255, 255));
        r8c10.setText("10");
        r8c10.setName("R8-C10"); // NOI18N

        r7c10.setBackground(java.awt.Color.darkGray);
        r7c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r7c10.setForeground(new java.awt.Color(255, 255, 255));
        r7c10.setText("10");
        r7c10.setName("R7-C10"); // NOI18N

        r9c1.setBackground(java.awt.Color.darkGray);
        r9c1.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c1.setForeground(new java.awt.Color(255, 255, 255));
        r9c1.setText("1");
        r9c1.setName("R9-C1"); // NOI18N

        r9c2.setBackground(java.awt.Color.darkGray);
        r9c2.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c2.setForeground(new java.awt.Color(255, 255, 255));
        r9c2.setText("2");
        r9c2.setName("R9-C2"); // NOI18N
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r9c3.setBackground(java.awt.Color.darkGray);
        r9c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c3.setForeground(new java.awt.Color(255, 255, 255));
        r9c3.setText("3");
        r9c3.setName("R9-C3"); // NOI18N
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        r9c4.setBackground(java.awt.Color.darkGray);
        r9c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c4.setForeground(new java.awt.Color(255, 255, 255));
        r9c4.setText("4");
        r9c4.setName("R9-C4"); // NOI18N

        r9c5.setBackground(java.awt.Color.darkGray);
        r9c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c5.setForeground(new java.awt.Color(255, 255, 255));
        r9c5.setText("5");
        r9c5.setName("R9-C5"); // NOI18N
        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r9c6.setBackground(java.awt.Color.darkGray);
        r9c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c6.setForeground(new java.awt.Color(255, 255, 255));
        r9c6.setText("6");
        r9c6.setName("R9-C6"); // NOI18N

        r9c7.setBackground(java.awt.Color.darkGray);
        r9c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c7.setForeground(new java.awt.Color(255, 255, 255));
        r9c7.setText("7");
        r9c7.setName("R9-C7"); // NOI18N
        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r9c8.setBackground(java.awt.Color.darkGray);
        r9c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c8.setForeground(new java.awt.Color(255, 255, 255));
        r9c8.setText("8");
        r9c8.setName("R9-C8"); // NOI18N

        r9c9.setBackground(java.awt.Color.darkGray);
        r9c9.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c9.setForeground(new java.awt.Color(255, 255, 255));
        r9c9.setText("9");
        r9c9.setName("R9-C9"); // NOI18N

        r9c10.setBackground(java.awt.Color.darkGray);
        r9c10.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r9c10.setForeground(new java.awt.Color(255, 255, 255));
        r9c10.setText("10");
        r9c10.setName("R9-C10"); // NOI18N
        r9c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r9c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r2c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r5c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r7c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r8c10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(r1c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r2c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r5c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        screen.setBackground(new java.awt.Color(235, 163, 0));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SCREEN");

        javax.swing.GroupLayout screenLayout = new javax.swing.GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screenLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(215, 215, 215))
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("1");

        jLabel9.setText("2");

        jLabel10.setText("3");

        jLabel11.setText("4");

        jLabel15.setText("5");

        jLabel17.setText("6");

        jLabel18.setText("7");

        jLabel19.setText("8");

        jLabel20.setText("9");

        jLabel21.setText("10");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        r10c5.setBackground(java.awt.Color.darkGray);
        r10c5.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c5.setForeground(new java.awt.Color(255, 255, 255));
        r10c5.setText("5");
        r10c5.setName("R10-C5"); // NOI18N

        r10c4.setBackground(java.awt.Color.darkGray);
        r10c4.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c4.setForeground(new java.awt.Color(255, 255, 255));
        r10c4.setText("4");
        r10c4.setName("R10-C4"); // NOI18N

        r10c6.setBackground(java.awt.Color.darkGray);
        r10c6.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c6.setForeground(new java.awt.Color(255, 255, 255));
        r10c6.setText("6");
        r10c6.setName("R10-C6"); // NOI18N

        r10c7.setBackground(java.awt.Color.darkGray);
        r10c7.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c7.setForeground(new java.awt.Color(255, 255, 255));
        r10c7.setText("7");
        r10c7.setName("R10-C7"); // NOI18N

        r10c8.setBackground(java.awt.Color.darkGray);
        r10c8.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c8.setForeground(new java.awt.Color(255, 255, 255));
        r10c8.setText("8");
        r10c8.setName("R10-C8"); // NOI18N

        r10c3.setBackground(java.awt.Color.darkGray);
        r10c3.setFont(new java.awt.Font("Abhaya Libre ExtraBold", 1, 14)); // NOI18N
        r10c3.setForeground(new java.awt.Color(255, 255, 255));
        r10c3.setText("3");
        r10c3.setName("R10-C3"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(r10c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r10c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r10c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r10c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r10c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r10c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(r10c5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10c6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10c7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10c8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10c3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r10c4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(235, 163, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 163, 0));
        jLabel2.setText("Movie");

        jLabel3.setBackground(new java.awt.Color(235, 163, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 163, 0));
        jLabel3.setText("Time");

        jLabel4.setBackground(new java.awt.Color(235, 163, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 163, 0));
        jLabel4.setText("Tickets");

        jLabel5.setBackground(new java.awt.Color(235, 163, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 163, 0));
        jLabel5.setText("Total");

        jLabel6.setBackground(new java.awt.Color(235, 163, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 163, 0));
        jLabel6.setText("Seats");

        jLabel8.setBackground(new java.awt.Color(235, 163, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Aprill 3, 21.00");

        jLabel7.setBackground(new java.awt.Color(235, 163, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("GingerClown");

        bookNow.setBackground(new java.awt.Color(235, 163, 0));
        bookNow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bookNow.setForeground(new java.awt.Color(255, 255, 255));
        bookNow.setText("BOOK NOW");
        bookNow.setBorderPainted(false);
        bookNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookNowMouseClicked(evt);
            }
        });
        bookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.gray);

        jButton2.setBackground(java.awt.Color.red);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.green);

        jLabel12.setBackground(new java.awt.Color(235, 163, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Available");

        jLabel13.setBackground(new java.awt.Color(235, 163, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Sold");

        jLabel14.setBackground(new java.awt.Color(235, 163, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Selected");

        jTicket.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTicket.setForeground(new java.awt.Color(102, 102, 102));
        jTicket.setText("0");

        jTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTotal.setForeground(new java.awt.Color(102, 102, 102));
        jTotal.setText("0");

        jSeat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSeat.setForeground(new java.awt.Color(102, 102, 102));
        jSeat.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(bookNow, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setDisplayedMnemonic('M');
        title.setFont(new java.awt.Font("Lucida Bright", 3, 24)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Multiplex Theatre Showing Screen 1");
        title.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

    }//GEN-LAST:event_formMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked


    }//GEN-LAST:event_formMouseClicked

    private void bookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowActionPerformed


    }//GEN-LAST:event_bookNowActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r1c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c10ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r2c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2c10ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4c3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bookNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookNowMouseClicked


        for (JToggleButton tButton : bookedSeatSet.keySet()) {

            int value = bookedSeatSet.get(tButton);
            String text = tButton.getText();
            
            JToggleButton tButton2 = new JToggleButton();
            tButton2.setBackground(Color.red);
            tButton2.setForeground(Color.white);
            tButton2.setText(text);
            tButton2.setBounds(tButton.getX(), tButton.getY(), tButton.getWidth(),tButton.getHeight());

            if (value == 12) {

                jPanel1.remove(tButton);
                seatSet.remove(tButton);
                jPanel1.add(tButton2);
                jPanel1.repaint();

            } else if (value == 20) {
                jPanel2.remove(tButton);
                seatSet.remove(tButton);
                jPanel2.add(tButton2);
                jPanel2.repaint();
            }
        }
    }//GEN-LAST:event_bookNowMouseClicked

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9c5ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r9c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9c10ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1c1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookNow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label jSeat;
    private java.awt.Label jTicket;
    private java.awt.Label jTotal;
    private javax.swing.JToggleButton r10c3;
    private javax.swing.JToggleButton r10c4;
    private javax.swing.JToggleButton r10c5;
    private javax.swing.JToggleButton r10c6;
    private javax.swing.JToggleButton r10c7;
    private javax.swing.JToggleButton r10c8;
    private javax.swing.JToggleButton r1c1;
    private javax.swing.JToggleButton r1c10;
    private javax.swing.JToggleButton r1c2;
    private javax.swing.JToggleButton r1c3;
    private javax.swing.JToggleButton r1c4;
    private javax.swing.JToggleButton r1c5;
    private javax.swing.JToggleButton r1c6;
    private javax.swing.JToggleButton r1c7;
    private javax.swing.JToggleButton r1c8;
    private javax.swing.JToggleButton r1c9;
    private javax.swing.JToggleButton r2c1;
    private javax.swing.JToggleButton r2c10;
    private javax.swing.JToggleButton r2c2;
    private javax.swing.JToggleButton r2c3;
    private javax.swing.JToggleButton r2c4;
    private javax.swing.JToggleButton r2c5;
    private javax.swing.JToggleButton r2c6;
    private javax.swing.JToggleButton r2c7;
    private javax.swing.JToggleButton r2c8;
    private javax.swing.JToggleButton r2c9;
    private javax.swing.JToggleButton r4c1;
    private javax.swing.JToggleButton r4c2;
    private javax.swing.JToggleButton r4c3;
    private javax.swing.JToggleButton r4c4;
    private javax.swing.JToggleButton r4c5;
    private javax.swing.JToggleButton r4c6;
    private javax.swing.JToggleButton r4c7;
    private javax.swing.JToggleButton r4c8;
    private javax.swing.JToggleButton r5c1;
    private javax.swing.JToggleButton r5c10;
    private javax.swing.JToggleButton r5c2;
    private javax.swing.JToggleButton r5c3;
    private javax.swing.JToggleButton r5c4;
    private javax.swing.JToggleButton r5c5;
    private javax.swing.JToggleButton r5c6;
    private javax.swing.JToggleButton r5c7;
    private javax.swing.JToggleButton r5c8;
    private javax.swing.JToggleButton r5c9;
    private javax.swing.JToggleButton r6c1;
    private javax.swing.JToggleButton r6c10;
    private javax.swing.JToggleButton r6c2;
    private javax.swing.JToggleButton r6c3;
    private javax.swing.JToggleButton r6c4;
    private javax.swing.JToggleButton r6c5;
    private javax.swing.JToggleButton r6c6;
    private javax.swing.JToggleButton r6c7;
    private javax.swing.JToggleButton r6c8;
    private javax.swing.JToggleButton r6c9;
    private javax.swing.JToggleButton r7c1;
    private javax.swing.JToggleButton r7c10;
    private javax.swing.JToggleButton r7c2;
    private javax.swing.JToggleButton r7c3;
    private javax.swing.JToggleButton r7c4;
    private javax.swing.JToggleButton r7c5;
    private javax.swing.JToggleButton r7c6;
    private javax.swing.JToggleButton r7c7;
    private javax.swing.JToggleButton r7c8;
    private javax.swing.JToggleButton r7c9;
    private javax.swing.JToggleButton r8c1;
    private javax.swing.JToggleButton r8c10;
    private javax.swing.JToggleButton r8c2;
    private javax.swing.JToggleButton r8c3;
    private javax.swing.JToggleButton r8c4;
    private javax.swing.JToggleButton r8c5;
    private javax.swing.JToggleButton r8c6;
    private javax.swing.JToggleButton r8c7;
    private javax.swing.JToggleButton r8c8;
    private javax.swing.JToggleButton r8c9;
    private javax.swing.JToggleButton r9c1;
    private javax.swing.JToggleButton r9c10;
    private javax.swing.JToggleButton r9c2;
    private javax.swing.JToggleButton r9c3;
    private javax.swing.JToggleButton r9c4;
    private javax.swing.JToggleButton r9c5;
    private javax.swing.JToggleButton r9c6;
    private javax.swing.JToggleButton r9c7;
    private javax.swing.JToggleButton r9c8;
    private javax.swing.JToggleButton r9c9;
    private javax.swing.JPanel screen;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
