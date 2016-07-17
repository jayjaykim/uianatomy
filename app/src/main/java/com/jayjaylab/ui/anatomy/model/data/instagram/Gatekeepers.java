
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Gatekeepers {

    @SerializedName("sulgin")
    @Expose
    private boolean sulgin;

    /**
     * 
     * @return
     *     The sulgin
     */
    public boolean isSulgin() {
        return sulgin;
    }

    /**
     * 
     * @param sulgin
     *     The sulgin
     */
    public void setSulgin(boolean sulgin) {
        this.sulgin = sulgin;
    }

}
