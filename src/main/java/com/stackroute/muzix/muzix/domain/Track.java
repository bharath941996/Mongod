package com.stackroute.muzix.muzix.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Tracks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Track {
   @Id
    private int trackId;
    private String trackName;
    private String trackComment;
}
