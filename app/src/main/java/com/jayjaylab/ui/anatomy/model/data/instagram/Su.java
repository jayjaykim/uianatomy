
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Su {

    @SerializedName("p")
    @Expose
    private P p;
    @SerializedName("g")
    @Expose
    private String g;

    /**
     * 
     * @return
     *     The p
     */
    public P getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The p
     */
    public void setP(P p) {
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
