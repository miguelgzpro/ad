package facturacion.api_persona.persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class PersonaService {
    @Autowired PersonaRepository entityRepository;

    public Persona save(Persona entity){
        return entityRepository.save(entity);
    }

    public Persona findById( Long id){
        return entityRepository.findById(id).orElse(new Persona());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Persona> findAll(){
        return entityRepository.findAll();
    }
}
