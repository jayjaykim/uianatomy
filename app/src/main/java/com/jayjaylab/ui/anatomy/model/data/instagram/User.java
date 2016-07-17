
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("follows")
    @Expose
    private Follows follows;
    @SerializedName("requested_by_viewer")
    @Expose
    private boolean requestedByViewer;
    @SerializedName("followed_by")
    @Expose
    private FollowedBy followedBy;
    @SerializedName("external_url_linkshimmed")
    @Expose
    private Object externalUrlLinkshimmed;
    @SerializedName("has_requested_viewer")
    @Expose
    private boolean hasRequestedViewer;
    @SerializedName("country_block")
    @Expose
    private Object countryBlock;
    @SerializedName("follows_viewer")
    @Expose
    private boolean followsViewer;
    @SerializedName("profile_pic_url_hd")
    @Expose
    private String profilePicUrlHd;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("biography")
    @Expose
    private Object biography;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("blocked_by_viewer")
    @Expose
    private boolean blockedByViewer;
    @SerializedName("followed_by_viewer")
    @Expose
    private boolean followedByViewer;
    @SerializedName("is_verified")
    @Expose
    private boolean isVerified;
    @SerializedName("has_blocked_viewer")
    @Expose
    private boolean hasBlockedViewer;
    @SerializedName("is_private")
    @Expose
    private boolean isPrivate;
    @SerializedName("external_url")
    @Expose
    private Object externalUrl;

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The follows
     */
    public Follows getFollows() {
        return follows;
    }

    /**
     * 
     * @param follows
     *     The follows
     */
    public void setFollows(Follows follows) {
        this.follows = follows;
    }

    /**
     * 
     * @return
     *     The requestedByViewer
     */
    public boolean isRequestedByViewer() {
        return requestedByViewer;
    }

    /**
     * 
     * @param requestedByViewer
     *     The requested_by_viewer
     */
    public void setRequestedByViewer(boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    /**
     * 
     * @return
     *     The followedBy
     */
    public FollowedBy getFollowedBy() {
        return followedBy;
    }

    /**
     * 
     * @param followedBy
     *     The followed_by
     */
    public void setFollowedBy(FollowedBy followedBy) {
        this.followedBy = followedBy;
    }

    /**
     * 
     * @return
     *     The externalUrlLinkshimmed
     */
    public Object getExternalUrlLinkshimmed() {
        return externalUrlLinkshimmed;
    }

    /**
     * 
     * @param externalUrlLinkshimmed
     *     The external_url_linkshimmed
     */
    public void setExternalUrlLinkshimmed(Object externalUrlLinkshimmed) {
        this.externalUrlLinkshimmed = externalUrlLinkshimmed;
    }

    /**
     * 
     * @return
     *     The hasRequestedViewer
     */
    public boolean isHasRequestedViewer() {
        return hasRequestedViewer;
    }

    /**
     * 
     * @param hasRequestedViewer
     *     The has_requested_viewer
     */
    public void setHasRequestedViewer(boolean hasRequestedViewer) {
        this.hasRequestedViewer = hasRequestedViewer;
    }

    /**
     * 
     * @return
     *     The countryBlock
     */
    public Object getCountryBlock() {
        return countryBlock;
    }

    /**
     * 
     * @param countryBlock
     *     The country_block
     */
    public void setCountryBlock(Object countryBlock) {
        this.countryBlock = countryBlock;
    }

    /**
     * 
     * @return
     *     The followsViewer
     */
    public boolean isFollowsViewer() {
        return followsViewer;
    }

    /**
     * 
     * @param followsViewer
     *     The follows_viewer
     */
    public void setFollowsViewer(boolean followsViewer) {
        this.followsViewer = followsViewer;
    }

    /**
     * 
     * @return
     *     The profilePicUrlHd
     */
    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    /**
     * 
     * @param profilePicUrlHd
     *     The profile_pic_url_hd
     */
    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    /**
     * 
     * @return
     *     The profilePicUrl
     */
    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    /**
     * 
     * @param profilePicUrl
     *     The profile_pic_url
     */
    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The biography
     */
    public Object getBiography() {
        return biography;
    }

    /**
     * 
     * @param biography
     *     The biography
     */
    public void setBiography(Object biography) {
        this.biography = biography;
    }

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The blockedByViewer
     */
    public boolean isBlockedByViewer() {
        return blockedByViewer;
    }

    /**
     * 
     * @param blockedByViewer
     *     The blocked_by_viewer
     */
    public void setBlockedByViewer(boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    /**
     * 
     * @return
     *     The followedByViewer
     */
    public boolean isFollowedByViewer() {
        return followedByViewer;
    }

    /**
     * 
     * @param followedByViewer
     *     The followed_by_viewer
     */
    public void setFollowedByViewer(boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    /**
     * 
     * @return
     *     The isVerified
     */
    public boolean isIsVerified() {
        return isVerified;
    }

    /**
     * 
     * @param isVerified
     *     The is_verified
     */
    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    /**
     * 
     * @return
     *     The hasBlockedViewer
     */
    public boolean isHasBlockedViewer() {
        return hasBlockedViewer;
    }

    /**
     * 
     * @param hasBlockedViewer
     *     The has_blocked_viewer
     */
    public void setHasBlockedViewer(boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    /**
     * 
     * @return
     *     The isPrivate
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * 
     * @param isPrivate
     *     The is_private
     */
    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 
     * @return
     *     The externalUrl
     */
    public Object getExternalUrl() {
        return externalUrl;
    }

    /**
     * 
     * @param externalUrl
     *     The external_url
     */
    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

}
