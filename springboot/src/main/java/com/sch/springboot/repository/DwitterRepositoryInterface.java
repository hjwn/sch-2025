package com.sch.springboot.repository;

import com.sch.springboot.dto.Dwitter;

import java.util.List;

public interface DwitterRepositoryInterface {
    String insert(Dwitter dwitter);
    List<Dwitter> findAll();
    String delete(Long id);
}
