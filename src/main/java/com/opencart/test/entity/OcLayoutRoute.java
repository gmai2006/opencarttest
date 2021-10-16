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
@Table(name = "oc_layout_route")
public class OcLayoutRoute implements Serializable {
    private static final long serialVersionUID = 163436923123438413L;

    /** Description: layout_route_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "layout_route_id")
    private java.lang.Integer layoutRouteId;

    /** Description: layout_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "layout_id")
    private java.lang.Integer layoutId;
    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: route. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "route", length = 64)
    private java.lang.String route;

    public OcLayoutRoute() {}

    public java.lang.Integer getLayoutRouteId() {
        return this.layoutRouteId;
    }

    public void setLayoutRouteId(java.lang.Integer layoutRouteId) {
        this.layoutRouteId = layoutRouteId;
    }

    public java.lang.Integer getLayoutId() {
        return this.layoutId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.String getRoute() {
        return this.route;
    }

    public void setLayoutId(java.lang.Integer layoutId) {
        this.layoutId = layoutId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setRoute(java.lang.String route) {
        this.route = route;
    }
}
