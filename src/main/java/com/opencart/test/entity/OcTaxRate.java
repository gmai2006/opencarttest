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
@Table(name = "oc_tax_rate")
public class OcTaxRate implements Serializable {
    private static final long serialVersionUID = 163436923181394892L;

    /** Description: tax_rate_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "tax_rate_id")
    private java.lang.Integer taxRateId;

    /** Description: geo_zone_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "geo_zone_id")
    private java.lang.Integer geoZoneId;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 32)
    private java.lang.String name;
    /** Description: rate. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "rate")
    private java.math.BigDecimal rate;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 1)
    private java.lang.String type;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcTaxRate() {}

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }

    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public java.lang.Integer getGeoZoneId() {
        return this.geoZoneId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.math.BigDecimal getRate() {
        return this.rate;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setGeoZoneId(java.lang.Integer geoZoneId) {
        this.geoZoneId = geoZoneId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
