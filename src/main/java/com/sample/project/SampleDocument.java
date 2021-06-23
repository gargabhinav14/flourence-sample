/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author abhinavg
 */
@Data
@Document(collection = "sample_collection")
class SampleDocument {

    @Id
    private String id;
    
    private String itemCode;
    private String itemName;
    private List<SampleTags> tags;
    
    
}
