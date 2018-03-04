package com.example.murodjonrahimov.hackathon.model;

public class Jobs {

    private String address, agency, bin, boroughCommunity,contactNumber,latitute, longitude, nta, program, programType, siteName, gradeLevelAgeGroup, selected;
    private boolean isFavorite;

    public Jobs(String address, String agency, String bin, String boroughCommunity, String contactNumber, String latitute, String longitude, String nta, String program, String programType, String siteName, String gradeLevelAgeGroup, String selected, boolean isFavorite) {
        this.address = address;
        this.agency = agency;
        this.bin = bin;
        this.boroughCommunity = boroughCommunity;
        this.contactNumber = contactNumber;
        this.latitute = latitute;
        this.longitude = longitude;
        this.nta = nta;
        this.program = program;
        this.programType = programType;
        this.siteName = siteName;
        this.gradeLevelAgeGroup = gradeLevelAgeGroup;
        this.selected = selected;
        this.isFavorite = isFavorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getBin() {
        return bin;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBoroughCommunity() {
        return boroughCommunity;
    }

    public void setBoroughCommunity(String boroughCommunity) {
        this.boroughCommunity = boroughCommunity;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getGradeLevelAgeGroup() {
        return gradeLevelAgeGroup;
    }

    public void setGradeLevelAgeGroup(String gradeLevelAgeGroup) {
        this.gradeLevelAgeGroup = gradeLevelAgeGroup;
    }
}
