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
@Table(name = "oc_banner_image")
public class OcBannerImage implements Serializable {
    private static final long serialVersionUID = 163436923084033343L;

    /** Description: banner_image_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "banner_image_id")
    private java.lang.Integer bannerImageId;

    /** Description: banner_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "banner_id")
    private java.lang.Integer bannerId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "language_id")
    private java.lang.Integer languageId;
    /** Description: title. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "title", length = 64)
    private java.lang.String title;
    /** Description: link. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "link", length = 255)
    private java.lang.String link;
    /** Description: image. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcBannerImage() {}

    public java.lang.Integer getBannerImageId() {
        return this.bannerImageId;
    }

    public void setBannerImageId(java.lang.Integer bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public java.lang.Integer getBannerId() {
        return this.bannerId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getLink() {
        return this.link;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setBannerId(java.lang.Integer bannerId) {
        this.bannerId = bannerId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setLink(java.lang.String link) {
        this.link = link;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
