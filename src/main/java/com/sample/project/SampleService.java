/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author abhinavg
 */
@Service
public class SampleService {

    @Autowired
    SampleRepository repository;

    @Autowired
    SampleTagsRepository tagsRepository;

    SampleDocument addCatalog(SampleDocument doc) {
        return repository.save(doc);
    }

    ArrayList<SampleDocument> getCatalog(int page, int size, String searchTag) {
        Pageable paging = PageRequest.of(page, size);
        ArrayList<SampleDocument> docs = new ArrayList<>();

        if (!searchTag.isEmpty()) {
            tagsRepository.findBySearchTag(searchTag)
                    .forEach(tag -> {
                        repository.findByItemCode(paging, tag.getItemCode())
                                .forEach(item -> docs.add(item));
                    });
            return docs;
        } else {
            return repository.findAll(paging)
                    .stream()
                    .map(x -> {
                        x.setTags(tagsRepository.findByItemCode(x.getItemCode()));
                        return x;
                    })
                    .collect(Collectors.toCollection(ArrayList<SampleDocument>::new));
        }
    }

    List<SampleDocument> updateCatalog(SampleDocument doc, String itemCode) {
        List<SampleDocument> res = repository.findByItemCode(itemCode);
        for (SampleDocument re : res) {
            re.setItemCode(doc.getItemCode());
            re.setItemName(doc.getItemName());
            repository.save(re);
        }
        return res;
    }

    void deleteCatalog(String itemCode) {
        repository.deleteByItemCode(itemCode);
    }

    List<SampleDocument> addTagForItem(String item_code, SampleDocument doc) {
        List<SampleDocument> response = new ArrayList<>();
        repository.findByItemCode(item_code)
                .forEach(item -> {
                    if (item.getTags() != null) {
                        item.getTags().addAll(doc.getTags());
                    } else {
                        item.setTags(doc.getTags());
                    }
                    item.getTags().forEach(y -> {
                        y.setItemCode(item_code);
                        y = tagsRepository.save(y);
                    });
                    response.add(item);
                });
        return response;
    }

    Page<SampleTags> getTags(int page, int size) {
        return tagsRepository.findAll(PageRequest.of(page, size));
    }

    Page<SampleTags> getTagsForItem(String item_code, int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return tagsRepository.findByItemCode(paging, item_code);
    }

    void deleteTag(String item_code) {
        tagsRepository.deleteByItemCode(item_code);
    }

    List<SampleTags> searchTags(String search, int page, int size) {
        return tagsRepository.findBySearchTag(search);
    }

}
