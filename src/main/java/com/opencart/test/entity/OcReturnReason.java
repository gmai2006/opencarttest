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
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OcReturnReasonId.class)
@Table(name = "oc_return_reason")
public class OcReturnReason implements Serializable {
    private static final long serialVersionUID = 163436923176192361L;

    /** Description: return_reason_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "return_reason_id")
    private java.lang.Integer returnReasonId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 128)
    private java.lang.String name;

    public OcReturnReason() {}

    public java.lang.Integer getReturnReasonId() {
        return this.returnReasonId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setReturnReasonId(java.lang.Integer returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
