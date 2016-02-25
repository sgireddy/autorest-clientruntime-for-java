/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.models;

import java.util.List;
import java.util.Map;

/**
 * The ResourceCollection model.
 */
public class ResourceCollection {
    /**
     * The productresource property.
     */
    private FlattenedProduct productresource;

    /**
     * The arrayofresources property.
     */
    private List<FlattenedProduct> arrayofresources;

    /**
     * The dictionaryofresources property.
     */
    private Map<String, FlattenedProduct> dictionaryofresources;

    /**
     * Get the productresource value.
     *
     * @return the productresource value
     */
    public FlattenedProduct getProductresource() {
        return this.productresource;
    }

    /**
     * Set the productresource value.
     *
     * @param productresource the productresource value to set
     */
    public void setProductresource(FlattenedProduct productresource) {
        this.productresource = productresource;
    }

    /**
     * Get the arrayofresources value.
     *
     * @return the arrayofresources value
     */
    public List<FlattenedProduct> getArrayofresources() {
        return this.arrayofresources;
    }

    /**
     * Set the arrayofresources value.
     *
     * @param arrayofresources the arrayofresources value to set
     */
    public void setArrayofresources(List<FlattenedProduct> arrayofresources) {
        this.arrayofresources = arrayofresources;
    }

    /**
     * Get the dictionaryofresources value.
     *
     * @return the dictionaryofresources value
     */
    public Map<String, FlattenedProduct> getDictionaryofresources() {
        return this.dictionaryofresources;
    }

    /**
     * Set the dictionaryofresources value.
     *
     * @param dictionaryofresources the dictionaryofresources value to set
     */
    public void setDictionaryofresources(Map<String, FlattenedProduct> dictionaryofresources) {
        this.dictionaryofresources = dictionaryofresources;
    }

}
