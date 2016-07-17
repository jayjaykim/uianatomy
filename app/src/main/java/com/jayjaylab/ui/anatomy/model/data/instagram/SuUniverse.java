
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SuUniverse {

    @SerializedName("p")
    @Expose
    private P_ p;
    @SerializedName("g")
    @Expose
    private String g;

    /**
     * 
     * @return
     *     The p
     */
    public P_ getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The p
     */
    public void setP(P_ p) {
        this.p = p;
    }

    /**
     * 
     * @return
     *     The g
     */
    public String getG() {
        return g;
    }

    /**
     * 
     * @param g
     *     The g
     */
    public void setG(String g) {
        this.g = g;
    }

}
