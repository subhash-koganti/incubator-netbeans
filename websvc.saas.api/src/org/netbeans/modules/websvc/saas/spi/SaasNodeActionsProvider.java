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

package org.netbeans.modules.websvc.saas.spi;

import javax.swing.Action;
import org.openide.util.Lookup;

/**
 * Provider for additional node actions.
 * 
 * @author nam
 */
public interface SaasNodeActionsProvider {
    public static final Action[] EMPTY_ACTIONS = new Action[0];
    
    /**
     * @param lookup context to query the actions from
     * @return list of consumer-specific actions for SaaS service node
     */
    public Action[] getSaasActions(Lookup lookup);

}
