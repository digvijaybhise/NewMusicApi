package com.geekster.MusicStreamingApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long songId;
    @NotNull
    private String songName;
    @NotNull
    private String singer;
    @NotNull
    private String band;
    @NotNull
    private LocalDate releaseDate;
}
