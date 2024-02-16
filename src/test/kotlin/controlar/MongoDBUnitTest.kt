package controlar

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking
import org.bson.types.ObjectId

class MongoDBUnitTest : FunSpec({

    val mongoClient = MongoDBConfig.createMongoClient()
    val itemRepository = ItemRepository(mongoClient)

    beforeTest {
        runBlocking {
            // Limpe a coleção antes de cada teste
            itemRepository.getCollection().deleteMany("{}")
        }
    }

    test("Inserir e recuperar item do MongoDB") {
        runBlocking {
            val itemId = ObjectId()
            val item = Item(itemId, "ExemploItem")

            // Inserir dados
            itemRepository.insertItem(item)

            // Recuperar dados
            val retrievedItem = itemRepository.findItemById(itemId)

            retrievedItem shouldBe item
        }
    }
})
