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
@Table(name = "oc_setting")
public class OcSetting implements Serializable {
    private static final long serialVersionUID = 163436923178557915L;

    /** Description: setting_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "setting_id")
    private java.lang.Integer settingId;

    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 32)
    private java.lang.String code;
    /** Description: key. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "key", length = 64)
    private java.lang.String key;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value", length = 65535)
    private java.lang.String value;
    /** Description: serialized. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "serialized")
    private java.lang.Boolean serialized;

    public OcSetting() {}

    public java.lang.Integer getSettingId() {
        return this.settingId;
    }

    public void setSettingId(java.lang.Integer settingId) {
        this.settingId = settingId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getKey() {
        return this.key;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.Boolean getSerialized() {
        return this.serialized;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public void setSerialized(java.lang.Boolean serialized) {
        this.serialized = serialized;
    }
}
