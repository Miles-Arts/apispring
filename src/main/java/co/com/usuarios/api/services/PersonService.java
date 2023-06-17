package co.com.usuarios.api.services;


import co.com.usuarios.api.model.PersonModel;
import co.com.usuarios.api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

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

}
