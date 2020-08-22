package com.ahsoromdoni.employeemmi.service;

import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface Service<T> {
    public T insert(T entity);
    public T update(T entity);
    public T delete(T entity);
    public T getById(Integer id);
    public Page<T> getListForPagination(Pageable pager);
}
