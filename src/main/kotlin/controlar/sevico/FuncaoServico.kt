package controlar.sevico

import controlar.Entidades.Funcao
import controlar.persistencia.FuncaoPersistencia
import org.springframework.stereotype.Service
import java.util.*

@Service
class FuncaoServico (private val persistencia: FuncaoPersistencia){

    fun cadastrar(funcao: Funcao): Funcao{

        return persistencia.save(funcao)
    }

    fun consultar(id: String) : Optional<Funcao> {

        return persistencia.findById(id)
    }

    fun pesquisar(): MutableList<Funcao> {

        return  persistencia.findAll()
    }

}