package controlar.persistencia

import controlar.Entidades.Funcao
import org.springframework.data.annotation.Persistent
import org.springframework.data.mongodb.repository.MongoRepository

@Persistent
interface FuncaoPersistencia : MongoRepository<Funcao, String> {
}