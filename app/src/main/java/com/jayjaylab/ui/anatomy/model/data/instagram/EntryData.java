
package com.jayjaylab.ui.anatomy.model.data.instagram;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class EntryData {

    @SerializedName("ProfilePage")
    @Expose
    private List<ProfilePage> profilePage = new ArrayList<ProfilePage>();

    /**
     * 
     * @return
     *     The profilePage
     */
    public List<ProfilePage> getProfilePage() {
        return profilePage;
    }

    /**
     * 
     * @param profilePage
     *     The ProfilePage
     */
    public void setProfilePage(List<ProfilePage> profilePage) {
        this.profilePage = profilePage;
    }

}
