package co.com.usuarios.api.controllers;

import co.com.usuarios.api.model.PersonModel;
import co.com.usuarios.api.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 *  CRUD BASICO
 *
 * @version 1.0.0 2023-06-17
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@RestController
@RequestMapping("api/person")   //Añade Auto URL
public class PersonController {

    //ADD los End Points
    @Autowired //INYECIÖN DE DEPENDENCIAS
    PersonService personService;

    @GetMapping("/all") //LLamar a todos
    public ArrayList<PersonModel> getAllPersons() {
            return personService.getAllPersons();
    }

    @PostMapping //Guardar PERSON
    public PersonModel savePerson(@RequestBody PersonModel personModel) {
        return personService.savePersonModel(personModel);
    }

    @GetMapping("/{id}") //LLamar por ID
    public Optional<PersonModel> getPersonById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

    @GetMapping("/query") //QUERYS filtrar PERSOn por Parametros
    public ArrayList<PersonModel> getPersonByLastName(@RequestParam("lastName") String lastName) {
      return personService.getPersonByLastName(lastName);
    }

}
