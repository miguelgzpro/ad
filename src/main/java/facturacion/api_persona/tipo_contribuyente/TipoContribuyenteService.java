package facturacion.api_persona.tipo_contribuyente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    
@Service
public class TipoContribuyenteService {
    @Autowired TipoContribuyenteRepository entityRepository;

    public TipoContribuyente save(TipoContribuyente entity){
        return entityRepository.save(entity);
    }

    public TipoContribuyente findById( Long id){
        return entityRepository.findById(id).orElse(new TipoContribuyente());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<TipoContribuyente> findAll(){
        return entityRepository.findAll();
    }
}
