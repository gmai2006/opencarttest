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
@Table(name = "oc_user")
public class OcUser implements Serializable {
    private static final long serialVersionUID = 163436923185881251L;

    /** Description: user_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "user_id")
    private java.lang.Integer userId;

    /** Description: user_group_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "user_group_id")
    private java.lang.Integer userGroupId;
    /** Description: username. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "username", length = 20)
    private java.lang.String username;
    /** Description: password. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "password", length = 40)
    private java.lang.String password;
    /** Description: salt. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "salt", length = 9)
    private java.lang.String salt;
    /** Description: firstname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "firstname", length = 32)
    private java.lang.String firstname;
    /** Description: lastname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "lastname", length = 32)
    private java.lang.String lastname;
    /** Description: email. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "email", length = 96)
    private java.lang.String email;
    /** Description: image. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 40)
    private java.lang.String code;
    /** Description: ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ip", length = 40)
    private java.lang.String ip;
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

    public OcUser() {}

    public java.lang.Integer getUserId() {
        return this.userId;
    }

    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    public java.lang.Integer getUserGroupId() {
        return this.userGroupId;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public java.lang.String getSalt() {
        return this.salt;
    }

    public java.lang.String getFirstname() {
        return this.firstname;
    }

    public java.lang.String getLastname() {
        return this.lastname;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setUserGroupId(java.lang.Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public void setSalt(java.lang.String salt) {
        this.salt = salt;
    }

    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
