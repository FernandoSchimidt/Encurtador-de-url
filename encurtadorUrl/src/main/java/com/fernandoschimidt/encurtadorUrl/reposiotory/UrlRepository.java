package com.fernandoschimidt.encurtadorUrl.reposiotory;

import com.fernandoschimidt.encurtadorUrl.entity.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity,String> {
}
