package dev.spring_boot_web_API.runnerz.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface IRunRepository extends ListCrudRepository<Run, Integer> {
    List<Run> findAllByLocation(String location);
}
