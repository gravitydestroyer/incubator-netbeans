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
package org.netbeans.api.search.provider.impl;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.netbeans.api.search.SearchRoot;
import org.netbeans.api.search.SearchScopeOptions;
import org.netbeans.api.search.provider.SearchInfo;
import org.netbeans.api.search.provider.SearchListener;
import org.netbeans.spi.search.SearchInfoDefinition;
import org.openide.filesystems.FileObject;

/**
 *
 * @author jhavlin
 */
public class DelegatingSearchInfo extends SearchInfo {

    private SearchInfoDefinition delegate;

    public DelegatingSearchInfo(SearchInfoDefinition delegate) {
        this.delegate = delegate;
    }

    @Override
    public List<SearchRoot> getSearchRoots() {
        return delegate.getSearchRoots();
    }

    @Override
    public Iterator<FileObject> createFilesToSearchIterator(
            SearchScopeOptions options, SearchListener listener,
            AtomicBoolean terminated) {
        return delegate.filesToSearch(options, listener, terminated);
    }

    @Override
    protected Iterator<URI> createUrisToSearchIterator(
            SearchScopeOptions options, SearchListener listener,
            AtomicBoolean terminated) {
        return delegate.urisToSearch(options, listener, terminated);
    }

    @Override
    public boolean canSearch() {
        return delegate.canSearch();
    }
}
