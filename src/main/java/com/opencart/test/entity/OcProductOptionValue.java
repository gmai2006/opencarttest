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
@Table(name = "oc_product_option_value")
public class OcProductOptionValue implements Serializable {
    private static final long serialVersionUID = 163436923161962811L;

    /** Description: product_option_value_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "product_option_value_id")
    private java.lang.Integer productOptionValueId;

    /** Description: product_option_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_option_id")
    private java.lang.Integer productOptionId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: option_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "option_id")
    private java.lang.Integer optionId;
    /** Description: option_value_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "option_value_id")
    private java.lang.Integer optionValueId;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: subtract. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "subtract")
    private java.lang.Boolean subtract;
    /** Description: price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price")
    private java.math.BigDecimal price;
    /** Description: price_prefix. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price_prefix", length = 1)
    private java.lang.String pricePrefix;
    /** Description: points. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "points")
    private java.lang.Integer points;
    /** Description: points_prefix. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "points_prefix", length = 1)
    private java.lang.String pointsPrefix;
    /** Description: weight. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "weight")
    private java.math.BigDecimal weight;
    /** Description: weight_prefix. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "weight_prefix", length = 1)
    private java.lang.String weightPrefix;

    public OcProductOptionValue() {}

    public java.lang.Integer getProductOptionValueId() {
        return this.productOptionValueId;
    }

    public void setProductOptionValueId(java.lang.Integer productOptionValueId) {
        this.productOptionValueId = productOptionValueId;
    }

    public java.lang.Integer getProductOptionId() {
        return this.productOptionId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getOptionId() {
        return this.optionId;
    }

    public java.lang.Integer getOptionValueId() {
        return this.optionValueId;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.lang.Boolean getSubtract() {
        return this.subtract;
    }

    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    public java.lang.String getPricePrefix() {
        return this.pricePrefix;
    }

    public java.lang.Integer getPoints() {
        return this.points;
    }

    public java.lang.String getPointsPrefix() {
        return this.pointsPrefix;
    }

    public java.math.BigDecimal getWeight() {
        return this.weight;
    }

    public java.lang.String getWeightPrefix() {
        return this.weightPrefix;
    }

    public void setProductOptionId(java.lang.Integer productOptionId) {
        this.productOptionId = productOptionId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setOptionId(java.lang.Integer optionId) {
        this.optionId = optionId;
    }

    public void setOptionValueId(java.lang.Integer optionValueId) {
        this.optionValueId = optionValueId;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setSubtract(java.lang.Boolean subtract) {
        this.subtract = subtract;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public void setPricePrefix(java.lang.String pricePrefix) {
        this.pricePrefix = pricePrefix;
    }

    public void setPoints(java.lang.Integer points) {
        this.points = points;
    }

    public void setPointsPrefix(java.lang.String pointsPrefix) {
        this.pointsPrefix = pointsPrefix;
    }

    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }

    public void setWeightPrefix(java.lang.String weightPrefix) {
        this.weightPrefix = weightPrefix;
    }
}
