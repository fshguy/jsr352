/*
 * Copyright (c) 2013 Red Hat, Inc. and/or its affiliates.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.jberet.job.model;

/**
 * Corresponds to {@code jsl:Decision} job XML element type.
 */
public final class Decision extends AbstractJobElement implements PropertiesHolder {
    private static final long serialVersionUID = -7022222093403964947L;

    private String ref;

    /**
     * Constructs a decision with its {@code id} and ref name for the associated decider.
     *
     * @param id decision id
     * @param ref decider ref name
     */
    Decision(final String id, final String ref) {
        super(id);
        this.ref = ref;
    }

    /**
     * Gets the ref name for the associated decider.
     *
     * @return decider ref name
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the ref name for the associated decider.
     *
     * @param ref decider ref name
     */
    void setRef(final String ref) {
        this.ref = ref;
    }
}
