package controlar

import com.mongodb.client.MongoClient
import controlar.Entidades.Funcao
import org.bson.types.ObjectId
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

data class Item(val _id: ObjectId, val name: String)

class ItemRepository(private val mongoClient: MongoClient) {
    private val collection = mongoClient.getDatabase("controlar").getCollection<Funcao>("funcao")

    suspend fun insertItem(item: Funcao) {
        collection.insertOne(item)
    }

    suspend fun findItemById(id: ObjectId): Funcao? {
        return collection.find()
    }
}
