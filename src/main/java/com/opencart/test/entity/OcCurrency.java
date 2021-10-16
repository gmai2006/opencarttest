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
@Table(name = "oc_currency")
public class OcCurrency implements Serializable {
    private static final long serialVersionUID = 163436923096049173L;

    /** Description: currency_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "currency_id")
    private java.lang.Integer currencyId;

    /** Description: title. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "title", length = 32)
    private java.lang.String title;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 3)
    private java.lang.String code;
    /** Description: symbol_left. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "symbol_left", length = 12)
    private java.lang.String symbolLeft;
    /** Description: symbol_right. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "symbol_right", length = 12)
    private java.lang.String symbolRight;
    /** Description: decimal_place. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "decimal_place", length = 1)
    private java.lang.String decimalPlace;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value")
    private java.lang.Float value;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcCurrency() {}

    public java.lang.Integer getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(java.lang.Integer currencyId) {
        this.currencyId = currencyId;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getSymbolLeft() {
        return this.symbolLeft;
    }

    public java.lang.String getSymbolRight() {
        return this.symbolRight;
    }

    public java.lang.String getDecimalPlace() {
        return this.decimalPlace;
    }

    public java.lang.Float getValue() {
        return this.value;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setSymbolLeft(java.lang.String symbolLeft) {
        this.symbolLeft = symbolLeft;
    }

    public void setSymbolRight(java.lang.String symbolRight) {
        this.symbolRight = symbolRight;
    }

    public void setDecimalPlace(java.lang.String decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public void setValue(java.lang.Float value) {
        this.value = value;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
