package com.ahsoromdoni.employeemmi.dao;

import com.ahsoromdoni.employeemmi.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionDAO extends JpaRepository<Position, Integer> {
}
