package tv.codely.mooc.courses.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import tv.codely.mooc.courses.domain.CourseFirstImpl;
import tv.codely.mooc.courses.domain.CourseRepositoryFirstImpl;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class InMemoryCourseRepositoryFirstImpl implements CourseRepositoryFirstImpl {
    private HashMap<String, CourseFirstImpl> courses = new HashMap<>();

    @Override
    public void save(CourseFirstImpl course) {
        courses.put(course.getId(), course);
    }

    @Override
    public Optional<CourseFirstImpl> search(String id) {
        return Optional.ofNullable(courses.get(id));
    }

}
