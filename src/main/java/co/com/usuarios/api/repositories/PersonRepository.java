package co.com.usuarios.api.repositories;

import co.com.usuarios.api.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

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



}
