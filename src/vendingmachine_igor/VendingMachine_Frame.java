package vendingmachine_igor;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 * @author Igor Henrique da Silva
 */
 
 //Commentaries were set up both in English and Portuguese.
 
//Criação da classe "VendingMachine_Frame" que cria uma tela para ambientação.
//Creating the class "VendingMachine_Frame" that generates a frame.
public class VendingMachine_Frame extends javax.swing.JFrame {
    
    double credit = 0.0; //Credit in machine / Crédito na máquina.
    double profit = 0.0; //Profit of the sales / Lucro das vendas.
    double wallet = 15.0; //Total of money's user / Dinheiro do usuário.
    VendingMachine vm = new VendingMachine(); //Creating an object "vm" from "VendingMachine"./ Criando um objeto "vm" do tipo "VendingMachine".

    //Método criado para exibição da tela.
    //This method were created to show the Vending Machine frame.
    public VendingMachine_Frame() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
        
        //Estocando produtos.
        //Stocking products.
        products = vm.restockProducts();
        
        //Exibindo o preço dos produtos.
        //Showing the product prices.
        a1.setText(NumberFormat.getCurrencyInstance().format(products.get(0).getPrice()));
        a2.setText(NumberFormat.getCurrencyInstance().format(products.get(1).getPrice()));
        a3.setText(NumberFormat.getCurrencyInstance().format(products.get(2).getPrice()));
        b1.setText(NumberFormat.getCurrencyInstance().format(products.get(3).getPrice()));
        b2.setText(NumberFormat.getCurrencyInstance().format(products.get(4).getPrice()));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");

    }
    
    //Abaixo estão as ações e atribuições dos componentes da tela.
    //Below there are the actions and attributes of the frame components.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelWallet = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonNickel = new javax.swing.JButton();
        jButton1Dime = new javax.swing.JButton();
        jButtonQuarter = new javax.swing.JButton();
        jButtonDollar = new javax.swing.JButton();
        b1 = new java.awt.Label();
        a1 = new java.awt.Label();
        jButtonA1 = new javax.swing.JButton();
        jLabelProfit = new javax.swing.JLabel();
        jButtonA2 = new javax.swing.JButton();
        jButtonRestock = new javax.swing.JButton();
        jButtonA3 = new javax.swing.JButton();
        jButtonRemoveMoney = new javax.swing.JButton();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        a3 = new java.awt.Label();
        a2 = new java.awt.Label();
        b2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneCredit = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Apple Color Emoji", 1, 14)); // NOI18N
        jLabel1.setText("Credit:");

        jLabelWallet.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabelWallet.setForeground(new java.awt.Color(0, 0, 102));
        jLabelWallet.setText("$10.00 remaining");

        jLabel2.setFont(new java.awt.Font("Apple Color Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Insert:");

        jButtonNickel.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/nickel.png")); // NOI18N
        jButtonNickel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNickelActionPerformed(evt);
            }
        });

        jButton1Dime.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/dime.png")); // NOI18N
        jButton1Dime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DimeActionPerformed(evt);
            }
        });

        jButtonQuarter.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/quarter.png")); // NOI18N
        jButtonQuarter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuarterActionPerformed(evt);
            }
        });

        jButtonDollar.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/dollar.png")); // NOI18N
        jButtonDollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDollarActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 153));
        b1.setText("B1");

        a1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(0, 0, 153));
        a1.setText("A1");

        jButtonA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor/icons/main-thumb-t-3241-50-RbYR6v64dIlLPJK0UjRjletq6MAax0Wt.jpeg"))); // NOI18N
        jButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA1ActionPerformed(evt);
            }
        });

        jLabelProfit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabelProfit.setForeground(new java.awt.Color(0, 0, 102));
        jLabelProfit.setText("Sales $0.00");

        jButtonA2.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/fanta-6055.jpg")); // NOI18N
        jButtonA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA2ActionPerformed(evt);
            }
        });

        jButtonRestock.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButtonRestock.setText("Restock products");
        jButtonRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestockActionPerformed(evt);
            }
        });

        jButtonA3.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/SPRITE-logo-50x50.png")); // NOI18N
        jButtonA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA3ActionPerformed(evt);
            }
        });

        jButtonRemoveMoney.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButtonRemoveMoney.setText("Remove money");
        jButtonRemoveMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveMoneyActionPerformed(evt);
            }
        });

        jButtonB1.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/logo_doritos.png")); // NOI18N
        jButtonB1.setActionCommand("ButtonDoritos");
        jButtonB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB1ActionPerformed(evt);
            }
        });

        jButtonB2.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/logo_lays.png")); // NOI18N
        jButtonB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB2ActionPerformed(evt);
            }
        });

        a3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        a3.setForeground(new java.awt.Color(0, 0, 153));
        a3.setText("A3");

        a2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        a2.setForeground(new java.awt.Color(0, 0, 153));
        a2.setText("A2");

        b2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 153));
        b2.setText("B2");

        jTextPaneCredit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPaneCredit.setEnabled(false);
        jScrollPane1.setViewportView(jTextPaneCredit);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/igorhen_rique/NetBeansProjects/VendingMachine_Igor/src/vendingmachine_igor/icons/logo_73.gif")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelProfit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRestock)
                            .addComponent(jButtonRemoveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jButtonNickel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1Dime, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonQuarter, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDollar))
                            .addComponent(jLabelWallet)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDollar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNickel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonQuarter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Dime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelWallet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProfit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNickelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNickelActionPerformed
        if(wallet<=0 || wallet<0.05)
        JOptionPane.showMessageDialog(null, "You don't have enough money!");
        else {
            wallet -= 0.05;
            credit += 0.05;
            jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
            jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        }
    }//GEN-LAST:event_jButtonNickelActionPerformed

    private void jButton1DimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DimeActionPerformed
        if(wallet<=0 || wallet<0.1)
        JOptionPane.showMessageDialog(null, "You don't have enough money!");
        else {
            wallet -= 0.1;
            credit += 0.1;
            jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
            jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        }
    }//GEN-LAST:event_jButton1DimeActionPerformed

    private void jButtonQuarterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuarterActionPerformed
        if(wallet<=0 || wallet<0.25)
        JOptionPane.showMessageDialog(null, "You don't have enough money!");
        else {
            wallet -= 0.25;
            credit += 0.25;
            jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
            jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        }
    }//GEN-LAST:event_jButtonQuarterActionPerformed

    private void jButtonDollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDollarActionPerformed
        if(wallet<=0 || wallet<1)
        JOptionPane.showMessageDialog(null, "You don't have enough money!");
        else {
            wallet -= 1;
            credit += 1;
            jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
            jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        }
    }//GEN-LAST:event_jButtonDollarActionPerformed

    private void jButtonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA1ActionPerformed
        if(credit==0)
        JOptionPane.showMessageDialog(rootPane, "Insert coins in order to buy "+products.get(0).getName());
        else if(credit<products.get(0).getPrice()) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient credit.\nInsert coins in order to buy "+products.get(0).getName());
            wallet += credit; credit = 0;
        } else if(products.get(0).getQuantity() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Sold out!");
        } else {
            profit += credit; credit = 0;
            int qty = products.get(0).getQuantity();
            products.get(0).setQuantity(qty-1);
            JOptionPane.showMessageDialog(rootPane, "You got a "+products.get(0).getName());
        }
        if(products.get(0).getQuantity()==0)
        jButtonA1.setIcon(null);
        jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonA1ActionPerformed

    private void jButtonA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA2ActionPerformed
        if(credit==0)
        JOptionPane.showMessageDialog(rootPane, "Insert coins in order to buy "+products.get(1).getName());
        else if(credit<products.get(1).getPrice()) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient credit.\nInsert coins in order to buy "+products.get(1).getName());
            wallet += credit; credit = 0;
        } else if(products.get(1).getQuantity() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Sold out!");
        } else {
            profit += credit; credit = 0;
            int qty = products.get(1).getQuantity();
            products.get(1).setQuantity(qty-1);
            JOptionPane.showMessageDialog(rootPane, "You got a "+products.get(1).getName());
        }
        if(products.get(1).getQuantity()==0)
        jButtonA2.setIcon(null);
        jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonA2ActionPerformed

    private void jButtonRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestockActionPerformed
        products.clear();
        products = vm.restockProducts();
/*        jButtonA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor.icons/main-thumb-t-3241-50-RbYR6v64dIlLPJK0UjRjletq6MAax0Wt.jpeg")));
        jButtonA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor.icons/fanta-6055.jpg")));
        jButtonA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor.icons/SPRITE-logo-50x50.png")));
        jButtonB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor.icons/logo_doritos.png")));
        jButtonB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingmachine_igor.icons/logo_lays.png")));
        */
    }//GEN-LAST:event_jButtonRestockActionPerformed

    private void jButtonA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA3ActionPerformed
        if(credit==0)
        JOptionPane.showMessageDialog(rootPane, "Insert coins in order to buy "+products.get(2).getName());
        else if(credit<products.get(2).getPrice()) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient credit.\nInsert coins in order to buy "+products.get(2).getName());
            wallet += credit; credit = 0;
        } else if(products.get(2).getQuantity() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Sold out!");
        } else {
            profit += credit; credit = 0;
            int qty = products.get(1).getQuantity();
            products.get(2).setQuantity(qty-1);
            JOptionPane.showMessageDialog(rootPane, "You got a "+products.get(2).getName());
        }
        if(products.get(2).getQuantity()==0)
        jButtonA3.setIcon(null);
        jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonA3ActionPerformed

    private void jButtonRemoveMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveMoneyActionPerformed
        JOptionPane.showMessageDialog(rootPane, NumberFormat.getCurrencyInstance().format(profit)+" removed successfuly!");
        profit = 0.0;
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonRemoveMoneyActionPerformed

    private void jButtonB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB1ActionPerformed
        if(credit==0)
        JOptionPane.showMessageDialog(rootPane, "Insert coins in order to buy "+products.get(3).getName());
        else if(credit<products.get(3).getPrice()) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient credit.\nInsert coins in order to buy "+products.get(3).getName());
            wallet += credit; credit = 0;
        } else if(products.get(3).getQuantity() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Sold out!");
        } else {
            profit += credit; credit = 0;
            int qty = products.get(3).getQuantity();
            products.get(3).setQuantity(qty-1);
            JOptionPane.showMessageDialog(rootPane, "You got a "+products.get(3).getName());
        }
        if(products.get(3).getQuantity()==0)
        jButtonB1.setIcon(null);
        jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonB1ActionPerformed

    private void jButtonB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB2ActionPerformed
        if(credit==0)
        JOptionPane.showMessageDialog(rootPane, "Insert coins in order to buy "+products.get(4).getName());
        else if(credit<products.get(4).getPrice()) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient credit.\nInsert coins in order to buy "+products.get(4).getName());
            wallet += credit; credit = 0;
        } else if(products.get(4).getQuantity() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Sold out!");
        } else {
            profit += credit; credit = 0;
            int qty = products.get(4).getQuantity();
            products.get(4).setQuantity(qty-1);
            JOptionPane.showMessageDialog(rootPane, "You got a "+products.get(4).getName());
        }
        if(products.get(4).getQuantity()==0)
        jButtonB2.setIcon(null);
        jTextPaneCredit.setText(NumberFormat.getCurrencyInstance().format(credit));
        jLabelWallet.setText("You have "+NumberFormat.getCurrencyInstance().format(wallet)+" remaining");
        jLabelProfit.setText("Sales "+NumberFormat.getCurrencyInstance().format(profit));
    }//GEN-LAST:event_jButtonB2ActionPerformed

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
            java.util.logging.Logger.getLogger(VendingMachine_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingMachine_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingMachine_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingMachine_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine_Frame().setVisible(true);
            }
        });
    }
    
    ArrayList<Products> products = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label a1;
    private java.awt.Label a2;
    private java.awt.Label a3;
    private java.awt.Label b1;
    private java.awt.Label b2;
    private javax.swing.JButton jButton1Dime;
    private javax.swing.JButton jButtonA1;
    private javax.swing.JButton jButtonA2;
    private javax.swing.JButton jButtonA3;
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonDollar;
    private javax.swing.JButton jButtonNickel;
    private javax.swing.JButton jButtonQuarter;
    private javax.swing.JButton jButtonRemoveMoney;
    private javax.swing.JButton jButtonRestock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelProfit;
    private javax.swing.JLabel jLabelWallet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneCredit;
    // End of variables declaration//GEN-END:variables
}
