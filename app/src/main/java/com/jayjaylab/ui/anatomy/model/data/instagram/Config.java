
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Config {

    @SerializedName("viewer")
    @Expose
    private Object viewer;
    @SerializedName("csrf_token")
    @Expose
    private String csrfToken;

    /**
     * 
     * @return
     *     The viewer
     */
    public Object getViewer() {
        return viewer;
    }

    /**
     * 
     * @param viewer
     *     The viewer
     */
    public void setViewer(Object viewer) {
        this.viewer = viewer;
    }

    /**
     * 
     * @return
     *     The csrfToken
     */
    public String getCsrfToken() {
        return csrfToken;
    }

    /**
     * 
     * @param csrfToken
     *     The csrf_token
     */
    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

}
