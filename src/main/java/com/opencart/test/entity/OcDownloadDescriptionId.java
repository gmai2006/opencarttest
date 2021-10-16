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
import javax.persistence.Column;

/** embeddable class Id for OcDownloadDescription. generated on 10/16/2021 from a schema. */
public class OcDownloadDescriptionId implements Serializable {
    private static final long serialVersionUID = 163436923111679755L;

    @Column(name = "language_id")
    private java.lang.Integer languageId;

    @Column(name = "download_id")
    private java.lang.Integer downloadId;

    /** Constructor: OcDownloadDescriptionId. */
    public OcDownloadDescriptionId() {}

    /**
     * Constructor: OcDownloadDescriptionId.
     *
     * @param languageId - languageId.
     * @param downloadId - downloadId.
     */
    public OcDownloadDescriptionId(java.lang.Integer languageId, java.lang.Integer downloadId) {
        this.languageId = languageId;
        this.downloadId = downloadId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.Integer getDownloadId() {
        return this.downloadId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setDownloadId(java.lang.Integer downloadId) {
        this.downloadId = downloadId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());
        result = prime * result + ((downloadId == null) ? 0 : downloadId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcDownloadDescriptionId other = (OcDownloadDescriptionId) obj;

        if (languageId == null) {
            if (other.languageId != null) return false;
        } else if (!languageId.equals(other.languageId)) return false;

        if (downloadId == null) {
            if (other.downloadId != null) return false;
        } else if (!downloadId.equals(other.downloadId)) return false;

        return true;
    }
}
