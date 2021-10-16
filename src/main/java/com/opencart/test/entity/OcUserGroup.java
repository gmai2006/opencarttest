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
@Table(name = "oc_user_group")
public class OcUserGroup implements Serializable {
    private static final long serialVersionUID = 163436923186882389L;

    /** Description: user_group_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "user_group_id")
    private java.lang.Integer userGroupId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 64)
    private java.lang.String name;
    /** Description: permission. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "permission", length = 65535)
    private java.lang.String permission;

    public OcUserGroup() {}

    public java.lang.Integer getUserGroupId() {
        return this.userGroupId;
    }

    public void setUserGroupId(java.lang.Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getPermission() {
        return this.permission;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setPermission(java.lang.String permission) {
        this.permission = permission;
    }
}