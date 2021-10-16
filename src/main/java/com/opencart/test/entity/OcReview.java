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
@Table(name = "oc_review")
public class OcReview implements Serializable {
    private static final long serialVersionUID = 16343692317773873L;

    /** Description: review_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "review_id")
    private java.lang.Integer reviewId;

    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: author. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "author", length = 64)
    private java.lang.String author;
    /** Description: text. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "text", length = 65535)
    private java.lang.String text;
    /** Description: rating. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "rating")
    private java.lang.Integer rating;
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
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcReview() {}

    public java.lang.Integer getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(java.lang.Integer reviewId) {
        this.reviewId = reviewId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.String getAuthor() {
        return this.author;
    }

    public java.lang.String getText() {
        return this.text;
    }

    public java.lang.Integer getRating() {
        return this.rating;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public void setText(java.lang.String text) {
        this.text = text;
    }

    public void setRating(java.lang.Integer rating) {
        this.rating = rating;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
