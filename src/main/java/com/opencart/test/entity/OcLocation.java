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
@Table(name = "oc_location")
public class OcLocation implements Serializable {
    private static final long serialVersionUID = 163436923125647106L;

    /** Description: location_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "location_id")
    private java.lang.Integer locationId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 32)
    private java.lang.String name;
    /** Description: address. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "address", length = 65535)
    private java.lang.String address;
    /** Description: telephone. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "telephone", length = 32)
    private java.lang.String telephone;
    /** Description: fax. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "fax", length = 32)
    private java.lang.String fax;
    /** Description: geocode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "geocode", length = 32)
    private java.lang.String geocode;
    /** Description: image. */
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: open. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "open", length = 65535)
    private java.lang.String open;
    /** Description: comment. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment", length = 65535)
    private java.lang.String comment;

    public OcLocation() {}

    public java.lang.Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(java.lang.Integer locationId) {
        this.locationId = locationId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public java.lang.String getTelephone() {
        return this.telephone;
    }

    public java.lang.String getFax() {
        return this.fax;
    }

    public java.lang.String getGeocode() {
        return this.geocode;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.String getOpen() {
        return this.open;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    public void setGeocode(java.lang.String geocode) {
        this.geocode = geocode;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setOpen(java.lang.String open) {
        this.open = open;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }
}
