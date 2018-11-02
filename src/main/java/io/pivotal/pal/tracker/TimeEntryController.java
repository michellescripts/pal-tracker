package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(long id) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(long id, TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> delete(long id) {
        return null;
    }
}
