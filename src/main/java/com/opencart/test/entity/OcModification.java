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
@Table(name = "oc_modification")
public class OcModification implements Serializable {
    private static final long serialVersionUID = 163436923132633759L;

    /** Description: modification_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "modification_id")
    private java.lang.Integer modificationId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 64)
    private java.lang.String name;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 64)
    private java.lang.String code;
    /** Description: author. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "author", length = 64)
    private java.lang.String author;
    /** Description: version. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "version", length = 32)
    private java.lang.String version;
    /** Description: link. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "link", length = 255)
    private java.lang.String link;
    /** Description: xml. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "xml", length = 16777215)
    private java.lang.String xml;
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

    public OcModification() {}

    public java.lang.Integer getModificationId() {
        return this.modificationId;
    }

    public void setModificationId(java.lang.Integer modificationId) {
        this.modificationId = modificationId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getAuthor() {
        return this.author;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public java.lang.String getLink() {
        return this.link;
    }

    public java.lang.String getXml() {
        return this.xml;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    public void setLink(java.lang.String link) {
        this.link = link;
    }

    public void setXml(java.lang.String xml) {
        this.xml = xml;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
