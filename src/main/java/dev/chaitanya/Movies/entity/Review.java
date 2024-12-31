package dev.chaitanya.Movies.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
public class Review {
    @Id
    private ObjectId id;

    private String body;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    public Review() {
    }

    public Review(String body) {
        this.body = body;
    }
}
