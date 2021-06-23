/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abhinavg
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class SampleController {

    @Autowired
    SampleService service;

    @PostMapping(value = "/catalog/add", consumes = "application/json")
    public SampleDocument addCatalog(@RequestBody SampleDocument doc) {
        return service.addCatalog(doc);
    }

    @GetMapping(value = "/catalog/get")
    public ArrayList<SampleDocument> getCatalog(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "") String search) {
        return service.getCatalog(page, size, search);
    }

    @PutMapping(value = "/catalog/update/{item_code}")
    public List<SampleDocument> updateCatalog(@RequestBody SampleDocument doc, @PathVariable String item_code) {
        return service.updateCatalog(doc, item_code);
    }

    @DeleteMapping(value = "/catalog/delete/{item_code}")
    public void deleteCatalog(@PathVariable String item_code) {
        service.deleteCatalog(item_code);
    }

    @GetMapping(value = "/catalog/tags/get")
    public Page<SampleTags> getTags(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return service.getTags(page, size);
    }

    @GetMapping(value = "/catalog/{item_code}/tags/get")
    public Page<SampleTags> getTagsByItemCode(@PathVariable String item_code,
            @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return service.getTagsForItem(item_code, page, size);
    }

    @PostMapping(value = "/catalog/{item_code}/tags/add", consumes = "application/json")
    public List<SampleDocument> addTag(@PathVariable String item_code, @RequestBody SampleDocument doc) {
        return service.addTagForItem(item_code, doc);
    }

    @DeleteMapping(value = "/catalog/{item_code}/tags/delete")
    public void deleteTagByItemCode(@PathVariable String item_code) {
        service.deleteTag(item_code);
    }

}
