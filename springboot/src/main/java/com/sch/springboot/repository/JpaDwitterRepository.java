package com.sch.springboot.repository;


import com.sch.springboot.dto.Dwitter;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaDwitterRepository implements DwitterRepositoryInterface{
    private final EntityManager em;

    @Autowired
    public JpaDwitterRepository(EntityManager em){
        this.em = em;
    }

    @Override
    public String insert(Dwitter dwitter){
        em.persist(dwitter);
        return "ok";
    }

    @Override
    public List<Dwitter> findAll(){
        return em.createQuery("select m from Dwitter m", Dwitter.class).getResultList();
    }

    @Override
    public String delete(Long id){
        // id를 가진 엔티티 객체 (Dwitter)가 존재하면 삭제
        Dwitter findDwitter = em.find(Dwitter.class,id);
        if(findDwitter != null){
            em.remove(findDwitter);
        }
        return "ok";
    }
}
