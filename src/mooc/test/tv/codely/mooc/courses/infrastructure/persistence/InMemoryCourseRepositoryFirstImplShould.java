package tv.codely.mooc.courses.infrastructure.persistence;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.CourseFirstImpl;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


final class InMemoryCourseRepositoryFirstImplShould {
    @Test
    void save_a_course() {
        InMemoryCourseRepositoryFirstImpl repository = new InMemoryCourseRepositoryFirstImpl();

        // ausencia de excepciones verifica que el test es correcto
        repository.save(new CourseFirstImpl("some-id", "some-name", "some-duration"));
    }

    @Test
    void return_an_existing_course() {
        InMemoryCourseRepositoryFirstImpl repository = new InMemoryCourseRepositoryFirstImpl();

        CourseFirstImpl course = new CourseFirstImpl("some-id", "some-name", "some-duration");

        repository.save(course);

        assertEquals(Optional.of(course), repository.search(course.getId()));
    }

    @Test
    void not_return_a_non_existing_course() {
        InMemoryCourseRepositoryFirstImpl repository = new InMemoryCourseRepositoryFirstImpl();

        Assert.assertFalse(repository.search("non-existing-id").isPresent());
    }
}
