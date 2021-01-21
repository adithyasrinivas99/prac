package com.example.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/main")

public class control {
    @Autowired
    private serve ser;
    @RequestMapping(method = RequestMethod.POST,path="/save{obj}")
    public ResponseEntity<entity>saveteacher(@RequestBody entity obj)
   {
entity e=ser.saveTeacher(obj);

return new ResponseEntity<entity>(e, HttpStatus.OK);
   }
   @RequestMapping(method = RequestMethod.GET, path="/get{id}")
    public ResponseEntity<Optional<entity>> getTeacher(@PathVariable int id){
        Optional<entity> d=ser.getTeacher(id);
        return new ResponseEntity<Optional<entity>>(d,HttpStatus.OK);
   }
}
