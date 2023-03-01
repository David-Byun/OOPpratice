package code.test.screen;

import code.test.movie.Movie;

import java.time.LocalDate;
import java.time.LocalTime;

public class Screen {
    private LocalTime startTime;
    private LocalDate runningDate;
    private int sequence;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalDate getRunningDate() {
        return runningDate;
    }

    public int getSequence() {
        return sequence;
    }

}
