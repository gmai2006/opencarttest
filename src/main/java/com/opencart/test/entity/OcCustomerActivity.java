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
@Table(name = "oc_customer_activity")
public class OcCustomerActivity implements Serializable {
    private static final long serialVersionUID = 16343692310323883L;

    /** Description: customer_activity_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "customer_activity_id")
    private java.lang.Integer customerActivityId;

    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: key. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "key", length = 64)
    private java.lang.String key;
    /** Description: data. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "data", length = 65535)
    private java.lang.String data;
    /** Description: ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ip", length = 40)
    private java.lang.String ip;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCustomerActivity() {}

    public java.lang.Integer getCustomerActivityId() {
        return this.customerActivityId;
    }

    public void setCustomerActivityId(java.lang.Integer customerActivityId) {
        this.customerActivityId = customerActivityId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.String getKey() {
        return this.key;
    }

    public java.lang.String getData() {
        return this.data;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }

    public void setData(java.lang.String data) {
        this.data = data;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
