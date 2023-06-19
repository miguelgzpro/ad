package facturacion.api_persona.tipo_contribuyente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TipoContribuyenteRepository extends CrudRepository<TipoContribuyente, Long> {

    public List<TipoContribuyente> findAll();
}