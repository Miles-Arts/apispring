package co.com.usuarios.api.controllers;

import co.com.usuarios.api.model.PersonModel;
import co.com.usuarios.api.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/person")   //Añade Auto URL
public class PersonController {

    //ADD los End Points
    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public ArrayList<PersonModel> getAllPersons() {
            return personService.getAllPersons();
    }

    @PostMapping
    public PersonModel savePerson(@RequestBody PersonModel personModel) {
        return personService.savePersonModel(personModel);
    }

    @GetMapping("/{id}")
    public Optional<PersonModel> getPersonById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

}
