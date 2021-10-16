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
@Table(name = "oc_event")
public class OcEvent implements Serializable {
    private static final long serialVersionUID = 163436923112678558L;

    /** Description: event_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "event_id")
    private java.lang.Integer eventId;

    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 32)
    private java.lang.String code;
    /** Description: trigger. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trigger", length = 65535)
    private java.lang.String trigger;
    /** Description: action. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "action", length = 65535)
    private java.lang.String action;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcEvent() {}

    public java.lang.Integer getEventId() {
        return this.eventId;
    }

    public void setEventId(java.lang.Integer eventId) {
        this.eventId = eventId;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getTrigger() {
        return this.trigger;
    }

    public java.lang.String getAction() {
        return this.action;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }

    public void setAction(java.lang.String action) {
        this.action = action;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
