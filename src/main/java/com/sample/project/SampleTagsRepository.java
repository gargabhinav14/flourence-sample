/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author abhinavg
 */
public interface SampleTagsRepository extends MongoRepository<SampleTags, String> {

    Page<SampleTags> findByItemCode(Pageable pageable, String item_code);

    List<SampleTags> findByItemCode(String item_code);

    void deleteByItemCode(String item_code);

    @Query("{tagValue : { $regex: /?0$/ }}")
    List<SampleTags> findBySearchTag(String tag);

}
