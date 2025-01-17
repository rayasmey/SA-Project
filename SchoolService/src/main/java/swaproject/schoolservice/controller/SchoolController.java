package swaproject.schoolservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swaproject.schoolservice.domains.School;
import swaproject.schoolservice.services.ISchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private ISchoolService schoolService;

 @PostMapping("/add")
 public School addSchool(@RequestBody School school){
     return schoolService.addSchool(school);

        }
  @GetMapping("/get/{schoolNumber}")
   public School getSchool(@PathVariable String schoolName){
     return schoolService.viewSchool(schoolName);
    }

  @DeleteMapping("/delete/{id}")
    public void deleteSchool(@PathVariable String schoolName){
     schoolService.removeSchool(schoolName);
  }

  @PutMapping("/update")
    public void UpdateSchool(@RequestBody School school){
     schoolService.updateSchool(school);
  }

}
