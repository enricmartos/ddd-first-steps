package tv.codely.mooc.courses.application.create;

import tv.codely.mooc.courses.domain.CourseFirstImpl;
import tv.codely.mooc.courses.domain.CourseRepositoryFirstImpl;
import tv.codely.shared.domain.Service;

@Service
public final class CourseCreatorFirstImpl {
    private final CourseRepositoryFirstImpl repository;

    public CourseCreatorFirstImpl(CourseRepositoryFirstImpl repository) {
        this.repository = repository;
    }

    public void create(String id, String name, String duration) {
        CourseFirstImpl course = new CourseFirstImpl(id, name, duration);

        repository.save(course);

    }
}
