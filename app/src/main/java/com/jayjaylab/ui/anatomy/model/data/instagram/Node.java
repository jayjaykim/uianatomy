
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Node {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("date")
    @Expose
    private int date;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("thumbnail_src")
    @Expose
    private String thumbnailSrc;
    @SerializedName("is_video")
    @Expose
    private boolean isVideo;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display_src")
    @Expose
    private String displaySrc;
    @SerializedName("video_views")
    @Expose
    private int videoViews;

    @Override
    public String toString() {
        return "Node{" +
                "code='" + code + '\'' +
                ", date=" + date +
                ", dimensions=" + dimensions +
                ", comments=" + comments +
                ", caption='" + caption + '\'' +
                ", likes=" + likes +
                ", owner=" + owner +
                ", thumbnailSrc='" + thumbnailSrc + '\'' +
                ", isVideo=" + isVideo +
                ", id='" + id + '\'' +
                ", displaySrc='" + displaySrc + '\'' +
                ", videoViews=" + videoViews +
                '}';
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The date
     */
    public int getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * 
     * @param dimensions
     *     The dimensions
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * 
     * @return
     *     The comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The thumbnailSrc
     */
    public String getThumbnailSrc() {
        return thumbnailSrc;
    }

    /**
     * 
     * @param thumbnailSrc
     *     The thumbnail_src
     */
    public void setThumbnailSrc(String thumbnailSrc) {
        this.thumbnailSrc = thumbnailSrc;
    }

    /**
     * 
     * @return
     *     The isVideo
     */
    public boolean isIsVideo() {
        return isVideo;
    }

    /**
     * 
     * @param isVideo
     *     The is_video
     */
    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
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
     *     The displaySrc
     */
    public String getDisplaySrc() {
        return displaySrc;
    }

    /**
     * 
     * @param displaySrc
     *     The display_src
     */
    public void setDisplaySrc(String displaySrc) {
        this.displaySrc = displaySrc;
    }

    /**
     * 
     * @return
     *     The videoViews
     */
    public int getVideoViews() {
        return videoViews;
    }

    /**
     * 
     * @param videoViews
     *     The video_views
     */
    public void setVideoViews(int videoViews) {
        this.videoViews = videoViews;
    }

}
