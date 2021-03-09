package tv.codely.mooc.courses.application.create;

import org.junit.Test;
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

        Course course = new Course("some-id", "some-name", "some-duration");

        creator.create(course.getId(), course.getName(), course.getDuration());

        verify(repository, atLeastOnce()).save(course);
    }

}
