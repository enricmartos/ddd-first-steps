package tv.codely.mooc.courses.application.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.shared.domain.Service;

@Service
public final class CourseCreator {
    private static final Logger logger = LoggerFactory.getLogger(CourseCreator.class.getName());

    private final CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCourseRequest request) {
        Course course = new Course(request.id(), request.name(), request.duration());
        logger.info(course.toString());
        repository.save(course);

    }
}
