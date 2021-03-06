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

package org.netbeans.modules.i18n.java;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import org.netbeans.modules.i18n.PropertyPanel;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbBundle;

/**
 * Property panel for {@code JavaI18nString}'s.
 *
 * @author  Peter Zavadsky
 */
public class JavaPropertyPanel extends PropertyPanel {

    private final ResourceBundle bundle;
    
    /** Creates new form JavaPropertyPanel */
    public JavaPropertyPanel() {
        bundle = NbBundle.getBundle(JavaPropertyPanel.class);
        initComponents();
    }    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {
        argumentsButton.setVisible(true);
        argumentsButton.getAccessibleContext().setAccessibleDescription(
                bundle.getString("ACS_CTL_Arguments"));                 //NOI18N
        argumentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                argumentsButtonActionPerformed(evt);
            }
        }
        );
    }

    /** Action handler for arguments button. */
    private void argumentsButtonActionPerformed(ActionEvent evt) {
        final JavaI18nString javaI18nString = (JavaI18nString)i18nString;
        
        final Dialog[] dialogs = new Dialog[1];
        final ParamsPanel paramsPanel = new ParamsPanel();

        paramsPanel.setArguments(javaI18nString.getArguments());

        DialogDescriptor dd = new DialogDescriptor(
            paramsPanel,
            bundle.getString("CTL_ParamsPanelTitle"), // NOI18N
            true,
            DialogDescriptor.OK_CANCEL_OPTION,
            DialogDescriptor.OK_OPTION,
            new ActionListener() {
                public void actionPerformed(ActionEvent ev) {
                    if (ev.getSource() == DialogDescriptor.OK_OPTION) {
                        javaI18nString.setArguments(paramsPanel.getArguments());
                        updateReplaceText();
                        
                        dialogs[0].setVisible(false);
                        dialogs[0].dispose();
                    } else {
                        dialogs[0].setVisible(false);
                        dialogs[0].dispose();
                    }
                }
           });
        dialogs[0] = DialogDisplayer.getDefault().createDialog(dd);
        dialogs[0].setVisible(true);
    }

    /** Overrides superclass method. */
    @Override
    protected void updateReplaceText() {
        super.updateReplaceText();
        
        argumentsButton.setEnabled(
                i18nString.getReplaceFormat().indexOf("{arguments}") >= 0 ); // NOI18N
    }

}
