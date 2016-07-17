
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Discovery {

    @SerializedName("p")
    @Expose
    private P___ p;
    @SerializedName("g")
    @Expose
    private String g;

    /**
     * 
     * @return
     *     The p
     */
    public P___ getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The p
     */
    public void setP(P___ p) {
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
