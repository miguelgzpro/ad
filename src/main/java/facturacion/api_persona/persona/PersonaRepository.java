package facturacion.api_persona.persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

    public List<Persona> findAll();
}
