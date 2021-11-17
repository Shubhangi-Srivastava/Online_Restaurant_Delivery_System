/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.PersonDetails;
import model.PersonDirectory;

/**
 *
 * @author shubhangisrivastava
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

     PersonDirectory history;
    /**
     * Creates new form CreateJPanel
     */
    public CreatePersonJPanel(PersonDirectory history) {
        initComponents();
        this.history=history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnCreate = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        lblPersonName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtFemale = new java.awt.Checkbox();
        txtMale = new java.awt.Checkbox();
        txtOther = new java.awt.Checkbox();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Person Details");

        btnCreate.setLabel("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblPersonName.setText("Person Name:");

        txtPersonName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPersonNameKeyReleased(evt);
            }
        });

        lblAge.setText("Age:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        lblGender.setText("Gender:");

        txtFemale.setLabel("Female");
        txtFemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFemaleMouseClicked(evt);
            }
        });

        txtMale.setLabel("Male");
        txtMale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaleMouseClicked(evt);
            }
        });

        txtOther.setLabel("Other");
        txtOther.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOtherMouseClicked(evt);
            }
        });

        lblAddress.setText("Address:");

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        lblCommunity.setText("Community:");

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        lblCity.setText("City:");

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(txtCity))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(txtCommunity))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(txtFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMale, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtPersonName))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAge))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblGender))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblAddress))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblCommunity)
                        .addGap(6, 6, 6))
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCity)
                        .addGap(12, 12, 12))
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
// public void btnCreateDisability() {    
//
//         int personName = txtPersonName.getDocument().getLength();
//         int Age = txtAge.getDocument().getLength();
//         int Addr = txtAddress.getDocument().getLength();
//         int community = txtCommunity.getDocument().getLength();
//         int city = txtCity.getDocument().getLength();
//         
//         if(personName == 0 || Age == 0 || Addr == 0 || community ==0 || city == 0 ) {
//             
//             btnCreate.setEnabled(false);
//             
//         }
//         if (personName != 0 || Age != 0 || Addr != 0 || community !=0 || city != 0){
//             btnCreate.setEnabled(true);
//         }
// }  

    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
         
        
        String pattern = "[A-Za-z]+";
        String pattern1 = "^100|[1-9]?\\d$";
                
                
        Pattern patt = Pattern.compile(pattern);
        Pattern patt1 = Pattern.compile(pattern1);
        Matcher match = patt.matcher(txtPersonName.getText());
        Matcher match1 =  patt1.matcher(txtAge.getText());
        Matcher match2 = patt.matcher(txtAddress.getText());
        Matcher match3 = patt.matcher(txtCommunity.getText());
        Matcher match4 = patt.matcher(txtCity.getText());
        
        if(!match.matches() || !match1.matches() || !match2.matches() || !match3.matches() || !match4.matches()) {
            
            JOptionPane.showMessageDialog(this, "Please enter valid details.");
        } else {
            
//            if(txtFemale.isEnabled() == true) {
//                txtMale.setEnabled(false);
//                txtOther.setEnabled(false);
//            } else if(txtMale.isEnabled() == true) {
//                txtFemale.setEnabled(false);
//                txtOther.setEnabled(false);
//            } else if(txtOther.isEnabled()==true){
//                txtFemale.setEnabled(false);
//                txtMale.setEnabled(false);
//            }
        String person_name = txtPersonName.getText();
        int age = Integer.parseInt(txtAge.getText().toString());
        boolean female = txtFemale.getState();
        boolean male = txtMale.getState();
        boolean other = txtOther.getState();
        String address = txtAddress.getText();
        String community = txtCommunity.getText();
        String city = txtCity.getText();

        PersonDetails ps = history.addNewPerson();

        ps.setName(person_name);
        ps.setAge(age); 
        if(female == true){
           ps.setGender("Female");
        } else if(male ==true) {
            ps.setGender("Male");
        } else {
            ps.setGender("Other");
        }
        ps.setAddr(address);  
    
        ps.setCommunity(community);
        ps.setCity(city);
        
        JOptionPane.showMessageDialog(this, "New Person Details Added.");
                
        txtPersonName.setText("");
        txtAge.setText("");
        txtFemale.setState(false);
        txtMale.setState(false);
        txtOther.setState(false);
        txtAddress.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        }
      
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPersonNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameKeyReleased
        
//         int personName = txtPersonName.getText().length();
//         if(personName > 0) {
//             btnCreate.setEnabled(true);
//         } else {
//             btnCreate.setEnabled(false);
//         }
 
    }//GEN-LAST:event_txtPersonNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        
//        int age = txtAge.getText().length();
//         if(age > 0) {
//             btnCreate.setEnabled(true);
//         } else {
//             btnCreate.setEnabled(false);
//         }
        
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        
//        int address = txtAddress.getText().length();
//         if(address > 0) {
//             btnCreate.setEnabled(true);
//         } else {
//             btnCreate.setEnabled(false);
//         }   
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
            
//        int community = txtCommunity.getText().length();
//         if(community > 0) {
//             btnCreate.setEnabled(true);
//         } else {
//             btnCreate.setEnabled(false);
//         }  
        
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        
//        int city = txtCity.getText().length();
//         if(city > 0) {
//             btnCreate.setEnabled(true);
//         } else {
//             btnCreate.setEnabled(false);
//         }  
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
       
//        char c= evt.getKeyChar();
//        String age= txtAge.getText();
//        
//        int length = age.length();
//        
//        if(c >= '0' && c <= '9') {
//            
//            if(length<2){
//                  txtAge.setEditable(true); 
//
//            } else {  
//            txtAge.setEditable(false);    
//            }
//        } else {
//                if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
//                    txtAge.setEditable(true);
//                } else {
//            txtAge.setEditable(false); 
//                }
//            }   
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtPersonNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonNameKeyPressed

//         char c= evt.getKeyChar();
//        
//        if(Character.isLetter(c) && !Character.isWhitespace(c) || Character.isISOControl(c)) {
//            
//           txtPersonName.setEditable(true); 
//        } else {
//             txtPersonName.setEditable(false); 
//       }
      

    }//GEN-LAST:event_txtPersonNameKeyPressed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
 
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtFemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFemaleMouseClicked
       if(txtFemale.isEnabled()){
                txtMale.setEnabled(false);
                txtOther.setEnabled(false);
       }
    }//GEN-LAST:event_txtFemaleMouseClicked

    private void txtMaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaleMouseClicked
                  if(txtMale.isEnabled()){
                txtFemale.setEnabled(false);
                txtOther.setEnabled(false);
                  }
    }//GEN-LAST:event_txtMaleMouseClicked

    private void txtOtherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOtherMouseClicked
                if(txtOther.isEnabled()){
                txtFemale.setEnabled(false);
                txtMale.setEnabled(false);
                } 
    }//GEN-LAST:event_txtOtherMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCreate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private java.awt.Checkbox txtFemale;
    private java.awt.Checkbox txtMale;
    private java.awt.Checkbox txtOther;
    private javax.swing.JTextField txtPersonName;
    // End of variables declaration//GEN-END:variables
}