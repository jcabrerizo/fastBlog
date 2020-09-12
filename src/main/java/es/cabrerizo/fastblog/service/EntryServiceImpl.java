package es.cabrerizo.fastblog.service;

import es.cabrerizo.fastblog.api.model.EntryDto;
import es.cabrerizo.fastblog.repository.EntryRepository;
import es.cabrerizo.fastblog.repository.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryServiceImpl implements EntryService {

    EntryRepository repository;

    @Override
    public void createEntry(EntryDto newEntry) {
        Entry entry = new Entry();
        entry.setBody(newEntry.getBody());
        entry.setTitle(newEntry.getTitle());
        repository.create(entry);
    }

    @Override
    public void editEntry(EntryDto newEntry) {
        Entry persistedEntry = repository.read(newEntry.getId());
        persistedEntry.setTitle(newEntry.getTitle());
        persistedEntry.setBody(newEntry.getBody());
        repository.update(persistedEntry);
    }

    @Override
    public void deleteEntry(Integer idEntry) {
        repository.delete(idEntry);

    }

    @Override
    public EntryDto getEntry(Integer idEntry) {
        Entry persistedEntry = repository.read(idEntry);
        return entityToDto(persistedEntry);
    }

    @Override
    public List<EntryDto> getEntries() {
        List<Entry> read = repository.read();
        return read.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    private EntryDto entityToDto(Entry persistedEntry) {
        EntryDto dto = new EntryDto();
        dto.setId(persistedEntry.getId());
        dto.setBody(persistedEntry.getBody());
        dto.setTitle(persistedEntry.getTitle());
        dto.setCreationDte(persistedEntry.getCreationDate().toString());
        return dto;
    }

}
