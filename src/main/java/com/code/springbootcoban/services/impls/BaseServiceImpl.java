package com.code.springbootcoban.services.impls;

import com.code.springbootcoban.models.Country;
import com.code.springbootcoban.services.interfaces.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;


import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
    private final JpaRepository<T, ID> baseRepository;

    public BaseServiceImpl(JpaRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public T save(T t) {
        return baseRepository.save(t);
    }

    @Override
    public Optional<T> findById(ID id) {
        return baseRepository.findById(id);
    }

    @Override
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public T update(ID id, T t) {
        T tOld = baseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));


        return baseRepository.save(t);
    }

    @Override
    public T updatePatch(ID id, Map<String, ?> data) {
        T t = findById(id).orElseThrow();
        Set<String> keys = data.keySet();
        if(keys.contains("id")) {
            return null;
        }
        Class<Country> clazz = Country.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            for(String key: keys) {
                if(method.getName().equals("set" + capitalizeFirstLetter(key))) {
                    try {
                        Object value = data.get(key);
                        if (value instanceof String && method.getParameterTypes()[0].isEnum()) {
                            value = Enum.valueOf((Class<Enum>) method.getParameterTypes()[0], (String) value);
                        }
                        method.invoke(t, value);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return save(t);
    }

    public String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] chars = input.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}
