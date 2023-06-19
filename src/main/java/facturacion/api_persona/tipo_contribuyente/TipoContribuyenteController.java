package facturacion.api_persona.tipo_contribuyente;
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
@RequestMapping("api/tipoContribuyente")
@CrossOrigin({"*"})
public class TipoContribuyenteController {
    @Autowired TipoContribuyenteService tipoContribuyenteService;

    @GetMapping("/")
    public List<TipoContribuyente> findAll(){
        return tipoContribuyenteService.findAll();
    }

    @GetMapping("/{id}/")
    public TipoContribuyente findById(@PathVariable Long id){
        return tipoContribuyenteService.findById(id);
    }

    @PostMapping("/")
    public TipoContribuyente save(@RequestBody TipoContribuyente entity){
        return tipoContribuyenteService.save(entity);
    }

    @PutMapping("/{id}/")
    public TipoContribuyente update(@RequestBody TipoContribuyente entity){
        return tipoContribuyenteService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        tipoContribuyenteService.deleteById(id);
    }
}
