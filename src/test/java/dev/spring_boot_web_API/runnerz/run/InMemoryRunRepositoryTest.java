package dev.spring_boot_web_API.runnerz.run;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRunRepositoryTest {

    InMemoryRunRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryRunRepository();
        repository.create(new Run(
                1,
                "Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(30),
                3,
                Location.INDOOR));

        repository.create(new Run(
                2,
                "Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(60),
                6,
                Location.OUTDOOR));
    }

    @Test
    void shouldFindAllRuns() {
        List<Run> runs = repository.findAll();
        assertEquals(2, runs.size(), "Should have returned 2 runs");
    }

    @Test
    void shouldFindRunWithValidId() {
        var run = repository.findById(1).get();
        assertEquals(
                "Morning Run",
                run.title(),
                "Should have returned its title"
        );
        assertEquals(3, run.miles(), "Should have returned its miles");
    }

    @Test
    void shouldNotFindRunWithInvalidId() {
        RunNotFoundException notFoundException = assertThrows(
                RunNotFoundException.class,
                () -> repository.findById(3).get()
        );

        assertEquals("Run Not Found", notFoundException.getMessage());
    }

    @Test
    void shouldCreateNewRun() {
        repository.create(
                new Run(
                        3,
                        "Friday Morning Run",
                        LocalDateTime.now(),
                        LocalDateTime.now().plusMinutes(30),
                        3,
                        Location.INDOOR
                )
        );
        List<Run> runs = repository.findAll();
        assertEquals(3, runs.size(), "Should have returned 3 runs");
    }

    @Test
    void shouldUpdateRun() {
        repository.update(
                new Run(
                        1,
                        "Monday Morning Run",
                        LocalDateTime.now(),
                        LocalDateTime.now().plusMinutes(30),
                        5,
                        Location.OUTDOOR
                ), 1);
        var run = repository.findById(1).get();
        assertEquals(
                "Monday Morning Run",
                run.title()
        );
        assertEquals(5, run.miles());
        assertEquals(Location.OUTDOOR, run.location());
    }

    @Test
    void shouldDeleteRun() {
        repository.delete(1);
        List<Run> runs = repository.findAll();
        assertEquals(1, runs.size(), "Should have returned 1 run");
    }
}