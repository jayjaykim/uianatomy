
package com.jayjaylab.ui.anatomy.model.data.instagram;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Media {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("page_info")
    @Expose
    private PageInfo pageInfo;
    @SerializedName("nodes")
    @Expose
    private List<Node> nodes = new ArrayList<Node>();

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * 
     * @param pageInfo
     *     The page_info
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * 
     * @return
     *     The nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * 
     * @param nodes
     *     The nodes
     */
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

}
