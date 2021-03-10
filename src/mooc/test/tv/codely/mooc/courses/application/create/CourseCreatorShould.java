package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.CoursesModuleUnitTestCase;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseMother;
import tv.codely.mooc.courses.domain.CreateCourseRequestMother;


public final class CourseCreatorShould extends CoursesModuleUnitTestCase {

    private CourseCreator creator;

    @BeforeEach
    protected void beforeEch() {
        super.setUp();

        creator = new CourseCreator(repository);

    }

    @Test
    public void save_a_valid_course() {
        CreateCourseRequest request = CreateCourseRequestMother.random();

        Course course = CourseMother.fromRequest(request);

        creator.create(request);

        shouldHaveSaved(course);
    }

}
