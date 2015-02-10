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
package com.codenvy.ide.ext.go.server.project.type;

import com.codenvy.api.project.server.type.ProjectType;
import com.codenvy.api.project.shared.Constants;
import com.codenvy.ide.ext.go.shared.ProjectAttributes;

/**
 * @author Vitaly Parfonov
 */
public class GoProjectType extends ProjectType {

    public GoProjectType() {
        super(ProjectAttributes.GO_ID, ProjectAttributes.GO_NAME, true, false);
        addConstantDefinition(Constants.LANGUAGE, "language", ProjectAttributes.PROGRAMMING_LANGUAGE);
    }
}
