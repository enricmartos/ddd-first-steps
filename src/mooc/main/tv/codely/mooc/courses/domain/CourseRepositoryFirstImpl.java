package tv.codely.mooc.courses.domain;

import java.util.Optional;

public interface CourseRepositoryFirstImpl {
    void save(CourseFirstImpl course);

    Optional<CourseFirstImpl> search(String id);


}
