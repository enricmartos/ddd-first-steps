package tv.codely.mooc.courses.domain;

import java.util.Objects;

public class Course {
    private String id;
    private String name;
    private String duration;

    public Course(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String duration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course that = (Course) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(duration, that.duration);
    }

    @Override
    public String toString() {
        return "CourseFirstImpl{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", duration='" + duration + '\'' +
            '}';
    }
}
