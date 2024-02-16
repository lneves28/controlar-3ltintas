package controlar

import com.mongodb.ConnectionString
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients

object MongoDBConfig {
    fun createMongoClient(): MongoClient {
        val connectionString = ConnectionString("mongodb://localhost:27017")
        return MongoClients.create(connectionString)
    }
}
