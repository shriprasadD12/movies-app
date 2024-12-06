package dev.api.movies.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Review {

    private ObjectId id;
    private String body;
    private LocalDateTime createdDate;
    private LocalDateTime updated;


    public Review(String body, LocalDateTime createdDate, LocalDateTime updated) {
        this.body = body;
        this.createdDate = createdDate;
        this.updated = updated;
    }


}
