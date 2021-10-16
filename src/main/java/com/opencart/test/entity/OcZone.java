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
@Table(name = "oc_zone")
public class OcZone implements Serializable {
    private static final long serialVersionUID = 163436923191684448L;

    /** Description: zone_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "zone_id")
    private java.lang.Integer zoneId;

    /** Description: country_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "country_id")
    private java.lang.Integer countryId;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 128)
    private java.lang.String name;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 32)
    private java.lang.String code;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;

    public OcZone() {}

    public java.lang.Integer getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(java.lang.Integer zoneId) {
        this.zoneId = zoneId;
    }

    public java.lang.Integer getCountryId() {
        return this.countryId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public void setCountryId(java.lang.Integer countryId) {
        this.countryId = countryId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }
}
