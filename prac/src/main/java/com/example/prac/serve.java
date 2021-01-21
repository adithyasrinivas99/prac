package com.example.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class serve {
@Autowired  private  repo r;
public entity saveTeacher(entity e){
    r.save(e);
    return  e;
}
public Optional<entity> getTeacher(int id){
   Optional<entity> x =  r.findAll().stream().filter(i->i.getTid()==id).findFirst();
   return  x;

}

}
