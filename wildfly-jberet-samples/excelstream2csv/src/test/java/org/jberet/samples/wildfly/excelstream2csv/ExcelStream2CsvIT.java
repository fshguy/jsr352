/*
 * Copyright (c) 2014-2016 Red Hat, Inc. and/or its affiliates.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cheng Fang - Initial API and implementation
 */

package org.jberet.samples.wildfly.excelstream2csv;

import javax.batch.runtime.BatchStatus;

import org.jberet.samples.wildfly.common.BatchTestBase;
import org.junit.Test;

public final class ExcelStream2CsvIT extends BatchTestBase {
    /**
     * Job id and job xml name for job in excelstream2csv.xml
     */
    private static final String jobName = "excelstream2csv";

    @Test
    public void testExcelStream2Csv() throws Exception {
        startJobCheckStatus(jobName, null, 10000, BatchStatus.COMPLETED);
    }

    @Override
    protected String getRestUrl() {
        return BASE_URL + "excelstream2csv/api";
    }
}