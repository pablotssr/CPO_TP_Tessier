/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superpuissance4_console;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Timer;

/**
 *
 * @author pablo
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur Listejoueurs[] = new Joueur[2];
    Joueur JoueurCourant;
    Grille grilleDeJeu = new Grille();

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_jeu.setVisible(false);
        panneau_grille.setVisible(false);
        panneau_win.setVisible(false);
        btn_col_0.setVisible(false);
        btn_col_1.setVisible(false);
        btn_col_2.setVisible(false);
        btn_col_3.setVisible(false);
        btn_col_4.setVisible(false);
        btn_col_5.setVisible(false);
        btn_col_6.setVisible(false);
        taunt.setVisible(false);
                            
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleDeJeu.Cellules[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }

                        if (c.jetonCourant.Couleur.equals(JoueurCourant.Couleur)) {
                            textemessage.setText("le joueur " + JoueurCourant.Nom + "récupère son jeton");
                            Jeton jrecup = c.recupererJeton();
                            JoueurCourant.ajouterJeton(jrecup);
                            joueurSuivant();
                        } else {
                            if (JoueurCourant.nombreDesintegrateurs > 0) {
                                textemessage.setText("le joueur " + JoueurCourant.Nom + "détruit un jeton");
                                c.supprimerJeton();
                                JoueurCourant.utiliserDesintegrateur();
                                joueurSuivant();
                            } else {
                                return;
                            }

                        }

                        grilleDeJeu.tasserGrille();
                        panneau_grille.repaint();
                        lbl_j1_desint.setText(Listejoueurs[0].nombreDesintegrateurs + "");
                        lbl_j2_desint.setText(Listejoueurs[1].nombreDesintegrateurs + "");

                        boolean vict_j1 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[0]);
                        boolean vict_j2 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[1]);

                        if (vict_j1 && !vict_j2) {
                            msgbravo.setText("gg " + Listejoueurs[0].Nom + ", tu as éclaté ton looser d'adversaire.");
                        }

                        if (vict_j2 && !vict_j1) {
                            msgbravo.setText("gg " + Listejoueurs[1].Nom + ", tu as éclaté ton looser d'adversaire.");
                        }
                        if (vict_j1 && vict_j2) {
                            if (JoueurCourant == Listejoueurs[0]) {
                                msgbravo.setText("gg " + Listejoueurs[0].Nom + ", tu as éclaté ton idiot d'adversaire qui fait une fautes de jeu.");
                            } else {
                                msgbravo.setText("gg " + Listejoueurs[1].Nom + ", tu as éclaté ton idiot d'adversaire qui fait une fautes de jeu.");
                            }
                        }
                        if (vict_j1 || vict_j2) {
                            btn_col_0.setVisible(false);
                            btn_col_1.setVisible(false);
                            btn_col_2.setVisible(false);
                            btn_col_3.setVisible(false);
                            btn_col_4.setVisible(false);
                            btn_col_5.setVisible(false);
                            btn_col_6.setVisible(false);
                            panneau_grille.setVisible(false);
                            panneau_info_joueurs.setVisible(false);
                            panneau_win.setVisible(true);
                            panneau_info_jeu.setVisible(false);
                        }

                    }
                });

                panneau_grille.add(cellGraph);
            }
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

        taunt = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_info_jeu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        panneau_win = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgbravo = new javax.swing.JTextArea();
        btn_reload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taunt.setBackground(new java.awt.Color(153, 255, 51));
        taunt.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        taunt.setForeground(new java.awt.Color(0, 255, 255));
        taunt.setText("MOUV DE CLÉBARD XD");
        taunt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(taunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 130, 540, 220));
        taunt.getAccessibleContext().setAccessibleParent(null);

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 204, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("Joueur 1 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Joueur 2 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        nom_joueur1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 220, -1));

        nom_joueur2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, -1));

        btn_start.setText("lets go");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 360, 140));

        panneau_info_joueurs.setBackground(new java.awt.Color(204, 204, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("infos joueurs :");
        panneau_info_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j1_nom.setText("nomjoueur1");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        lbl_j1_couleur.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        lbl_j1_desint.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j1_desint.setText("desintégrateursjoueur1");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("Joueur 2 :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setText("couleur :");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setText("desintégrateurs :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setText("Joueur 1 :");
        panneau_info_joueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setText("couleur :");
        panneau_info_joueurs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setText("desintégrateurs :");
        panneau_info_joueurs.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lbl_j2_nom.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j2_nom.setText("nomjoueur2");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        lbl_j2_couleur.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j2_couleur.setText("couleurjoueur2");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lbl_j2_desint.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_j2_desint.setText("desintégrateursjoueur2");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 10));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 360, 200));

        panneau_info_jeu.setBackground(new java.awt.Color(204, 204, 204));
        panneau_info_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("infos jeu :");
        panneau_info_jeu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel13.setText("C'est le tour de  :");
        panneau_info_jeu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        lbl_jcourant.setFont(new java.awt.Font("ROG Fonts", 1, 14)); // NOI18N
        lbl_jcourant.setText("nomjoueur1");
        panneau_info_jeu.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        textemessage.setColumns(20);
        textemessage.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_info_jeu.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 150));

        getContentPane().add(panneau_info_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 360, 250));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 20));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 30, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 30, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 30, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 30, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 30, -1, -1));

        panneau_win.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("!!!! Bravo !!!!");
        panneau_win.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        msgbravo.setColumns(20);
        msgbravo.setFont(new java.awt.Font("ROG Fonts", 1, 12)); // NOI18N
        msgbravo.setRows(5);
        jScrollPane1.setViewportView(msgbravo);

        panneau_win.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 580, 90));

        btn_reload.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        btn_reload.setText("nouvelle partie ");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });
        panneau_win.add(btn_reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        getContentPane().add(panneau_win, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 146, 640, 290));

        setBounds(0, 0, 1092, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_joueurs.setVisible(true);
        panneau_info_jeu.setVisible(true);
        panneau_grille.setVisible(true);
        btn_col_0.setVisible(true);
        btn_col_1.setVisible(true);
        btn_col_2.setVisible(true);
        btn_col_3.setVisible(true);
        btn_col_4.setVisible(true);
        btn_col_5.setVisible(true);
        btn_col_6.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        if (grilleDeJeu.colonne_remplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        if (grilleDeJeu.colonne_remplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(2);
        if (grilleDeJeu.colonne_remplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        if (grilleDeJeu.colonne_remplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(4);
        if (grilleDeJeu.colonne_remplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(5);
        if (grilleDeJeu.colonne_remplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(6);
        if (grilleDeJeu.colonne_remplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        // TODO add your handling
        panneau_info_joueurs.setVisible(true);
        panneau_info_jeu.setVisible(true);
        panneau_grille.setVisible(true);
        btn_col_0.setVisible(true);
        btn_col_1.setVisible(true);
        btn_col_2.setVisible(true);
        btn_col_3.setVisible(true);
        btn_col_4.setVisible(true);
        btn_col_5.setVisible(true);
        btn_col_6.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);// TODO add your handling code here: code here:
    }//GEN-LAST:event_btn_reloadActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {
        boolean resultatAction;

        resultatAction = grilleDeJeu.ajouterJetonDansColonne(JoueurCourant, indice_colonne);
        Random random = new Random();
        
        // Generate a random number between 0 and 99
        int randomNumber = random.nextInt(100);
        
        // Check if the random number is less than or equal to 30
        if (randomNumber <= 30) {
            taunt.setVisible(true); // Make the label visible

            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    taunt.setVisible(false); // After 2 seconds, make it invisible again
                }
            });
            timer.setRepeats(false); // This ensures the timer only runs once
            timer.start();
        } 
        panneau_grille.repaint();
        lbl_j1_desint.setText(Listejoueurs[0].nombreDesintegrateurs + "");
        lbl_j2_desint.setText(Listejoueurs[1].nombreDesintegrateurs + "");

        boolean vict_j1 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[0]);
        boolean vict_j2 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[1]);

        if (vict_j1 && !vict_j2) {
            msgbravo.setText("gg " + Listejoueurs[0].Nom + ", tu as éclaté ton looser d'adversaire.");
        }

        if (vict_j2 && !vict_j1) {
            msgbravo.setText("gg " + Listejoueurs[1].Nom + ", tu as éclaté ton looser d'adversaire.");
        }
        if (vict_j1 && vict_j2) {
            if (JoueurCourant == Listejoueurs[0]) {
                msgbravo.setText("gg " + Listejoueurs[0].Nom + ", tu as éclaté ton idiot d'adversaire qui fait une fautes de jeu.");
            } else {
                msgbravo.setText("gg " + Listejoueurs[1].Nom + ", tu as éclaté ton idiot d'adversaire qui fait une fautes de jeu.");
            }
        }

        if (vict_j1 || vict_j2) {
                            btn_col_0.setVisible(false);
                            btn_col_1.setVisible(false);
                            btn_col_2.setVisible(false);
                            btn_col_3.setVisible(false);
                            btn_col_4.setVisible(false);
                            btn_col_5.setVisible(false);
                            btn_col_6.setVisible(false);
                                                        panneau_grille.setVisible(false);
                                                        panneau_info_joueurs.setVisible(false);
                                                        panneau_win.setVisible(true);
        panneau_info_jeu.setVisible(false);


                        }
        
        if (resultatAction == true) {
            return true;
        } else {
            return false;
        }
    }

    public void joueurSuivant() {
        if (JoueurCourant == Listejoueurs[0]) {
            JoueurCourant = Listejoueurs[1];
        } else {
            JoueurCourant = Listejoueurs[0];
        }
        lbl_jcourant.setText(JoueurCourant.Nom);
    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    void initialiserPartie() {

        grilleDeJeu.viderGrille();
        //Création des joueurs
        String nomJoueur1 = nom_joueur1.getText();
        Joueur J1 = new Joueur(nomJoueur1);
        String nomJoueur2 = nom_joueur2.getText();
        Joueur J2 = new Joueur(nomJoueur2);
        Listejoueurs[0] = J1;
        Listejoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.Nom + " est de couleur " + J1.Couleur);
        System.out.println(J2.Nom + " est de couleur " + J2.Couleur);

        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);

        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);

        lbl_j1_desint.setText(J1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(J1.nombreDesintegrateurs + "");

        // On donne des jetons aux joueurs
        for (int i = 0; i < 21; i++) {

            Jeton J = new Jeton(Listejoueurs[0].Couleur);

            J1.ajouterJeton(J);

            J2.ajouterJeton(new Jeton(J2.Couleur));
        }

        // Determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = Listejoueurs[0];
        } else {
            JoueurCourant = Listejoueurs[1];
        }

        lbl_jcourant.setText(JoueurCourant.Nom);
        // Génération des 5 trous noirs et de 2 désintégrateurs sur les trou noirs
        int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int ligne_trou_noir = r.nextInt(6);
            int colonne_trou_noir = r.nextInt(7);
            if (compteur < 2) {
                if (!grilleDeJeu.placerDesintegrateur(ligne_trou_noir, colonne_trou_noir)) {
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleDeJeu.placerTrouNoir(ligne_trou_noir, colonne_trou_noir)) {
                i--;
            }
        }

        // On place les trois derniers désintégrateurs
        for (int i = 0; i < 3; i++) {
            int ligne_désin = r.nextInt(6);
            int colonne_désin = r.nextInt(7);
            if (!grilleDeJeu.placerDesintegrateur(ligne_désin, colonne_désin) || grilleDeJeu.Cellules[ligne_désin][colonne_désin].presenceTrouNoir()) {
                i--;
            }
        }

        grilleDeJeu.afficherGrilleSurConsole();

    }

    void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            Listejoueurs[0].Couleur = "Rouge";
            Listejoueurs[1].Couleur = "Jaune";
        } else {
            Listejoueurs[0].Couleur = "Jaune";
            Listejoueurs[1].Couleur = "Rouge";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextArea msgbravo;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_jeu;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_win;
    private javax.swing.JLabel taunt;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
