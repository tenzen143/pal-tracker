package io.pivotal.pal.tracker;

@RestController
public class TimeEntryController {
    InMemoryTimeEntryRepository repo = new InMemoryTimeEntryRepository();

    public void create() {
        repo.create();
    }
    public void read() {

    }
    public void read_NotFound() {

    }
    public void list() {

    }
    public void update() {

    }
    public void update_NotFound() {

    }
    public void delete() {

    }
}
