package es.cabrerizo.fastblog.service;

import es.cabrerizo.fastblog.api.model.EntryDto;

import java.util.List;

public interface EntryService {

    void createEntry(EntryDto newEntry);

    void editEntry(EntryDto newEntry);

    void deleteEntry(Integer idEntry);

    EntryDto getEntry(Integer idEntry);

    List<EntryDto> getEntries();

}
