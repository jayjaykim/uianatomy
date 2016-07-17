
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DisplayPropertiesServerGuess {

    @SerializedName("viewport_width")
    @Expose
    private int viewportWidth;
    @SerializedName("pixel_ratio")
    @Expose
    private float pixelRatio;

    /**
     * 
     * @return
     *     The viewportWidth
     */
    public int getViewportWidth() {
        return viewportWidth;
    }

    /**
     * 
     * @param viewportWidth
     *     The viewport_width
     */
    public void setViewportWidth(int viewportWidth) {
        this.viewportWidth = viewportWidth;
    }

    /**
     * 
     * @return
     *     The pixelRatio
     */
    public float getPixelRatio() {
        return pixelRatio;
    }

    /**
     * 
     * @param pixelRatio
     *     The pixel_ratio
     */
    public void setPixelRatio(float pixelRatio) {
        this.pixelRatio = pixelRatio;
    }

}
