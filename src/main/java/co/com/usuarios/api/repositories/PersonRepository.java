package co.com.usuarios.api.repositories;

import co.com.usuarios.api.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 *
 *  CRUD BASICO
 *
 * @version 1.0.0 2023-06-17
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

//                                         Objeto model PErsonModel y Id
public interface PersonRepository extends JpaRepository<PersonModel, Long> {

    //Metodo abstrcto no se va a implementar
   // public abstract ArrayList<PersonModel> findByLastName(String lastname);
    public abstract ArrayList<PersonModel> getPersonByLastName(String lastname);

    //ArrayList<PersonModel> getPersonByLastNameId(String lastName);
}
