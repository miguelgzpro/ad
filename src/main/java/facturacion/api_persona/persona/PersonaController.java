package facturacion.api_persona.persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/persona")
@CrossOrigin({"*"})
public class PersonaController {
    @Autowired PersonaService personaService;

    @GetMapping("/")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @GetMapping("/{id}/")
    public Persona findById(@PathVariable Long id){
        return personaService.findById(id);
    }

    @PostMapping("/")
    public Persona save(@RequestBody Persona entity){
        return personaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Persona update(@RequestBody Persona entity){
        return personaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        personaService.deleteById(id);
    }
}
