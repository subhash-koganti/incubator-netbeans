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
package org.netbeans.modules.java.hints;

import org.junit.Test;
import org.netbeans.junit.NbTestCase;
import org.netbeans.modules.java.hints.test.api.HintTest;
import org.openide.util.NbBundle;

/**
 *
 * @author Jan Jancura
 */
public class ThreadDumpStackTest extends NbTestCase {

    public ThreadDumpStackTest(String name) {
        super(name);
    }

    @Test
    public void test1() throws Exception {
        HintTest
                .create()
                .input("package test;\n" +
                       "class Test {\n" +
                       "    void test () {\n" +
                       "        Thread.dumpStack ();\n" +
                       "    }\n" +
                       "}")
                .run(ThreadDumpStack.class)
                .findWarning("3:15-3:24:verifier:Thread Dump Stack")
                .applyFix("MSG_ThreadDumpStack_fix")
                .assertCompilable()
                .assertOutput(
                "package test;\n" +
                "class Test {\n" +
                "    void test () {\n" +
                "    }\n" +
                "}");
    }

    @Test
    public void test207244() throws Exception {
        HintTest
                .create()
                .input("package test;\n" +
                       "class Test {\n" +
                       "    void test (Thread t) {\n" +
                       "        t.dumpStack ();\n" +
                       "    }\n" +
                       "}")
                .run(ThreadDumpStack.class)
                .findWarning("3:10-3:19:verifier:Thread Dump Stack")
                .applyFix("MSG_ThreadDumpStack_fix")
                .assertCompilable()
                .assertOutput(
                "package test;\n" +
                "class Test {\n" +
                "    void test (Thread t) {\n" +
                "    }\n" +
                "}");
    }

}