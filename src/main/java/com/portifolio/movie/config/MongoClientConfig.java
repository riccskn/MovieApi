package com.portifolio.movie.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoClientConfig extends AbstractMongoClientConfiguration {

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://root:170504@localhost:27017/?authSource=admin&readPreference=primary&appname=MongoDB%20Server&directConnection=true&ssl=false");
    }

    @Override
    protected String getDatabaseName() {
        return "admin";
    }
}
