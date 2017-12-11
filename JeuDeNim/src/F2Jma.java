/*///////////////////////////////////////////////////////////////////////////*/
/*                                                                           */
/*  Cirill Ferrier                   /\       | |            /\        | |   */
/*                                  /  \   ___| |__   ___   /  \   _ __| |_  */
/*  07/12/2017                     / /\ \ / __| '_ \ / _ \ / /\ \ | '__| __| */
/*  Cirill@asheart.fr             / ____ \\__ \ | | |  __// ____ \| |  | |_  */
/*  www.AsheArt.fr               /_/    \_\___/_| |_|\___/_/    \_\_|   \__| */
/*                                                                           */
/*///////////////////////////////////////////////////////////////////////////*/

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class F2Jma extends javax.swing.JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        /////////////////////////////////
        //    Click sur les bouton     //
        /////////////////////////////////
        int indexT;
        
        indexT = 42;
                
        if     (e.getSource()==this.btn_0)  { indexT = 0;  }
        else if(e.getSource()==this.btn_1)  { indexT = 1;  }
        else if(e.getSource()==this.btn_2)  { indexT = 2;  }
        else if(e.getSource()==this.btn_3)  { indexT = 3;  }
        else if(e.getSource()==this.btn_4)  { indexT = 4;  }
        else if(e.getSource()==this.btn_5)  { indexT = 5;  }
        else if(e.getSource()==this.btn_6)  { indexT = 6;  }
        else if(e.getSource()==this.btn_7)  { indexT = 7;  }
        else if(e.getSource()==this.btn_8)  { indexT = 8;  }
        else if(e.getSource()==this.btn_9)  { indexT = 9;  }
        else if(e.getSource()==this.btn_10) { indexT = 10; }
        else if(e.getSource()==this.btn_11) { indexT = 11; }
        else if(e.getSource()==this.btn_122){ indexT = 12; }
        else if(e.getSource()==this.btn_13) { indexT = 13; }
        else if(e.getSource()==this.btn_14) { indexT = 14; }
        else if(e.getSource()==this.btn_15) { indexT = 15; }
        else if(e.getSource()==this.btn_16) { indexT = 16; }
        else if(e.getSource()==this.btn_17) { indexT = 17; }
        else if(e.getSource()==this.btn_18) { indexT = 18; }
        else if(e.getSource()==this.btn_19) { indexT = 19; }
        else if(e.getSource()==this.btn_20) { indexT = 20; } //bouton passer
        
        
        ///////////////////////////////////
        // Gestion des nombre du tableau //
        ///////////////////////////////////
        
        if (indexT != 20) {
            //bouton chiffre    
            if (tableau[indexT] == 0) {
                //ne sert plus à rien mais sa reste de sécurité
                JOptionPane.showMessageDialog(null, "VOUS NE POUVEZ PAS JOUER CE BATON!!!");
            }
        
            else if (indexT >= 0 && indexT <= 19){
                tableau[indexT] = 0; // Mise à 0 du stick
                tour++; // si on est pas encore à 3 le j peut joué
                
                // GESTION DE LA COULEUR //
                switch (indexT) {
                    case 0  : pan0.setBackground(Color.WHITE);  btn_0.setEnabled(false);break;
                    case 1  : pan1.setBackground(Color.WHITE);  btn_1.setEnabled(false);break;
                    case 2  : pan2.setBackground(Color.WHITE);  btn_2.setEnabled(false);break;
                    case 3  : pan3.setBackground(Color.WHITE);  btn_3.setEnabled(false);break;
                    case 4  : pan4.setBackground(Color.WHITE);  btn_4.setEnabled(false);break;
                    case 5  : pan5.setBackground(Color.WHITE);  btn_5.setEnabled(false);break;
                    case 6  : pan6.setBackground(Color.WHITE);  btn_6.setEnabled(false);break;
                    case 7  : pan7.setBackground(Color.WHITE);  btn_7.setEnabled(false);break;
                    case 8  : pan8.setBackground(Color.WHITE);  btn_8.setEnabled(false);break;
                    case 9  : pan9.setBackground(Color.WHITE);  btn_9.setEnabled(false);break;
                    case 10 : pan10.setBackground(Color.WHITE);btn_10.setEnabled(false);break;
                    case 11 : pan11.setBackground(Color.WHITE);btn_11.setEnabled(false);break;
                    case 12 : pan12.setBackground(Color.WHITE);btn_122.setEnabled(false);break;
                    case 13 : pan13.setBackground(Color.WHITE);btn_13.setEnabled(false);break;
                    case 14 : pan14.setBackground(Color.WHITE);btn_14.setEnabled(false);break;
                    case 15 : pan15.setBackground(Color.WHITE);btn_15.setEnabled(false);break;
                    case 16 : pan16.setBackground(Color.WHITE);btn_16.setEnabled(false);break;
                    case 17 : pan17.setBackground(Color.WHITE);btn_17.setEnabled(false);break;
                    case 18 : pan18.setBackground(Color.WHITE);btn_18.setEnabled(false);break;
                    case 19 : pan19.setBackground(Color.WHITE);btn_19.setEnabled(false);break;
                }///////////////
                
                if (joueur == 1 && tour == 3) {
                    joueur = 2;
                    tour   = 0;
                    dernierT = -1;
                    JOptionPane.showMessageDialog(null, "Au tour de joueur 2");
                    joueurLab.setText("" + joueur);
                    
                    for (int i = 0; i <= 19; i++) {
                        if (tableau[i] != 0) {
                            switch (i) {
                                case 0  : btn_0.setEnabled(true);break;
                                case 1  : btn_1.setEnabled(true);break;
                                case 2  : btn_2.setEnabled(true);break;
                                case 3  : btn_3.setEnabled(true);break;
                                case 4  : btn_4.setEnabled(true);break;
                                case 5  : btn_5.setEnabled(true);break;
                                case 6  : btn_6.setEnabled(true);break;
                                case 7  : btn_7.setEnabled(true);break;
                                case 8  : btn_8.setEnabled(true);break;
                                case 9  : btn_9.setEnabled(true);break;
                                case 10 : btn_10.setEnabled(true);break;
                                case 11 : btn_11.setEnabled(true);break;
                                case 12 : btn_122.setEnabled(true);break;
                                case 13 : btn_13.setEnabled(true);break;
                                case 14 : btn_14.setEnabled(true);break;
                                case 15 : btn_15.setEnabled(true);break;
                                case 16 : btn_16.setEnabled(true);break;
                                case 17 : btn_17.setEnabled(true);break;
                                case 18 : btn_18.setEnabled(true);break;
                                case 19 : btn_19.setEnabled(true);break;
                            }///////////////
                        }
                    }
                    
                }
                else if (tour == 3){
                    joueur = 1;
                    tour   = 0;
                    dernierT = -1;
                    JOptionPane.showMessageDialog(null, "Au tour de joueur 1");
                    joueurLab.setText("" + joueur);
                    
                    
                    for (int i = 0; i <= 19; i++) {
                        if (tableau[i] != 0) {
                            switch (i) {
                                case 0  : btn_0.setEnabled(true);break;
                                case 1  : btn_1.setEnabled(true);break;
                                case 2  : btn_2.setEnabled(true);break;
                                case 3  : btn_3.setEnabled(true);break;
                                case 4  : btn_4.setEnabled(true);break;
                                case 5  : btn_5.setEnabled(true);break;
                                case 6  : btn_6.setEnabled(true);break;
                                case 7  : btn_7.setEnabled(true);break;
                                case 8  : btn_8.setEnabled(true);break;
                                case 9  : btn_9.setEnabled(true);break;
                                case 10 : btn_10.setEnabled(true);break;
                                case 11 : btn_11.setEnabled(true);break;
                                case 12 : btn_122.setEnabled(true);break;
                                case 13 : btn_13.setEnabled(true);break;
                                case 14 : btn_14.setEnabled(true);break;
                                case 15 : btn_15.setEnabled(true);break;
                                case 16 : btn_16.setEnabled(true);break;
                                case 17 : btn_17.setEnabled(true);break;
                                case 18 : btn_18.setEnabled(true);break;
                                case 19 : btn_19.setEnabled(true);break;
                            }///////////////
                        }
                    }
                }
                
                ////////////////////////////////
                //  GESTION DU MODE AVANCER   //
                ////////////////////////////////
                
                if(tour == 1) {
                    for (int i = 0; i <= 19; i++) {
                        if ( (i == (indexT - 1)) || (i == (indexT +1)) ) {
                           //rien 
                        }
                        else {
                            switch (i) {
                                case 0  : btn_0.setEnabled(false);break;
                                case 1  : btn_1.setEnabled(false);break;
                                case 2  : btn_2.setEnabled(false);break;
                                case 3  : btn_3.setEnabled(false);break;
                                case 4  : btn_4.setEnabled(false);break;
                                case 5  : btn_5.setEnabled(false);break;
                                case 6  : btn_6.setEnabled(false);break;
                                case 7  : btn_7.setEnabled(false);break;
                                case 8  : btn_8.setEnabled(false);break;
                                case 9  : btn_9.setEnabled(false);break;
                                case 10 : btn_10.setEnabled(false);break;
                                case 11 : btn_11.setEnabled(false);break;
                                case 12 : btn_122.setEnabled(false);break;
                                case 13 : btn_13.setEnabled(false);break;
                                case 14 : btn_14.setEnabled(false);break;
                                case 15 : btn_15.setEnabled(false);break;
                                case 16 : btn_16.setEnabled(false);break;
                                case 17 : btn_17.setEnabled(false);break;
                                case 18 : btn_18.setEnabled(false);break;
                                case 19 : btn_19.setEnabled(false);break;
                            }///////////////
                        }
                    }
                    dernierT = indexT; 
                }
                else if (tour == 2 && (dernierT == (indexT - 1))) {
                    for (int i = 0; i <= 19; i++) {
                        if ( tableau[i] != 0 &&
                             ((i == (dernierT - 1)) || (i == (dernierT + 2)))
                           ) {
                            switch (i) {
                                case 0  : btn_0.setEnabled(true);break;
                                case 1  : btn_1.setEnabled(true);break;
                                case 2  : btn_2.setEnabled(true);break;
                                case 3  : btn_3.setEnabled(true);break;
                                case 4  : btn_4.setEnabled(true);break;
                                case 5  : btn_5.setEnabled(true);break;
                                case 6  : btn_6.setEnabled(true);break;
                                case 7  : btn_7.setEnabled(true);break;
                                case 8  : btn_8.setEnabled(true);break;
                                case 9  : btn_9.setEnabled(true);break;
                                case 10 : btn_10.setEnabled(true);break;
                                case 11 : btn_11.setEnabled(true);break;
                                case 12 : btn_122.setEnabled(true);break;
                                case 13 : btn_13.setEnabled(true);break;
                                case 14 : btn_14.setEnabled(true);break;
                                case 15 : btn_15.setEnabled(true);break;
                                case 16 : btn_16.setEnabled(true);break;
                                case 17 : btn_17.setEnabled(true);break;
                                case 18 : btn_18.setEnabled(true);break;
                                case 19 : btn_19.setEnabled(true);break;
                            }///////////////
                        }
                        else {
                            switch (i) {
                                case 0  : btn_0.setEnabled(false);break;
                                case 1  : btn_1.setEnabled(false);break;
                                case 2  : btn_2.setEnabled(false);break;
                                case 3  : btn_3.setEnabled(false);break;
                                case 4  : btn_4.setEnabled(false);break;
                                case 5  : btn_5.setEnabled(false);break;
                                case 6  : btn_6.setEnabled(false);break;
                                case 7  : btn_7.setEnabled(false);break;
                                case 8  : btn_8.setEnabled(false);break;
                                case 9  : btn_9.setEnabled(false);break;
                                case 10 : btn_10.setEnabled(false);break;
                                case 11 : btn_11.setEnabled(false);break;
                                case 12 : btn_122.setEnabled(false);break;
                                case 13 : btn_13.setEnabled(false);break;
                                case 14 : btn_14.setEnabled(false);break;
                                case 15 : btn_15.setEnabled(false);break;
                                case 16 : btn_16.setEnabled(false);break;
                                case 17 : btn_17.setEnabled(false);break;
                                case 18 : btn_18.setEnabled(false);break;
                                case 19 : btn_19.setEnabled(false);break;
                            }///////////////
                        }
                    }
                }
                else if (tour == 2 && (dernierT == (indexT + 1))) {
                    for (int i = 0; i <= 19; i++) {
                        if ( tableau[i] != 0 &&
                             ((i == (dernierT - 2)) || (i == (dernierT + 1)))
                            ) {
                            switch (i) {
                                case 0  : btn_0.setEnabled(true);break;
                                case 1  : btn_1.setEnabled(true);break;
                                case 2  : btn_2.setEnabled(true);break;
                                case 3  : btn_3.setEnabled(true);break;
                                case 4  : btn_4.setEnabled(true);break;
                                case 5  : btn_5.setEnabled(true);break;
                                case 6  : btn_6.setEnabled(true);break;
                                case 7  : btn_7.setEnabled(true);break;
                                case 8  : btn_8.setEnabled(true);break;
                                case 9  : btn_9.setEnabled(true);break;
                                case 10 : btn_10.setEnabled(true);break;
                                case 11 : btn_11.setEnabled(true);break;
                                case 12 : btn_122.setEnabled(true);break;
                                case 13 : btn_13.setEnabled(true);break;
                                case 14 : btn_14.setEnabled(true);break;
                                case 15 : btn_15.setEnabled(true);break;
                                case 16 : btn_16.setEnabled(true);break;
                                case 17 : btn_17.setEnabled(true);break;
                                case 18 : btn_18.setEnabled(true);break;
                                case 19 : btn_19.setEnabled(true);break;
                            }///////////////
                        }
                        else {
                            switch (i) {
                                case 0  : btn_0.setEnabled(false);break;
                                case 1  : btn_1.setEnabled(false);break;
                                case 2  : btn_2.setEnabled(false);break;
                                case 3  : btn_3.setEnabled(false);break;
                                case 4  : btn_4.setEnabled(false);break;
                                case 5  : btn_5.setEnabled(false);break;
                                case 6  : btn_6.setEnabled(false);break;
                                case 7  : btn_7.setEnabled(false);break;
                                case 8  : btn_8.setEnabled(false);break;
                                case 9  : btn_9.setEnabled(false);break;
                                case 10 : btn_10.setEnabled(false);break;
                                case 11 : btn_11.setEnabled(false);break;
                                case 12 : btn_122.setEnabled(false);break;
                                case 13 : btn_13.setEnabled(false);break;
                                case 14 : btn_14.setEnabled(false);break;
                                case 15 : btn_15.setEnabled(false);break;
                                case 16 : btn_16.setEnabled(false);break;
                                case 17 : btn_17.setEnabled(false);break;
                                case 18 : btn_18.setEnabled(false);break;
                                case 19 : btn_19.setEnabled(false);break;
                            }///////////////
                        }
                    }
                }
            } 
        }
        
        else if (indexT == 20 && tour != 0){ // Bouton Passer
            if (joueur == 1) {
                joueur = 2;
                tour   = 0;
                dernierT = -1;
                JOptionPane.showMessageDialog(null, "Au tour de joueur 2");
                joueurLab.setText("" + joueur);
                
                for (int i = 0; i <= 19; i++) {
                    if (tableau[i] != 0) {
                        switch (i) {
                            case 0  : btn_0.setEnabled(true);break;
                            case 1  : btn_1.setEnabled(true);break;
                            case 2  : btn_2.setEnabled(true);break;
                            case 3  : btn_3.setEnabled(true);break;
                            case 4  : btn_4.setEnabled(true);break;
                            case 5  : btn_5.setEnabled(true);break;
                            case 6  : btn_6.setEnabled(true);break;
                            case 7  : btn_7.setEnabled(true);break;
                            case 8  : btn_8.setEnabled(true);break;
                            case 9  : btn_9.setEnabled(true);break;
                            case 10 : btn_10.setEnabled(true);break;
                            case 11 : btn_11.setEnabled(true);break;
                            case 12 : btn_122.setEnabled(true);break;
                            case 13 : btn_13.setEnabled(true);break;
                            case 14 : btn_14.setEnabled(true);break;
                            case 15 : btn_15.setEnabled(true);break;
                            case 16 : btn_16.setEnabled(true);break;
                            case 17 : btn_17.setEnabled(true);break;
                            case 18 : btn_18.setEnabled(true);break;
                            case 19 : btn_19.setEnabled(true);break;
                        }///////////////
                    }
                }
            }
            else {
                joueur = 1;
                tour   = 0;
                dernierT = -1;
                JOptionPane.showMessageDialog(null, "Au tour de joueur 1");
                joueurLab.setText("" + joueur);
                
                for (int i = 0; i <= 19; i++) {
                    if (tableau[i] != 0) {
                        switch (i) {
                            case 0  : btn_0.setEnabled(true);break;
                            case 1  : btn_1.setEnabled(true);break;
                            case 2  : btn_2.setEnabled(true);break;
                            case 3  : btn_3.setEnabled(true);break;
                            case 4  : btn_4.setEnabled(true);break;
                            case 5  : btn_5.setEnabled(true);break;
                            case 6  : btn_6.setEnabled(true);break;
                            case 7  : btn_7.setEnabled(true);break;
                            case 8  : btn_8.setEnabled(true);break;
                            case 9  : btn_9.setEnabled(true);break;
                            case 10 : btn_10.setEnabled(true);break;
                            case 11 : btn_11.setEnabled(true);break;
                            case 12 : btn_122.setEnabled(true);break;
                            case 13 : btn_13.setEnabled(true);break;
                            case 14 : btn_14.setEnabled(true);break;
                            case 15 : btn_15.setEnabled(true);break;
                            case 16 : btn_16.setEnabled(true);break;
                            case 17 : btn_17.setEnabled(true);break;
                            case 18 : btn_18.setEnabled(true);break;
                            case 19 : btn_19.setEnabled(true);break;
                        }///////////////
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Interdiction de paszer ton tour, MARGOULIN!!!");
        }
        
        
        // FIN DU JEU
        if (tableau[0] == 0 && tableau[7]  == 0 && tableau[14] == 0 &&
            tableau[1] == 0 && tableau[8]  == 0 && tableau[15] == 0 &&
            tableau[2] == 0 && tableau[9]  == 0 && tableau[16] == 0 &&
            tableau[3] == 0 && tableau[10] == 0 && tableau[17] == 0 &&
            tableau[4] == 0 && tableau[11] == 0 && tableau[18] == 0 && 
            tableau[5] == 0 && tableau[12] == 0 && tableau[19] == 0 &&
            tableau[6] == 0 && tableau[13] == 0) {
            
            if (tour != 0) {
                JOptionPane.showMessageDialog(null, "Joueur " + joueur + " vous avez perdu");
            }
            else {
                if (joueur == 1) {
                    JOptionPane.showMessageDialog(null, "Joueur 2 vous avez perdu");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Joueur 1 vous avez perdu");
                }
            }
        }
        ///////////////
        
        System.out.println("\n");
        
        for(int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    //                          VARIABLE GLOBAL                              //
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    
    int tableau[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int joueur    = 1;
    int tour      = 0;
    int dernierT  = -1;
      
    public F2Jma() {
        initComponents();
        this.setTitle("Jeu de Nim : Mode 2 joueur avancé"); 
        
        for(int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
        }
        
        this.btn_0.addActionListener(this);
        this.btn_1.addActionListener(this);
        this.btn_2.addActionListener(this);
        this.btn_3.addActionListener(this);
        this.btn_4.addActionListener(this);
        this.btn_5.addActionListener(this);
        this.btn_6.addActionListener(this);
        this.btn_7.addActionListener(this);
        this.btn_8.addActionListener(this);
        this.btn_9.addActionListener(this);
        this.btn_10.addActionListener(this);
        this.btn_11.addActionListener(this);
        this.btn_122.addActionListener(this);
        this.btn_13.addActionListener(this);
        this.btn_14.addActionListener(this);
        this.btn_15.addActionListener(this);
        this.btn_16.addActionListener(this);
        this.btn_17.addActionListener(this);
        this.btn_18.addActionListener(this);
        this.btn_19.addActionListener(this);
        this.btn_20.addActionListener(this);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_12 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_122 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_15 = new javax.swing.JButton();
        btn_16 = new javax.swing.JButton();
        btn_17 = new javax.swing.JButton();
        btn_18 = new javax.swing.JButton();
        btn_19 = new javax.swing.JButton();
        pan1 = new javax.swing.JPanel();
        pan3 = new javax.swing.JPanel();
        pan2 = new javax.swing.JPanel();
        pan4 = new javax.swing.JPanel();
        pan5 = new javax.swing.JPanel();
        pan6 = new javax.swing.JPanel();
        pan7 = new javax.swing.JPanel();
        pan8 = new javax.swing.JPanel();
        pan9 = new javax.swing.JPanel();
        pan10 = new javax.swing.JPanel();
        pan11 = new javax.swing.JPanel();
        pan12 = new javax.swing.JPanel();
        pan13 = new javax.swing.JPanel();
        pan14 = new javax.swing.JPanel();
        pan15 = new javax.swing.JPanel();
        pan16 = new javax.swing.JPanel();
        pan17 = new javax.swing.JPanel();
        pan18 = new javax.swing.JPanel();
        pan19 = new javax.swing.JPanel();
        pan0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        joueurLab = new javax.swing.JLabel();
        btn_20 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        btn_redemare = new javax.swing.JMenu();

        btn_12.setText("1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btn_0.setText("0");

        btn_1.setText("1");

        btn_2.setText("2");

        btn_3.setText("3");

        btn_4.setText("4");

        btn_5.setText("5");

        btn_6.setText("6");

        btn_7.setText("7");

        btn_8.setText("8");

        btn_9.setText("9");

        btn_10.setText("10");

        btn_11.setText("11");

        btn_122.setText("12");

        btn_13.setText("13");

        btn_14.setText("14");

        btn_15.setText("15");

        btn_16.setText("16");

        btn_17.setText("17");

        btn_18.setText("18");

        btn_19.setText("19");

        pan1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
        pan4.setLayout(pan4Layout);
        pan4Layout.setHorizontalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan4Layout.setVerticalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan7Layout = new javax.swing.GroupLayout(pan7);
        pan7.setLayout(pan7Layout);
        pan7Layout.setHorizontalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan7Layout.setVerticalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan8Layout = new javax.swing.GroupLayout(pan8);
        pan8.setLayout(pan8Layout);
        pan8Layout.setHorizontalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan8Layout.setVerticalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan9Layout = new javax.swing.GroupLayout(pan9);
        pan9.setLayout(pan9Layout);
        pan9Layout.setHorizontalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan9Layout.setVerticalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan10Layout = new javax.swing.GroupLayout(pan10);
        pan10.setLayout(pan10Layout);
        pan10Layout.setHorizontalGroup(
            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan10Layout.setVerticalGroup(
            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan11Layout = new javax.swing.GroupLayout(pan11);
        pan11.setLayout(pan11Layout);
        pan11Layout.setHorizontalGroup(
            pan11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan11Layout.setVerticalGroup(
            pan11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan12Layout = new javax.swing.GroupLayout(pan12);
        pan12.setLayout(pan12Layout);
        pan12Layout.setHorizontalGroup(
            pan12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan12Layout.setVerticalGroup(
            pan12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan13Layout = new javax.swing.GroupLayout(pan13);
        pan13.setLayout(pan13Layout);
        pan13Layout.setHorizontalGroup(
            pan13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan13Layout.setVerticalGroup(
            pan13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan14.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan14Layout = new javax.swing.GroupLayout(pan14);
        pan14.setLayout(pan14Layout);
        pan14Layout.setHorizontalGroup(
            pan14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan14Layout.setVerticalGroup(
            pan14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan15.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan15Layout = new javax.swing.GroupLayout(pan15);
        pan15.setLayout(pan15Layout);
        pan15Layout.setHorizontalGroup(
            pan15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan15Layout.setVerticalGroup(
            pan15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan16.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan16Layout = new javax.swing.GroupLayout(pan16);
        pan16.setLayout(pan16Layout);
        pan16Layout.setHorizontalGroup(
            pan16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan16Layout.setVerticalGroup(
            pan16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan17Layout = new javax.swing.GroupLayout(pan17);
        pan17.setLayout(pan17Layout);
        pan17Layout.setHorizontalGroup(
            pan17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan17Layout.setVerticalGroup(
            pan17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan18Layout = new javax.swing.GroupLayout(pan18);
        pan18.setLayout(pan18Layout);
        pan18Layout.setHorizontalGroup(
            pan18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan18Layout.setVerticalGroup(
            pan18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan19.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan19Layout = new javax.swing.GroupLayout(pan19);
        pan19.setLayout(pan19Layout);
        pan19Layout.setHorizontalGroup(
            pan19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan19Layout.setVerticalGroup(
            pan19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        pan0.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pan0Layout = new javax.swing.GroupLayout(pan0);
        pan0.setLayout(pan0Layout);
        pan0Layout.setHorizontalGroup(
            pan0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pan0Layout.setVerticalGroup(
            pan0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Au tour du joueur : ");
        jLabel1.setToolTipText("");

        joueurLab.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        joueurLab.setForeground(new java.awt.Color(255, 0, 0));
        joueurLab.setText("1");
        joueurLab.setToolTipText("");

        btn_20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btn_20.setText("Passer");
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });

        btn_redemare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/refresh.png"))); // NOI18N
        btn_redemare.setText("Redémaré le Jeu");
        btn_redemare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_redemareMouseClicked(evt);
            }
        });
        jMenuBar2.add(btn_redemare);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(pan0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(pan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(pan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(pan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pan7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(pan8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(pan9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joueurLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pan10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pan11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_122, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pan12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(pan13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(pan14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pan15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pan16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pan17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(pan18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(pan19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(joueurLab))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pan0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_122, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_redemareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_redemareMouseClicked
        joueur    = 1;
        joueurLab.setText("" + joueur);
        tour      = 0;
        dernierT  = -1;
        
        for (int i = 0; i <= 19; i++) {
            tableau[i] = 1;
            switch (i) {
                case 0  : pan0.setBackground(Color.BLACK);  btn_0.setEnabled(true);break;
                case 1  : pan1.setBackground(Color.BLACK);  btn_1.setEnabled(true);break;
                case 2  : pan2.setBackground(Color.BLACK);  btn_2.setEnabled(true);break;
                case 3  : pan3.setBackground(Color.BLACK);  btn_3.setEnabled(true);break;
                case 4  : pan4.setBackground(Color.BLACK);  btn_4.setEnabled(true);break;
                case 5  : pan5.setBackground(Color.BLACK);  btn_5.setEnabled(true);break;
                case 6  : pan6.setBackground(Color.BLACK);  btn_6.setEnabled(true);break;
                case 7  : pan7.setBackground(Color.BLACK);  btn_7.setEnabled(true);break;
                case 8  : pan8.setBackground(Color.BLACK);  btn_8.setEnabled(true);break;
                case 9  : pan9.setBackground(Color.BLACK);  btn_9.setEnabled(true);break;
                case 10 : pan10.setBackground(Color.BLACK); btn_10.setEnabled(true);break;
                case 11 : pan11.setBackground(Color.BLACK); btn_11.setEnabled(true);break;
                case 12 : pan12.setBackground(Color.BLACK); btn_122.setEnabled(true);break;
                case 13 : pan13.setBackground(Color.BLACK); btn_13.setEnabled(true);break;
                case 14 : pan14.setBackground(Color.BLACK); btn_14.setEnabled(true);break;
                case 15 : pan15.setBackground(Color.BLACK); btn_15.setEnabled(true);break;
                case 16 : pan16.setBackground(Color.BLACK); btn_16.setEnabled(true);break;
                case 17 : pan17.setBackground(Color.BLACK); btn_17.setEnabled(true);break;
                case 18 : pan18.setBackground(Color.BLACK); btn_18.setEnabled(true);break;
                case 19 : pan19.setBackground(Color.BLACK); btn_19.setEnabled(true);break;
            }///////////////
        }
    }//GEN-LAST:event_btn_redemareMouseClicked

    
   

    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_122;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_15;
    private javax.swing.JButton btn_16;
    private javax.swing.JButton btn_17;
    private javax.swing.JButton btn_18;
    private javax.swing.JButton btn_19;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JMenu btn_redemare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel joueurLab;
    private javax.swing.JPanel pan0;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan10;
    private javax.swing.JPanel pan11;
    private javax.swing.JPanel pan12;
    private javax.swing.JPanel pan13;
    private javax.swing.JPanel pan14;
    private javax.swing.JPanel pan15;
    private javax.swing.JPanel pan16;
    private javax.swing.JPanel pan17;
    private javax.swing.JPanel pan18;
    private javax.swing.JPanel pan19;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JPanel pan4;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    private javax.swing.JPanel pan7;
    private javax.swing.JPanel pan8;
    private javax.swing.JPanel pan9;
    // End of variables declaration//GEN-END:variables

    
}
