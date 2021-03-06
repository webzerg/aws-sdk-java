/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that contains zero or more Tag elements.
 */
public class Tags implements Serializable, Cloneable {

    /** A complex type that contains Tag elements */
    private com.amazonaws.internal.SdkInternalList<Tag> items;

    /**
     * A complex type that contains Tag elements
     * 
     * @return A complex type that contains Tag elements
     */

    public java.util.List<Tag> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return items;
    }

    /**
     * A complex type that contains Tag elements
     * 
     * @param items
     *        A complex type that contains Tag elements
     */

    public void setItems(java.util.Collection<Tag> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<Tag>(items);
    }

    /**
     * A complex type that contains Tag elements
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains Tag elements
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tags withItems(Tag... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<Tag>(items.length));
        }
        for (Tag ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * A complex type that contains Tag elements
     * 
     * @param items
     *        A complex type that contains Tag elements
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tags withItems(java.util.Collection<Tag> items) {
        setItems(items);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tags == false)
            return false;
        Tags other = (Tags) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public Tags clone() {
        try {
            return (Tags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
