package tv.codely.mooc.courses.domain;

import java.util.Objects;

public class CourseFirstImpl {
    private String id;
    private String name;
    private String duration;

    public CourseFirstImpl(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseFirstImpl that = (CourseFirstImpl) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(duration, that.duration);
    }

}
