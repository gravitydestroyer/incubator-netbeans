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
package org.netbeans.modules.html.editor.refactoring.actions;

import org.netbeans.modules.html.editor.refactoring.HtmlSpecificActionsImplementationFactory;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

/**
 *
 * @author marekfukala
 */
public class ExtractInlinedStyleAction extends HtmlRefactoringGlobalAction {

    public ExtractInlinedStyleAction() {
        super(NbBundle.getMessage(ExtractInlinedStyleAction.class, "MSG_ExtractInlinedStyle"), null); // NOI18N
        putValue("noIconInMenu", Boolean.TRUE); // NOI18N
    }

    @Override
    public void performAction(Lookup context) {
        HtmlSpecificActionsImplementationFactory.doExtractInlineStyle(context);
    }

    @Override
    protected boolean enable(Lookup context) {
        return HtmlSpecificActionsImplementationFactory.canExtractInlineStyle(context);
    }

    @Override
    protected boolean asynchronous() {
        return false; //run in AWT
    }
   
}
