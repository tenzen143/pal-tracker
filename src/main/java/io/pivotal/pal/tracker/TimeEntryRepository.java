package io.pivotal.pal.tracker;

public interface TimeEntryRepository {

    public void create() throws Exception;

    public void find() throws Exception;

    public void find_MissingEntry();

    public void list() throws Exception;

    public void update() throws Exception;

    public void update_MissingEntry();

    public void delete() throws Exception;

    public void deleteKeepsTrackOfLatestIdProperly();

}
