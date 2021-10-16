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
@Table(name = "oc_download")
public class OcDownload implements Serializable {
    private static final long serialVersionUID = 163436923111035130L;

    /** Description: download_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "download_id")
    private java.lang.Integer downloadId;

    /** Description: filename. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "filename", length = 160)
    private java.lang.String filename;
    /** Description: mask. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "mask", length = 128)
    private java.lang.String mask;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcDownload() {}

    public java.lang.Integer getDownloadId() {
        return this.downloadId;
    }

    public void setDownloadId(java.lang.Integer downloadId) {
        this.downloadId = downloadId;
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public java.lang.String getMask() {
        return this.mask;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
