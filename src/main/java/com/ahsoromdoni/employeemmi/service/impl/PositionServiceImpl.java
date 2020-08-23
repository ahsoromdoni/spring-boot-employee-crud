package com.ahsoromdoni.employeemmi.service.impl;

import com.ahsoromdoni.employeemmi.dao.PositionDAO;
import com.ahsoromdoni.employeemmi.entity.Position;
import com.ahsoromdoni.employeemmi.exception.NotFoundException;
import com.ahsoromdoni.employeemmi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionDAO positionDAO;

    @Override
    public Position insert(Position entity) {
        return null;
    }

    @Override
    public Position update(Position entity) {
        return null;
    }

    @Override
    public void delete(Position entity) {
    }

    @Override
    public Position getById(Integer id) {
        if(!positionDAO.findById(id).isPresent()){
            throw new NotFoundException("Id not found!");
        }
        return positionDAO.findById(id).get();
    }

    @Override
    public List<Position> getList() {
        return positionDAO.findAll();
    }

    @Override
    public Page<Position> getListForPagination(Pageable pager) {
        return null;
    }
}
