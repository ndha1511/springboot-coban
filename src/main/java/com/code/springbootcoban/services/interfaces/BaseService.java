package com.code.springbootcoban.services.interfaces;

import com.code.springbootcoban.models.Country;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BaseService<T, ID> {
    T save(T t);
    Optional<T> findById(ID id);
    void delete(ID id);
    List<T> findAll();
    T update(ID id, T t) throws InvocationTargetException, IllegalAccessException;
    T updatePatch(ID id, Map<String, ?> data);

}
