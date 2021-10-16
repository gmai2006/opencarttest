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
@Table(name = "oc_product")
public class OcProduct implements Serializable {
    private static final long serialVersionUID = 163436923153985257L;

    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "product_id")
    private java.lang.Integer productId;

    /** Description: model. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "model", length = 64)
    private java.lang.String model;
    /** Description: sku. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sku", length = 64)
    private java.lang.String sku;
    /** Description: upc. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "upc", length = 12)
    private java.lang.String upc;
    /** Description: ean. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ean", length = 14)
    private java.lang.String ean;
    /** Description: jan. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "jan", length = 13)
    private java.lang.String jan;
    /** Description: isbn. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "isbn", length = 17)
    private java.lang.String isbn;
    /** Description: mpn. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "mpn", length = 64)
    private java.lang.String mpn;
    /** Description: location. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "location", length = 128)
    private java.lang.String location;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: stock_status_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "stock_status_id")
    private java.lang.Integer stockStatusId;
    /** Description: image. */
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: manufacturer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "manufacturer_id")
    private java.lang.Integer manufacturerId;
    /** Description: shipping. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping")
    private java.lang.Boolean shipping;
    /** Description: price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price")
    private java.math.BigDecimal price;
    /** Description: points. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "points")
    private java.lang.Integer points;
    /** Description: tax_class_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tax_class_id")
    private java.lang.Integer taxClassId;
    /** Description: date_available. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_available")
    private java.util.Date dateAvailable;
    /** Description: weight. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "weight")
    private java.math.BigDecimal weight;
    /** Description: weight_class_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "weight_class_id")
    private java.lang.Integer weightClassId;
    /** Description: length. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "length")
    private java.math.BigDecimal length;
    /** Description: width. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "width")
    private java.math.BigDecimal width;
    /** Description: height. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "height")
    private java.math.BigDecimal height;
    /** Description: length_class_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "length_class_id")
    private java.lang.Integer lengthClassId;
    /** Description: subtract. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "subtract")
    private java.lang.Boolean subtract;
    /** Description: minimum. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "minimum")
    private java.lang.Integer minimum;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: viewed. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "viewed")
    private java.lang.Integer viewed;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcProduct() {}

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public java.lang.String getSku() {
        return this.sku;
    }

    public java.lang.String getUpc() {
        return this.upc;
    }

    public java.lang.String getEan() {
        return this.ean;
    }

    public java.lang.String getJan() {
        return this.jan;
    }

    public java.lang.String getIsbn() {
        return this.isbn;
    }

    public java.lang.String getMpn() {
        return this.mpn;
    }

    public java.lang.String getLocation() {
        return this.location;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.lang.Integer getStockStatusId() {
        return this.stockStatusId;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.Integer getManufacturerId() {
        return this.manufacturerId;
    }

    public java.lang.Boolean getShipping() {
        return this.shipping;
    }

    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    public java.lang.Integer getPoints() {
        return this.points;
    }

    public java.lang.Integer getTaxClassId() {
        return this.taxClassId;
    }

    public java.util.Date getDateAvailable() {
        return this.dateAvailable;
    }

    public java.math.BigDecimal getWeight() {
        return this.weight;
    }

    public java.lang.Integer getWeightClassId() {
        return this.weightClassId;
    }

    public java.math.BigDecimal getLength() {
        return this.length;
    }

    public java.math.BigDecimal getWidth() {
        return this.width;
    }

    public java.math.BigDecimal getHeight() {
        return this.height;
    }

    public java.lang.Integer getLengthClassId() {
        return this.lengthClassId;
    }

    public java.lang.Boolean getSubtract() {
        return this.subtract;
    }

    public java.lang.Integer getMinimum() {
        return this.minimum;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.lang.Integer getViewed() {
        return this.viewed;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public void setSku(java.lang.String sku) {
        this.sku = sku;
    }

    public void setUpc(java.lang.String upc) {
        this.upc = upc;
    }

    public void setEan(java.lang.String ean) {
        this.ean = ean;
    }

    public void setJan(java.lang.String jan) {
        this.jan = jan;
    }

    public void setIsbn(java.lang.String isbn) {
        this.isbn = isbn;
    }

    public void setMpn(java.lang.String mpn) {
        this.mpn = mpn;
    }

    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setStockStatusId(java.lang.Integer stockStatusId) {
        this.stockStatusId = stockStatusId;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setManufacturerId(java.lang.Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public void setShipping(java.lang.Boolean shipping) {
        this.shipping = shipping;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public void setPoints(java.lang.Integer points) {
        this.points = points;
    }

    public void setTaxClassId(java.lang.Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public void setDateAvailable(java.util.Date dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public void setWeight(java.math.BigDecimal weight) {
        this.weight = weight;
    }

    public void setWeightClassId(java.lang.Integer weightClassId) {
        this.weightClassId = weightClassId;
    }

    public void setLength(java.math.BigDecimal length) {
        this.length = length;
    }

    public void setWidth(java.math.BigDecimal width) {
        this.width = width;
    }

    public void setHeight(java.math.BigDecimal height) {
        this.height = height;
    }

    public void setLengthClassId(java.lang.Integer lengthClassId) {
        this.lengthClassId = lengthClassId;
    }

    public void setSubtract(java.lang.Boolean subtract) {
        this.subtract = subtract;
    }

    public void setMinimum(java.lang.Integer minimum) {
        this.minimum = minimum;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setViewed(java.lang.Integer viewed) {
        this.viewed = viewed;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
