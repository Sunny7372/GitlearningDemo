package org.example.LearningController;

import org.example.LearningService.LearningJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Leaning {
    @Autowired
    private LearningJava learningJava;
    @GetMapping("/learnList")
    public ResponseEntity<?> learnThings(){
        String response=learningJava.learnJava();
        return new ResponseEntity<>(response, HttpStatus.OK);




    }


}
