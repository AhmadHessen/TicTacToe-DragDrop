
public class Menu extends javax.swing.JFrame 
{
     public Menu() {
        initComponents();
        setLocationRelativeTo(null); 
        setSize(430, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TwoPlayers = new javax.swing.JLabel();
        onePlayer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TwoPlayers.setBackground(new java.awt.Color(255, 255, 255));
        TwoPlayers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TwoPlayers.setForeground(new java.awt.Color(255, 255, 255));
        TwoPlayers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people.png"))); // NOI18N
        TwoPlayers.setText("Two Players");
        TwoPlayers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwoPlayersMouseClicked(evt);
            }
        });
        getContentPane().add(TwoPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        onePlayer.setBackground(new java.awt.Color(255, 255, 255));
        onePlayer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        onePlayer.setForeground(new java.awt.Color(255, 255, 255));
        onePlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CharlieandtheChocolateFactory2.png"))); // NOI18N
        onePlayer.setText("One Player");
        onePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onePlayerMouseClicked(evt);
            }
        });
        getContentPane().add(onePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 120));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_delete.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePlayerMouseClicked
       this.setVisible(false);
       OnePlayer GO = new OnePlayer();
       GO.setVisible(true);
    }//GEN-LAST:event_onePlayerMouseClicked

    private void TwoPlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwoPlayersMouseClicked
       this.setVisible(false);
       TwoPlayers GO = new TwoPlayers();
       GO.setVisible(true);
    }//GEN-LAST:event_TwoPlayersMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
         setState(Menu.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TwoPlayers;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel onePlayer;
    // End of variables declaration//GEN-END:variables
}
