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
@Table(name = "oc_information")
public class OcInformation implements Serializable {
    private static final long serialVersionUID = 16343692311768548L;

    /** Description: information_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "information_id")
    private java.lang.Integer informationId;

    /** Description: bottom. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bottom")
    private java.lang.Integer bottom;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;

    public OcInformation() {}

    public java.lang.Integer getInformationId() {
        return this.informationId;
    }

    public void setInformationId(java.lang.Integer informationId) {
        this.informationId = informationId;
    }

    public java.lang.Integer getBottom() {
        return this.bottom;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public void setBottom(java.lang.Integer bottom) {
        this.bottom = bottom;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }
}
