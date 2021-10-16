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
@IdClass(OcCustomerGroupDescriptionId.class)
@Table(name = "oc_customer_group_description")
public class OcCustomerGroupDescription implements Serializable {
    private static final long serialVersionUID = 163436923104967327L;

    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language_id")
    private java.lang.Integer languageId;
    /** Description: customer_group_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 32)
    private java.lang.String name;
    /** Description: description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "description", length = 65535)
    private java.lang.String description;

    public OcCustomerGroupDescription() {}

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }
}
