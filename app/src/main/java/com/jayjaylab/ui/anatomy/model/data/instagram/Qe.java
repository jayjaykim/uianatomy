
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Qe {

    @SerializedName("su")
    @Expose
    private Su su;
    @SerializedName("su_universe")
    @Expose
    private SuUniverse suUniverse;
    @SerializedName("us")
    @Expose
    private Us us;
    @SerializedName("discovery")
    @Expose
    private Discovery discovery;

    /**
     * 
     * @return
     *     The su
     */
    public Su getSu() {
        return su;
    }

    /**
     * 
     * @param su
     *     The su
     */
    public void setSu(Su su) {
        this.su = su;
    }

    /**
     * 
     * @return
     *     The suUniverse
     */
    public SuUniverse getSuUniverse() {
        return suUniverse;
    }

    /**
     * 
     * @param suUniverse
     *     The su_universe
     */
    public void setSuUniverse(SuUniverse suUniverse) {
        this.suUniverse = suUniverse;
    }

    /**
     * 
     * @return
     *     The us
     */
    public Us getUs() {
        return us;
    }

    /**
     * 
     * @param us
     *     The us
     */
    public void setUs(Us us) {
        this.us = us;
    }

    /**
     * 
     * @return
     *     The discovery
     */
    public Discovery getDiscovery() {
        return discovery;
    }

    /**
     * 
     * @param discovery
     *     The discovery
     */
    public void setDiscovery(Discovery discovery) {
        this.discovery = discovery;
    }

}
