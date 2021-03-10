package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public final class CourseCreatorShould {

    @Test
    public void save_a_valid_course() {
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator creator = new CourseCreator(repository);

        String id = "some-id";
        String name = "some-name";
        String duration = "some-duration";
        Course course = new Course(id, name, duration);

        creator.create(new CreateCourseRequest(course.id(), course.name(), course.duration()));

        verify(repository, atLeastOnce()).save(course);
    }

}
