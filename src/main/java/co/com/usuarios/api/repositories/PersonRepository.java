package co.com.usuarios.api.repositories;

import co.com.usuarios.api.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

//                                                    Objeto model PErsonModel y Id
public interface PersonRepository extends JpaRepository<PersonModel, Long> {



}
