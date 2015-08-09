package com.mycompany.dbs;

/**
 * Created by Hafizh Hasrindra on 009, 09-Aug-15.
 */
public class KnowledgeItem {

    private String title;
    private String category;
    private int thumbnail;
    private String description;

    public KnowledgeItem(String title, String category, int thumbnail, String description) {
        this.title = title;
        this.category = category;
        this.thumbnail = thumbnail;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
