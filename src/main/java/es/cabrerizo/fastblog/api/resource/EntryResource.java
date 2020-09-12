package es.cabrerizo.fastblog.api.resource;

import es.cabrerizo.fastblog.api.EntryApi;
import es.cabrerizo.fastblog.api.model.EntryDto;
import es.cabrerizo.fastblog.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryResource implements EntryApi {

    private final EntryService entryService;

    @Autowired
    public EntryResource(EntryService entryService) {
        this.entryService = entryService;
    }

    @Override
    public void createEntry(EntryDto newEntry) {
        entryService.createEntry(newEntry);
    }

    @Override
    public void editEntry(EntryDto existingEntry) {
        entryService.editEntry(existingEntry);
    }

    @Override
    public void deleteEntry(Integer idEntry) {
        entryService.deleteEntry(idEntry);
    }

    @Override
    public EntryDto getEntry(Integer idEntry) {
        return entryService.getEntry(idEntry);
    }

    @Override
    public List<EntryDto> getEntries() {
        return entryService.getEntries();
    }
}
