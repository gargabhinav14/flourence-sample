/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.project;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author abhinavg
 */
@Data
@Document(collection = "sample_tags")
class SampleTags {

    @Id
    private String id;
    
    private String itemCode;
    private String tagValue;

}
