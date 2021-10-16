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
@Table(name = "oc_url_alias")
public class OcUrlAlias implements Serializable {
    private static final long serialVersionUID = 163436923185355640L;

    /** Description: url_alias_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "url_alias_id")
    private java.lang.Integer urlAliasId;

    /** Description: query. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "query", length = 255)
    private java.lang.String query;
    /** Description: keyword. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "keyword", length = 255)
    private java.lang.String keyword;

    public OcUrlAlias() {}

    public java.lang.Integer getUrlAliasId() {
        return this.urlAliasId;
    }

    public void setUrlAliasId(java.lang.Integer urlAliasId) {
        this.urlAliasId = urlAliasId;
    }

    public java.lang.String getQuery() {
        return this.query;
    }

    public java.lang.String getKeyword() {
        return this.keyword;
    }

    public void setQuery(java.lang.String query) {
        this.query = query;
    }

    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }
}
