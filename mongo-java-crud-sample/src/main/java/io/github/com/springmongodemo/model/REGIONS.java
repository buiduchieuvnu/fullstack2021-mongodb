package io.github.com.springmongodemo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="REGIONS")
public class REGIONS {
    @Id
    public ObjectId _id;

    public String REGION_NAME;
    public String REGION_ID;

    public REGIONS() {
    }

    public REGIONS(ObjectId _id, String name, String regionId) {
        this._id = _id;
        this.REGION_NAME = name;
        this.REGION_ID = regionId;
    }
}
