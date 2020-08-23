package com.ahsoromdoni.employeemmi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service<T> {
    public T insert(T entity);
    public T update(T entity);
    public void delete(T entity);
    public T getById(Integer id);
    public List<T> getList();
    public Page<T> getListForPagination(Pageable pager);
}
