package tv.codely.apps.mooc.backend.controller.courses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreatorFirstImpl;

@RestController
public final class CoursesPutControllerFirstImpl {
    private CourseCreatorFirstImpl creator;

    public CoursesPutControllerFirstImpl(CourseCreatorFirstImpl creator) {
        this.creator = creator;
    }

    @PutMapping(value = "/courses/{id}")
    public ResponseEntity<String> index(@PathVariable String id, @RequestBody RequestFirstImpl request) {
        creator.create(id, request.name(), request.name());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

final class RequestFirstImpl {
    private String name;
    private String duration;

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    String duration() {
        return duration;
    }
}
