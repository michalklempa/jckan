package eu.comsode.libraries.jckan.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents a CKAN group
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     1.7
 * @since       2012-05-01
 */
public class Group {

    private String description;

    private String display_name;

    private String id;

    private String image_display_url;

    private String name;

    private String title;

    public Group() {
    }

    public Group(String description, String display_name, String id, String image_display_url, String name, String title) {
        super();
        this.description = description;
        this.display_name = display_name;
        this.id = id;
        this.image_display_url = image_display_url;
        this.name = name;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_display_url() {
        return image_display_url;
    }

    public void setImage_display_url(String image_display_url) {
        this.image_display_url = image_display_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
