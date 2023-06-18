package co.com.usuarios.api.services;


import co.com.usuarios.api.model.PersonModel;
import co.com.usuarios.api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class PersonService {

    @Autowired //@urowired Inyección de dependencias
    private PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    //@GetMapping

    public ArrayList<PersonModel> getAllPersons() {
        return (ArrayList<PersonModel>) personRepository.findAll();
    }

    public  PersonModel savePersonModel(PersonModel personModel) {

        return personRepository.save(personModel);

    }

    public Optional<PersonModel> getPersonById(Long id) {
        return personRepository.findById(id);
    }
}
