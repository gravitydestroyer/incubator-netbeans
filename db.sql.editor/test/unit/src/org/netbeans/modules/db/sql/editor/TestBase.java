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

package org.netbeans.modules.db.sql.editor;

import org.netbeans.junit.NbTestCase;
import org.openide.filesystems.Repository;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 * Common ancestor for all test classes.
 *
 * @author Andrei Badea
 */
public class TestBase extends NbTestCase {
    
    static {
        System.setProperty("org.openide.util.Lookup", Lkp.class.getName());
        assertEquals("Unable to set the default lookup!", Lkp.class, Lookup.getDefault().getClass());
        
        ((Lkp)Lookup.getDefault()).setLookups(new Object[] { new RepositoryImpl() });
        assertEquals("The default Repository is not our repository!", RepositoryImpl.class, Lookup.getDefault().lookup(Repository.class).getClass());
    }
    
    public TestBase(String name) {
        super(name);
    }
    
    public static final class Lkp extends ProxyLookup {
        public Lkp() {
            setLookups(new Object[0]);
        }
        
        void setLookups(Object[] instances) {
            ClassLoader l = TestBase.class.getClassLoader();
            setLookups(new Lookup[] {
                Lookups.metaInfServices(l),
                Lookups.singleton(l),
                Lookups.fixed(instances),
            });
        }
    }
}
