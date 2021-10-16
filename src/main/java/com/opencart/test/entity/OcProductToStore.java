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
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OcProductToStoreId.class)
@Table(name = "oc_product_to_store")
public class OcProductToStore implements Serializable {
    private static final long serialVersionUID = 163436923170055728L;

    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "product_id")
    private java.lang.Integer productId;

    public OcProductToStore() {}

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }
}
