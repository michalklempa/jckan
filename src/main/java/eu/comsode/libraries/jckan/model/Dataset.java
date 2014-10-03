package eu.comsode.libraries.jckan.model;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.comsode.libraries.jckan.model.Resource.TrackingSummary;
import eu.comsode.libraries.jckan.model.internal.Error;

/**
 * Represents a CKAN Dataset (previously a Package)
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     1.7
 * @since       2012-05-01
 */
public class Dataset {

    public static class Response {
        private String help;

        private Error error;

        private boolean success;

        private Dataset result;

        public String getHelp() {
            return help;
        }

        public void setHelp(String help) {
            this.help = help;
        }

        public Error getError() {
            return error;
        }

        public void setError(Error error) {
            this.error = error;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public Dataset getResult() {
            return result;
        }

        public void setResult(Dataset result) {
            this.result = result;
        }
    }

    private String author;

    private String author_email;

    private String creator_user_id;

    private List<Extra> extras;

    private List<Group> groups;

    private String id;

    private Boolean isopen;

    private String license_id;

    private String license_title;

    private String license_url;

    private String maintainer;

    private String maintainer_email;

    private Date metadata_created;

    private Date metadata_modified;

    private String name;

    private String notes;

    private Long num_resources;

    private Long num_tags;

    private Organization organization;

    private String owner_org;

    @JsonProperty("private")
    private Boolean _private;

    private List<Object> relationships_as_object;

    private List<Object> relationships_as_subject;

    private List<Resource> resources;

    private String revision_id;

    private Date revision_timestamp;

    private String state;

    private List<Tag> tags;

    private String title;

    private TrackingSummary tracking_summary;

    private String type;

    private String url;

    private String version;

    public Dataset() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public String getCreator_user_id() {
        return creator_user_id;
    }

    public void setCreator_user_id(String creator_user_id) {
        this.creator_user_id = creator_user_id;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    public String getLicense_id() {
        return license_id;
    }

    public void setLicense_id(String license_id) {
        this.license_id = license_id;
    }

    public String getLicense_title() {
        return license_title;
    }

    public void setLicense_title(String license_title) {
        this.license_title = license_title;
    }

    public String getLicense_url() {
        return license_url;
    }

    public void setLicense_url(String license_url) {
        this.license_url = license_url;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getMaintainer_email() {
        return maintainer_email;
    }

    public void setMaintainer_email(String maintainer_email) {
        this.maintainer_email = maintainer_email;
    }

    public Date getMetadata_created() {
        return metadata_created;
    }

    public void setMetadata_created(Date metadata_created) {
        this.metadata_created = metadata_created;
    }

    public Date getMetadata_modified() {
        return metadata_modified;
    }

    public void setMetadata_modified(Date metadata_modified) {
        this.metadata_modified = metadata_modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getNum_resources() {
        return num_resources;
    }

    public void setNum_resources(Long num_resources) {
        this.num_resources = num_resources;
    }

    public Long getNum_tags() {
        return num_tags;
    }

    public void setNum_tags(Long num_tags) {
        this.num_tags = num_tags;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOwner_org() {
        return owner_org;
    }

    public void setOwner_org(String owner_org) {
        this.owner_org = owner_org;
    }

    public Boolean get_private() {
        return _private;
    }

    public void set_private(Boolean _private) {
        this._private = _private;
    }

    public List<Object> getRelationships_as_object() {
        return relationships_as_object;
    }

    public void setRelationships_as_object(List<Object> relationships_as_object) {
        this.relationships_as_object = relationships_as_object;
    }

    public List<Object> getRelationships_as_subject() {
        return relationships_as_subject;
    }

    public void setRelationships_as_subject(List<Object> relationships_as_subject) {
        this.relationships_as_subject = relationships_as_subject;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(String revision_id) {
        this.revision_id = revision_id;
    }

    public Date getRevision_timestamp() {
        return revision_timestamp;
    }

    public void setRevision_timestamp(Date revision_timestamp) {
        this.revision_timestamp = revision_timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TrackingSummary getTracking_summary() {
        return tracking_summary;
    }

    public void setTracking_summary(TrackingSummary tracking_summary) {
        this.tracking_summary = tracking_summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
