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
@Table(name = "oc_tax_rule")
public class OcTaxRule implements Serializable {
    private static final long serialVersionUID = 163436923182989659L;

    /** Description: tax_rule_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "tax_rule_id")
    private java.lang.Integer taxRuleId;

    /** Description: tax_class_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tax_class_id")
    private java.lang.Integer taxClassId;
    /** Description: tax_rate_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tax_rate_id")
    private java.lang.Integer taxRateId;
    /** Description: based. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "based", length = 10)
    private java.lang.String based;
    /** Description: priority. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "priority")
    private java.lang.Integer priority;

    public OcTaxRule() {}

    public java.lang.Integer getTaxRuleId() {
        return this.taxRuleId;
    }

    public void setTaxRuleId(java.lang.Integer taxRuleId) {
        this.taxRuleId = taxRuleId;
    }

    public java.lang.Integer getTaxClassId() {
        return this.taxClassId;
    }

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }

    public java.lang.String getBased() {
        return this.based;
    }

    public java.lang.Integer getPriority() {
        return this.priority;
    }

    public void setTaxClassId(java.lang.Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public void setBased(java.lang.String based) {
        this.based = based;
    }

    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }
}
