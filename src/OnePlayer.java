import javax.swing.*;

public class OnePlayer extends javax.swing.JFrame 
{

    public OnePlayer() 
    {
        initComponents();
        setLocationRelativeTo(null); 
        setSize(430, 500);
    }
        
    public void CheckWin()
    {
        if(s1.getText().equals(s2.getText()) && s1.getText().equals(s3.getText()))
        {
            if(s1.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();  
        }
        else if(s1.getText().equals(s5.getText()) && s1.getText().equals(s9.getText()))
        {
           if(s1.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
            
        }    
        else if(s1.getText().equals(s4.getText()) && s1.getText().equals(s7.getText()))
        {
            if(s1.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
        }
        else if(s5.getText().equals(s4.getText()) && s5.getText().equals(s6.getText()))
        {
            if(s5.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
        }
        
        else if(s5.getText().equals(s2.getText()) && s5.getText().equals(s8.getText()))
        {
           if(s5.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
        }
        else if(s5.getText().equals(s3.getText()) && s5.getText().equals(s7.getText()))
        {
            if(s5.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
        }
        else if(s3.getText().equals(s6.getText()) && s3.getText().equals(s9.getText()))
        {
            if(s3.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
        }
        
        else if(s7.getText().equals(s8.getText()) && s7.getText().equals(s9.getText()))
        {
            if(s7.getText().equals("    X"))
            {
                JOptionPane.showMessageDialog(null, "Human WON!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Computer WON!");
            }
            
            Reset();
            
        }else if(!"    1".equals(s1.getText())
                && !"    2".equals(s2.getText()) 
                && !"    3".equals(s3.getText()) 
                && !"    4".equals(s4.getText()) 
                && !"    5".equals(s5.getText()) 
                && !"    6".equals(s6.getText())
                && !"    7".equals(s7.getText())
                && !"    8".equals(s8.getText())
                && !"    9".equals(s9.getText()))
        {
            JOptionPane.showMessageDialog(null, "It's DRAW!");
            Reset();
        }
    }
    
    public void Reset()
    {
        s1.setText("    1");
        s2.setText("    2");
        s3.setText("    3");
        s4.setText("    4");
        s5.setText("    5");
        s6.setText("    6");
        s7.setText("    7");
        s8.setText("    8");
        s9.setText("    9");
    }
      
    public void Computer()
    {
       if(s1.getText().equals("    1"))
           s1.setText("    O");
       
       else if(s2.getText().equals("    2"))
           s2.setText("    O");

       else if(s3.getText().equals("    3"))
           s3.setText("    O");

       else if(s4.getText().equals("    4"))
           s4.setText("    O");

       else if(s5.getText().equals("    5"))
           s5.setText("    O");

       else if(s6.getText().equals("    6"))
           s6.setText("    O");

       else if(s7.getText().equals("    7"))
           s7.setText("    O");

       else if(s8.getText().equals("    8"))
           s8.setText("    O");

       else if(s9.getText().equals("    9"))
           s9.setText("    O"); 
       
       CheckWin();
    }

    public void CheckToWin()
    {
        CheckWin();
        
        if(s1.getText().equals(s2.getText()) && s3.getText().equals("    3") )
        {
            s3.setText("    O");
        }
        else if(s1.getText().equals(s3.getText()) && s2.getText().equals("    2"))	
        {
            s2.setText("    O");
        }
        else if(s2.getText().equals(s3.getText()) && s1.getText().equals("    1") )
        {
            s1.setText("    O");
        }
         

        else if(s1.getText().equals(s4.getText()) && s7.getText().equals("    7"))
        {
            s7.setText("    O");
        }
        else if(s1.getText().equals(s7.getText()) && s4.getText().equals("    4"))
        {
            s4.setText("    O");
        }
        else if(s4.getText().equals(s7.getText()) && s1.getText().equals("    1"))
	{
            s1.setText("    O");
        }

        else if(s1.getText().equals(s5.getText()) && s9.getText().equals("    9"))
	{
            s9.setText("    O");
        }
        else if(s1.getText().equals(s9.getText())&& s5.getText().equals("    5"))
        {
            s5.setText("    O");
        }
        else if(s9.getText().equals(s5.getText()) && s1.getText().equals("    1"))
	{
            s1.setText("    O");
        }

        else if(s4.getText().equals(s5.getText()) && s6.getText().equals("    6"))
        {
            s6.setText("    O");
        }
        else if(s4.getText().equals(s6.getText()) && s5.getText().equals("    5"))
	{
            s5.setText("    O");
        }
        else if(s5.getText().equals(s6.getText()) && s4.getText().equals("    4"))
	{
            s4.setText("    O");
        }

        else if(s2.getText().equals(s5.getText()) && s8.getText().equals("    8"))
	{
            s8.setText("    O");
        }
        else if(s2.getText().equals(s8.getText()) && s5.getText().equals("    5"))
	{
            s5.setText("    O");
        }
        else if(s5.getText().equals(s8.getText()) && s2.getText().equals("    2"))
	{
            s2.setText("    O");
        }

        else if(s3.getText().equals(s5.getText()) && s7.getText().equals("    7"))
	{
            s7.setText("    O");
        }
	else if(s3.getText().equals(s7.getText()) && s5.getText().equals("    5"))
	{
            s5.setText("    O");
        }
        else if(s5.getText().equals(s7.getText()) && s3.getText().equals("    3"))
	{
            s3.setText("    O");
        }

        else if(s7.getText().equals(s8.getText()) && s9.getText().equals("    9"))
	{
            s9.setText("    O");
        }
        else if(s7.getText().equals(s9.getText()) && s8.getText().equals("    8"))
	{
            s8.setText("    O");
        }
        else if(s8.getText().equals(s9.getText()) && s7.getText().equals("    7"))
	{
            s7.setText("    O");
        }

        else if(s3.getText().equals(s6.getText()) && s9.getText().equals("    9"))
	{
            s9.setText("    O");
        }
        else if(s3.getText().equals(s9.getText()) && s6.getText().equals("    6"))
	{
            s6.setText("    O");
        }
        else if(s6.getText().equals(s9.getText()) && s3.getText().equals("    3"))
	{
            s3.setText("    O");
        }
        else 
            Computer();
        
        CheckWin();
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s1.setText("    1");
        s1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        s1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1MouseClicked(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 130));

        s2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s2.setText("    2");
        s2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
        });
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 130));

        s3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s3.setText("    3");
        s3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3MouseClicked(evt);
            }
        });
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 130, 130));

        s4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s4.setText("    4");
        s4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s4MouseClicked(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 120));

        s5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s5.setText("    5");
        s5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s5MouseClicked(evt);
            }
        });
        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 120));

        s6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s6.setText("    6");
        s6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s6MouseClicked(evt);
            }
        });
        getContentPane().add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 130, 120));

        s7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s7.setText("    7");
        s7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s7MouseClicked(evt);
            }
        });
        getContentPane().add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, 130));

        s8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s8.setText("    8");
        s8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s8MouseClicked(evt);
            }
        });
        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 120, 130));

        s9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s9.setText("    9");
        s9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        s9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s9MouseClicked(evt);
            }
        });
        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 130, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e797539a1376987930021d2cf4ef74dd5e2ea131.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 410));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_2.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_delete.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseClicked
      
       if(s1.getText().equals("    1"))
        {  
            s1.setText("    X");
            CheckWin(); 
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }      
    }//GEN-LAST:event_s1MouseClicked

    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
              
        if(s2.getText().equals("    2"))
        { 
            s2.setText("    X");   
            CheckWin(); 
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s2MouseClicked

    private void s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3MouseClicked
              
        if(s3.getText().equals("    3"))
        {
            s3.setText("    X");
            CheckWin();
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s3MouseClicked

    private void s4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s4MouseClicked
              
        if(s4.getText().equals("    4"))
        {
            s4.setText("    X");
            CheckWin();
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s4MouseClicked

    private void s5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5MouseClicked
              
        if(s5.getText().equals("    5"))
        {
            s5.setText("    X");           
            CheckWin();
             CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s5MouseClicked

    private void s6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s6MouseClicked
              
       if(s6.getText().equals("    6"))
        {
            s6.setText("    X");
            CheckWin();
             CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s6MouseClicked

    private void s7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7MouseClicked
              
      if(s7.getText().equals("    7"))
        {
            s7.setText("    X");
            CheckWin(); 
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s7MouseClicked

    private void s8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s8MouseClicked
              
        if(s8.getText().equals("    8"))
        {
            s8.setText("    X");            
            CheckWin();
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s8MouseClicked

    private void s9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s9MouseClicked
              
        if(s9.getText().equals("    9"))
        { 
            s9.setText("    X");        
            CheckWin();
            CheckToWin();
        }else
        {
            JOptionPane.showMessageDialog(null, "Invalid Move");
        }
    }//GEN-LAST:event_s9MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        Menu GO = new Menu();
        GO.setVisible(true);   
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(Menu.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnePlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    // End of variables declaration//GEN-END:variables

    private JLabel JLabel(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisisble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}