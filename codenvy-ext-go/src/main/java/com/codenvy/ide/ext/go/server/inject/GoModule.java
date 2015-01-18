/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.ext.go.server.inject;

import com.codenvy.ide.ext.go.server.project.type.GoProjectTypeDescriptionExtension;
import com.codenvy.ide.ext.go.server.project.type.GoProjectTypeExtension;
import com.codenvy.inject.DynaModule;
import com.google.inject.AbstractModule;

/** @author Vladyslav Zhukovskii */
@DynaModule
public class GoModule extends AbstractModule {
    /** {@inheritDoc} */
    @Override
    protected void configure() {
        bind(GoProjectTypeExtension.class);
        bind(GoProjectTypeDescriptionExtension.class);
    }
}
