package eu.comsode.libraries.jckan.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import eu.comsode.libraries.jckan.model.internal.Error;

/**
 * Represents a single resource within a Dataset
 *
 * @author      Ross Jones <ross.jones@okfn.org>
 * @version     2.2
 * @since       2012-05-01
 */
public class Resource {
    public static class Response {
        private String help;

        private Error error;

        private boolean success;

        private Resource result;

        public Response() {
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public Resource getResult() {
            return result;
        }

        public void setResult(Resource result) {
            this.result = result;
        }

        public Error getError() {
            return error;
        }

        public void setError(Error error) {
            this.error = error;
        }

        public String getHelp() {
            return help;
        }

        public void setHelp(String help) {
            this.help = help;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    public static class TrackingSummary {
        private long recent;

        private long total;

        public TrackingSummary() {
        }

        public long getRecent() {
            return recent;
        }

        public void setRecent(long recent) {
            this.recent = recent;
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    private String cache_last_updated;

    private String cache_url;

    private String created;

    private String description;

    private String format;

    private String hash;

    private String id;

    private String last_modified;

    private String mimetype;

    private String mimetype_inner;

    private String name;

    // only on create
    private String package_id;

    // generated
    private long position;

    // generated
    private String resource_group_id;

    private String resource_type;

    private String revision_id;

    // generated
    private String revision_timestamp;

    private long size;

    // generated
    private String state;

    // generated
    private TrackingSummary tracking_summary;

    private String url;

    // generated
    private String url_type;

    private String webstore_last_updated;

    private String webstore_url;

    public Resource() {
    }

    public String getCache_last_updated() {
        return cache_last_updated;
    }

    public void setCache_last_updated(String cache_last_updated) {
        this.cache_last_updated = cache_last_updated;
    }

    public String getCache_url() {
        return cache_url;
    }

    public void setCache_url(String cache_url) {
        this.cache_url = cache_url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getMimetype_inner() {
        return mimetype_inner;
    }

    public void setMimetype_inner(String mimetype_inner) {
        this.mimetype_inner = mimetype_inner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public String getResource_group_id() {
        return resource_group_id;
    }

    public void setResource_group_id(String resource_group_id) {
        this.resource_group_id = resource_group_id;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(String revision_id) {
        this.revision_id = revision_id;
    }

    public String getRevision_timestamp() {
        return revision_timestamp;
    }

    public void setRevision_timestamp(String revision_timestamp) {
        this.revision_timestamp = revision_timestamp;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TrackingSummary getTracking_summary() {
        return tracking_summary;
    }

    public void setTracking_summary(TrackingSummary tracking_summary) {
        this.tracking_summary = tracking_summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_type() {
        return url_type;
    }

    public void setUrl_type(String url_type) {
        this.url_type = url_type;
    }

    public String getWebstore_last_updated() {
        return webstore_last_updated;
    }

    public void setWebstore_last_updated(String webstore_last_updated) {
        this.webstore_last_updated = webstore_last_updated;
    }

    public String getWebstore_url() {
        return webstore_url;
    }

    public void setWebstore_url(String webstore_url) {
        this.webstore_url = webstore_url;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
