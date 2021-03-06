/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionEntreprise;

/**
 *
 * @author p1205670
 */
public class ModifEntreprise extends javax.swing.JDialog {

    /**
     * Creates new form CreationEntreprise
     */
    public ModifEntreprise(java.awt.Frame parent, boolean modal, Entreprise e) {
        super(parent, modal);
        initComponents();
        ModifEntreprise.e=e;
        nomOrigine=e.nom;
        adrOrigine=e.adr;
        telOrigine=e.tel;
        textNoment.setText(e.nom);
        textAdresse.setText(e.adr);
        texttel.setText(e.tel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noment = new javax.swing.JLabel();
        textNoment = new javax.swing.JTextField();
        adresse = new javax.swing.JLabel();
        textAdresse = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        texttel = new javax.swing.JTextField();
        valider = new javax.swing.JButton();
        effacer = new javax.swing.JButton();
        retour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Module de gestion des entreprise");

        noment.setText("Nom entreprise : ");

        adresse.setText("Adresse : ");

        tel.setText("Téléphone : ");

        texttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numTel(evt);
            }
        });

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider(evt);
            }
        });

        effacer.setText("Effacer");
        effacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacer(evt);
            }
        });

        retour.setText("retour");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noment)
                    .addComponent(adresse)
                    .addComponent(tel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(effacer)
                        .addGap(55, 55, 55)
                        .addComponent(retour))
                    .addComponent(textNoment, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(textAdresse)
                    .addComponent(texttel))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noment)
                    .addComponent(textNoment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tel)
                    .addComponent(texttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider)
                    .addComponent(effacer)
                    .addComponent(retour))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valider(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider
        e.setAdr(textAdresse.getText());
        e.setNom(textNoment.getText());
        e.setTel(texttel.getText());
                
        setVisible(false);    }//GEN-LAST:event_valider

    private void effacer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacer
        textNoment.setText("");
        textAdresse.setText("");
        texttel.setText("");
    }//GEN-LAST:event_effacer

    private void retour(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retour
        e.setAdr(adrOrigine);
        e.setNom(nomOrigine);
        e.setTel(telOrigine);
                
        setVisible(false);
    }//GEN-LAST:event_retour

    private void numTel(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTel
        Character c =evt.getKeyChar();
        
        if (!(Character.isDigit(c))) {
           evt.consume();
        }
    }//GEN-LAST:event_numTel


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JButton effacer;
    private javax.swing.JLabel noment;
    private javax.swing.JButton retour;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField textAdresse;
    private javax.swing.JTextField textNoment;
    private javax.swing.JTextField texttel;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
    String nomOrigine;
    String adrOrigine;
    String telOrigine;
    static Entreprise e;
}
