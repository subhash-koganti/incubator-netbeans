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

package org.netbeans.api.debugger.providers;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.netbeans.spi.debugger.ui.BreakpointType;

/**
 *
 * @author Martin Entlicher
 */
@BreakpointType.Registration(displayName="Test")
public class TestBreakpointType extends BreakpointType {

    public static Object ACTION_OBJECT = new Object();

    public static Set<TestBreakpointType> INSTANCES = new HashSet<TestBreakpointType>();

    public TestBreakpointType() {
        INSTANCES.add(this);
    }

    @Override
    public JComponent getCustomizer() {
        return new JPanel();
    }

    @Override
    public String getCategoryDisplayName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDefault() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @BreakpointType.Registration(displayName="Test2")
    public static BreakpointType getTest2BreakpointType() {
        return new BreakpointType() {

            @Override
            public String getCategoryDisplayName() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public JComponent getCustomizer() {
                return new JPanel();
            }

            @Override
            public boolean isDefault() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }

}
