package tv.codely.mooc.courses.application.create;

import org.junit.Test;
import tv.codely.mooc.courses.domain.CourseFirstImpl;
import tv.codely.mooc.courses.domain.CourseRepositoryFirstImpl;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public final class CourseCreatorFirstImplShould {

    @Test
    public void save_a_valid_course() {
        CourseRepositoryFirstImpl repository = mock(CourseRepositoryFirstImpl.class);
        CourseCreatorFirstImpl creator = new CourseCreatorFirstImpl(repository);

        CourseFirstImpl course = new CourseFirstImpl("some-id", "some-name", "some-duration");

        creator.create(course.getId(), course.getName(), course.getDuration());

        verify(repository, atLeastOnce()).save(course);
    }

}
