/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.opencart.test.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "oc_weight_class")
public class OcWeightClass implements Serializable {
    private static final long serialVersionUID = 163436923190114440L;

    /** Description: weight_class_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "weight_class_id")
    private java.lang.Integer weightClassId;

    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value")
    private java.math.BigDecimal value;

    public OcWeightClass() {}

    public java.lang.Integer getWeightClassId() {
        return this.weightClassId;
    }

    public void setWeightClassId(java.lang.Integer weightClassId) {
        this.weightClassId = weightClassId;
    }

    public java.math.BigDecimal getValue() {
        return this.value;
    }

    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }
}
