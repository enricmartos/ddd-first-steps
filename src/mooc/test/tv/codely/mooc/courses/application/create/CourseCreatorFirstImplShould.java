package tv.codely.mooc.courses.application.create;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tv.codely.mooc.courses.domain.CourseFirstImpl;
import tv.codely.mooc.courses.domain.CourseRepositoryFirstImpl;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public final class CourseCreatorFirstImplShould {

    @Test
    public void save_a_valid_course() throws Exception {
        // Implementación de CourseRepositoryFirstImpl creada al vuelo mediante el Mock
        CourseRepositoryFirstImpl repository = mock(CourseRepositoryFirstImpl.class);
        CourseCreatorFirstImpl creator = new CourseCreatorFirstImpl(repository);

        CourseFirstImpl course = new CourseFirstImpl("some-id", "some-name", "some-duration");

        creator.create(course.getId(), course.getName(), course.getDuration());

        // verificar que almenos se llama una vez al método save del repo
        verify(repository, atLeastOnce()).save(course);
    }

}
