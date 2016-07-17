
package com.jayjaylab.ui.anatomy.model.data.instagram;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Entries {

    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("language_code")
    @Expose
    private String languageCode;
    @SerializedName("gatekeepers")
    @Expose
    private Gatekeepers gatekeepers;
    @SerializedName("qs")
    @Expose
    private String qs;
    @SerializedName("show_app_install")
    @Expose
    private boolean showAppInstall;
    @SerializedName("static_root")
    @Expose
    private String staticRoot;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("entry_data")
    @Expose
    private EntryData entryData;
    @SerializedName("qe")
    @Expose
    private Qe qe;
    @SerializedName("display_properties_server_guess")
    @Expose
    private DisplayPropertiesServerGuess displayPropertiesServerGuess;
    @SerializedName("config")
    @Expose
    private Config config;
    @SerializedName("environment_switcher_visible_server_guess")
    @Expose
    private boolean environmentSwitcherVisibleServerGuess;

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 
     * @param languageCode
     *     The language_code
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * 
     * @return
     *     The gatekeepers
     */
    public Gatekeepers getGatekeepers() {
        return gatekeepers;
    }

    /**
     * 
     * @param gatekeepers
     *     The gatekeepers
     */
    public void setGatekeepers(Gatekeepers gatekeepers) {
        this.gatekeepers = gatekeepers;
    }

    /**
     * 
     * @return
     *     The qs
     */
    public String getQs() {
        return qs;
    }

    /**
     * 
     * @param qs
     *     The qs
     */
    public void setQs(String qs) {
        this.qs = qs;
    }

    /**
     * 
     * @return
     *     The showAppInstall
     */
    public boolean isShowAppInstall() {
        return showAppInstall;
    }

    /**
     * 
     * @param showAppInstall
     *     The show_app_install
     */
    public void setShowAppInstall(boolean showAppInstall) {
        this.showAppInstall = showAppInstall;
    }

    /**
     * 
     * @return
     *     The staticRoot
     */
    public String getStaticRoot() {
        return staticRoot;
    }

    /**
     * 
     * @param staticRoot
     *     The static_root
     */
    public void setStaticRoot(String staticRoot) {
        this.staticRoot = staticRoot;
    }

    /**
     * 
     * @return
     *     The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * @param platform
     *     The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 
     * @return
     *     The hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * 
     * @param hostname
     *     The hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * 
     * @return
     *     The entryData
     */
    public EntryData getEntryData() {
        return entryData;
    }

    /**
     * 
     * @param entryData
     *     The entry_data
     */
    public void setEntryData(EntryData entryData) {
        this.entryData = entryData;
    }

    /**
     * 
     * @return
     *     The qe
     */
    public Qe getQe() {
        return qe;
    }

    /**
     * 
     * @param qe
     *     The qe
     */
    public void setQe(Qe qe) {
        this.qe = qe;
    }

    /**
     * 
     * @return
     *     The displayPropertiesServerGuess
     */
    public DisplayPropertiesServerGuess getDisplayPropertiesServerGuess() {
        return displayPropertiesServerGuess;
    }

    /**
     * 
     * @param displayPropertiesServerGuess
     *     The display_properties_server_guess
     */
    public void setDisplayPropertiesServerGuess(DisplayPropertiesServerGuess displayPropertiesServerGuess) {
        this.displayPropertiesServerGuess = displayPropertiesServerGuess;
    }

    /**
     * 
     * @return
     *     The config
     */
    public Config getConfig() {
        return config;
    }

    /**
     * 
     * @param config
     *     The config
     */
    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * 
     * @return
     *     The environmentSwitcherVisibleServerGuess
     */
    public boolean isEnvironmentSwitcherVisibleServerGuess() {
        return environmentSwitcherVisibleServerGuess;
    }

    /**
     * 
     * @param environmentSwitcherVisibleServerGuess
     *     The environment_switcher_visible_server_guess
     */
    public void setEnvironmentSwitcherVisibleServerGuess(boolean environmentSwitcherVisibleServerGuess) {
        this.environmentSwitcherVisibleServerGuess = environmentSwitcherVisibleServerGuess;
    }

}
