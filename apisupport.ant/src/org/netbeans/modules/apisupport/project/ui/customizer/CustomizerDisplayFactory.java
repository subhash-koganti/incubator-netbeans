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

package org.netbeans.modules.apisupport.project.ui.customizer;

import javax.swing.JComponent;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

/**
 *
 * @author mkleint
 */
@ProjectCustomizer.CompositeCategoryProvider.Registration(
    projectType="org-netbeans-modules-apisupport-project",
    position=300
)
public class CustomizerDisplayFactory implements ProjectCustomizer.CompositeCategoryProvider {
    
    public ProjectCustomizer.Category createCategory(Lookup context) {
        return ProjectCustomizer.Category.create(
                CustomizerProviderImpl.CATEGORY_DISPLAY, 
                NbBundle.getMessage(CustomizerDisplayFactory.class, "LBL_ConfigDisplay"),
                null);
    }

    public JComponent createComponent(ProjectCustomizer.Category category, Lookup context) {
        SingleModuleProperties props = context.lookup(SingleModuleProperties.class);
        assert props != null;
        return new CustomizerDisplay(props, category);
    }


}
