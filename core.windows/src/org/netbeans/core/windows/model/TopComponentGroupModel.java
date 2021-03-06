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

package org.netbeans.core.windows.model;


import org.openide.windows.TopComponent;

import java.util.Collection;
import java.util.Set;


/**
 *
 * @author  Peter Zavadsky
 */
interface TopComponentGroupModel {

    public String getName();

    public void open(
            Collection<TopComponent> openedTopComponents, 
            Collection<TopComponent> openedBeforeTopComponents);
    public void close();
    public boolean isOpened();

    public Set<TopComponent> getTopComponents();

    public Set<TopComponent> getOpenedTopComponents();
    public Set<TopComponent> getOpenedBeforeTopComponents();

    public Set<TopComponent> getOpeningTopComponents();
    public Set<TopComponent> getClosingTopComponents();
    
    public boolean addUnloadedTopComponent(String tcID);
    public boolean removeUnloadedTopComponent(String tcID);
    
    public boolean addOpeningTopComponent(TopComponent tc);
    public boolean removeOpeningTopComponent(TopComponent tc);
    
    public boolean addUnloadedOpeningTopComponent(String tcID);
    public boolean removeUnloadedOpeningTopComponent(String tcID);
    
    public boolean addUnloadedClosingTopComponent(String tcID);
    public boolean removeUnloadedClosingTopComponent(String tcID);
    
    // XXX
    public boolean addUnloadedOpenedTopComponent(String tcID);
    
    // XXX>>
    public Set<String> getTopComponentsIDs();
    public Set<String> getOpeningSetIDs();
    public Set<String> getClosingSetIDs();
    public Set<String> getOpenedTopComponentsIDs();
    // XXX<<
}
