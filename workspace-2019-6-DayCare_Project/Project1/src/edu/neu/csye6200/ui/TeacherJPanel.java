/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import edu.neu.csye6200.controller.DayCareCompany;
import edu.neu.csye6200.model.ClassRoom;
import edu.neu.csye6200.model.Person;

/**
 *
 * @author hairihan
 */
public class TeacherJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DayCareCompany d;
    /**
     * Creates new form TeacherJPanel
     */
    public TeacherJPanel(DayCareCompany d) {
    	this.d=d;
        initComponents();
    }
    
    public String findClass(int t_id) {
    	//find teacher's class
		String teach = "No class";
		for(ClassRoom c:d.getClassRooms()) {
			for(Person t:c.getTeachers()) {
				if(t.getId()==t_id) {
					return String.valueOf(c.getClassRoomID());
				}
			}
		}
		return "Inactive";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddTeacher = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 153));

        jLabel2.setBackground(new java.awt.Color(51, 0, 153));
        jLabel2.setFont(new java.awt.Font("Snell Roundhand", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Teacher");
        
        

        DefaultTableModel table = new DefaultTableModel();
        String [] colTitles = {"Teacher ID", "Class Number", "Name"};
        table.setColumnCount(colTitles.length);
        table.setColumnIdentifiers(colTitles);
    	for(Person p:d.getTeachers()) {
    		table.addRow(new Object[]{p.getId(),findClass(p.getId()),p.getFirstName()+" "+p.getLastName()});
    	}
    	 jTable1.setModel(table);
 
        jScrollPane1.setViewportView(jTable1);

        btnAddTeacher.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnAddTeacher.setForeground(new java.awt.Color(51, 0, 153));
        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame addTeacherFrame = new JFrame();
				addTeacherFrame.setBounds(0, 0,950,645);
				AddTeacherJPanel addTeacherPanel = new AddTeacherJPanel(d);
				addTeacherPanel.setVisible(true);
				addTeacherFrame.add(addTeacherPanel);
				addTeacherFrame.setVisible(true);
			}
		});

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );
    }// </editor-fold>                        

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
