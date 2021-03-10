package tv.codely.mooc.courses.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


final class InMemoryCourseRepositoryShould {
    @Test
    void save_a_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        repository.save(new Course("some-id", "some-name", "some-duration"));
    }

    @Test
    void return_an_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        Course course = new Course("some-id", "some-name", "some-duration");

        repository.save(course);

        assertEquals(Optional.of(course), repository.search(course.getId()));
    }

    @Test
    void not_return_a_non_existing_course() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();

        assertFalse(repository.search("non-existing-id").isPresent());
    }
}
