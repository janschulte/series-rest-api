/*
 * Copyright (C) 2013-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public License
 * version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package org.n52.io.response.dataset.quantity;

import org.n52.io.response.dataset.ReferenceValueOutput;

public class QuantityReferenceValueOutput implements ReferenceValueOutput<QuantityValue> {

    private String referenceValueId;

    private String label;

    private QuantityValue lastValue;

    @Override
    public String getReferenceValueId() {
        return referenceValueId;
    }

    @Override
    public void setReferenceValueId(String referenceValueId) {
        this.referenceValueId = referenceValueId;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public QuantityValue getLastValue() {
        return lastValue;
    }

    @Override
    public void setLastValue(QuantityValue lastValue) {
        this.lastValue = lastValue;
    }

}
