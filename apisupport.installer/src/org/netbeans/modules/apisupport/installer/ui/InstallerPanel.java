/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.netbeans.modules.apisupport.installer.ui;

/**
 *
 * @author Dmitry Lipin
 * @author Alexei Mokeev
 */
public class InstallerPanel extends javax.swing.JPanel {

    private SuiteInstallerProjectProperties installerProps;

    /** Creates new form InstallerPanel */
    public InstallerPanel(SuiteInstallerProjectProperties props) {
        this.installerProps = props;
        initComponents();

        jCheckBox1.setModel(installerProps.windowsModel);
        jCheckBox2.setModel(installerProps.linuxModel);
        jCheckBox3.setModel(installerProps.macModel);
        jCheckBox4.setModel(installerProps.solarisModel);
        jCheckBox5.setModel(installerProps.pack200Model);
        
        licenseComboBox.setModel(installerProps.licenseModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        licenseLabel = new javax.swing.JLabel();
        licenseComboBox = new javax.swing.JComboBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        pack200Info = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.Platforms.Label")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelWindows")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelLinux")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox3, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelMacOS")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox4, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelSolaris")); // NOI18N

        licenseLabel.setLabelFor(licenseComboBox);
        org.openide.awt.Mnemonics.setLocalizedText(licenseLabel, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.licenseLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox5, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.pack200checkBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(pack200Info, org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.Pack200.Description.Text")); // NOI18N
        pack200Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pack200Info.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4))
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(licenseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(licenseComboBox, 0, 1027, Short.MAX_VALUE)))
                        .addGap(0, 0, 0))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pack200Info, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseLabel)
                    .addComponent(licenseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pack200Info, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );

        jLabel2.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.Platforms.Label")); // NOI18N
        jCheckBox1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelWindows.AccessibleContext.accessible")); // NOI18N
        jCheckBox2.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelLinux.AccessibleContext.accessible")); // NOI18N
        jCheckBox3.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelMacOS.AccessibleContext.accessible")); // NOI18N
        jCheckBox4.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.OSLabelSolaris.AccessibleContext.accessible")); // NOI18N
        licenseComboBox.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.licenseComboBox.AccessibleContext.accessibleName")); // NOI18N
        licenseComboBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.licenseComboBox.AccessibleContext.accessibleDescription")); // NOI18N
        jCheckBox5.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallerPanel.class, "InstallerPanel.jCheckBox5.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox licenseComboBox;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JLabel pack200Info;
    // End of variables declaration//GEN-END:variables

    
}
