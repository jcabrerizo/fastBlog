package es.cabrerizo.fastblog.repository;

import es.cabrerizo.fastblog.repository.model.Entry;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EntryInMemoryRepository implements EntryRepository{

    private Map<Integer, Entry> inMemoryDatabase= new HashMap<>();
    private Integer indexGenerator =0;
    private Integer getNextIndex() {
        return ++indexGenerator;
    }

    @Override
    public void create(Entry newItem) {
        newItem.setCreationDate(new Date());
        newItem.setId(getNextIndex());
        inMemoryDatabase.put(newItem.getId(), newItem);
    }

    @Override
    public Entry read(Integer idItem) {
        return inMemoryDatabase.get(idItem);
    }

    @Override
    public List<Entry> read() {
        return new ArrayList<>(inMemoryDatabase.values());
    }

    @Override
    public void update(Entry item) {
        inMemoryDatabase.replace(item.getId(), item);
    }

    @Override
    public void delete(Integer idItem) {
        inMemoryDatabase.remove(idItem);
    }
}
