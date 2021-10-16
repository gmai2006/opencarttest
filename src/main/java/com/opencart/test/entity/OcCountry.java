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
@Table(name = "oc_country")
public class OcCountry implements Serializable {
    private static final long serialVersionUID = 163436923092072333L;

    /** Description: country_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "country_id")
    private java.lang.Integer countryId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 128)
    private java.lang.String name;
    /** Description: iso_code_2. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "iso_code_2", length = 2)
    private java.lang.String isoCode2;
    /** Description: iso_code_3. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "iso_code_3", length = 3)
    private java.lang.String isoCode3;
    /** Description: address_format. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "address_format", length = 65535)
    private java.lang.String addressFormat;
    /** Description: postcode_required. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "postcode_required")
    private java.lang.Boolean postcodeRequired;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;

    public OcCountry() {}

    public java.lang.Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(java.lang.Integer countryId) {
        this.countryId = countryId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getIsoCode2() {
        return this.isoCode2;
    }

    public java.lang.String getIsoCode3() {
        return this.isoCode3;
    }

    public java.lang.String getAddressFormat() {
        return this.addressFormat;
    }

    public java.lang.Boolean getPostcodeRequired() {
        return this.postcodeRequired;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setIsoCode2(java.lang.String isoCode2) {
        this.isoCode2 = isoCode2;
    }

    public void setIsoCode3(java.lang.String isoCode3) {
        this.isoCode3 = isoCode3;
    }

    public void setAddressFormat(java.lang.String addressFormat) {
        this.addressFormat = addressFormat;
    }

    public void setPostcodeRequired(java.lang.Boolean postcodeRequired) {
        this.postcodeRequired = postcodeRequired;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }
}
