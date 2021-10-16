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
@Table(name = "oc_api_session")
public class OcApiSession implements Serializable {
    private static final long serialVersionUID = 163436923079292755L;

    /** Description: api_session_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "api_session_id")
    private java.lang.Integer apiSessionId;

    /** Description: api_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "api_id")
    private java.lang.Integer apiId;
    /** Description: token. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "token", length = 32)
    private java.lang.String token;
    /** Description: session_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "session_id", length = 32)
    private java.lang.String sessionId;
    /** Description: session_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "session_name", length = 32)
    private java.lang.String sessionName;
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
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcApiSession() {}

    public java.lang.Integer getApiSessionId() {
        return this.apiSessionId;
    }

    public void setApiSessionId(java.lang.Integer apiSessionId) {
        this.apiSessionId = apiSessionId;
    }

    public java.lang.Integer getApiId() {
        return this.apiId;
    }

    public java.lang.String getToken() {
        return this.token;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.lang.String getSessionName() {
        return this.sessionName;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setApiId(java.lang.Integer apiId) {
        this.apiId = apiId;
    }

    public void setToken(java.lang.String token) {
        this.token = token;
    }

    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public void setSessionName(java.lang.String sessionName) {
        this.sessionName = sessionName;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
