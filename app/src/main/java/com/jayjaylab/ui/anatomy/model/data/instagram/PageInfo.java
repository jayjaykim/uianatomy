
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PageInfo {

    @SerializedName("has_previous_page")
    @Expose
    private boolean hasPreviousPage;
    @SerializedName("start_cursor")
    @Expose
    private String startCursor;
    @SerializedName("end_cursor")
    @Expose
    private String endCursor;
    @SerializedName("has_next_page")
    @Expose
    private boolean hasNextPage;

    /**
     * 
     * @return
     *     The hasPreviousPage
     */
    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    /**
     * 
     * @param hasPreviousPage
     *     The has_previous_page
     */
    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    /**
     * 
     * @return
     *     The startCursor
     */
    public String getStartCursor() {
        return startCursor;
    }

    /**
     * 
     * @param startCursor
     *     The start_cursor
     */
    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    /**
     * 
     * @return
     *     The endCursor
     */
    public String getEndCursor() {
        return endCursor;
    }

    /**
     * 
     * @param endCursor
     *     The end_cursor
     */
    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }

    /**
     * 
     * @return
     *     The hasNextPage
     */
    public boolean isHasNextPage() {
        return hasNextPage;
    }

    /**
     * 
     * @param hasNextPage
     *     The has_next_page
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

}
