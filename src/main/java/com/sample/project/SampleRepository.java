/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import java.util.List;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author abhinavg
 */
public interface SampleRepository extends MongoRepository<SampleDocument, UUID> {

    List<SampleDocument> findByItemCode(String item_code);

    Page<SampleDocument> findByItemCode(Pageable page, String item_code);

    void deleteByItemCode(String item_code);

}
