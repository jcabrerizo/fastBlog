package es.cabrerizo.fastblog.repository;

import java.util.List;

public interface CrudRepository<T,K> {

    void create(T newItem);

    T read(K idItem);
    List<T> read();

    void update(T item);

    void delete(K idItem);
}
