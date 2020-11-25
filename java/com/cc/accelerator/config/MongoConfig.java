/*
 * package com.cc.accelerator.config;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.mongodb.core.MongoTemplate;
 * 
 * import com.mongodb.ConnectionString; import com.mongodb.MongoClientSettings;
 * import com.mongodb.client.MongoClient; import
 * com.mongodb.client.MongoClients;
 * 
 * @Configuration public class MongoConfig {
 * 
 * @Value("${mongo.connection.uri}") private String mongoConnectionUri;
 * 
 * @Value("${mongo.database.name}") private String mongoDBName;
 * 
 * @Bean public MongoClient mongo() { ConnectionString connectionString = new
 * ConnectionString(mongoConnectionUri+"/"+mongoDBName); MongoClientSettings
 * mongoClientSettings =
 * MongoClientSettings.builder().applyConnectionString(connectionString)
 * .build();
 * 
 * return MongoClients.create(mongoClientSettings); }
 * 
 * @Bean(name ="mongoTemplate") public MongoTemplate getMongoTemplate() throws
 * Exception { return new MongoTemplate(mongo(),mongoDBName); } }
 */