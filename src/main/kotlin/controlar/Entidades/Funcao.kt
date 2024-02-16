package controlar.Entidades

import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "funcao")
class Funcao (id: String?, nome: String, status: Boolean){
}
