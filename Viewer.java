package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> moviesSeen;

    public int quantityOfMoviesSeen() {
        if (moviesSeen == null)
            return 0;

        return moviesSeen.size();
    }
}
