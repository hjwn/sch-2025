package com.sch.springboot.service;


import com.sch.springboot.dto.Dwitter;
import com.sch.springboot.repository.JpaDwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DwitterService {
    // Repository DI

    private JpaDwitterRepository dwitterRepository;

    @Autowired
    public DwitterService(JpaDwitterRepository dwitterRepository){
        this.dwitterRepository = dwitterRepository;
    }

    public List<Dwitter> list(){
        return dwitterRepository.findAll();
    }

    public String save(Dwitter dwitter){
        return dwitterRepository.insert(dwitter);
    }


    public String delete(Long id) {
        return dwitterRepository.delete(id);
    }
}
