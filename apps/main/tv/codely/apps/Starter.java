package tv.codely.apps;

import org.springframework.boot.SpringApplication;
import tv.codely.apps.mooc.backend.MoocBackendApplication;

import java.util.HashMap;

public class Starter {
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new RuntimeException("There are not enough arguments");
        }

        String  applicationName = args[0];

        ensureApplicationExist(applicationName);

        Class<?> applicationClass = applications().get(applicationName);

        SpringApplication app = new SpringApplication(applicationClass);

        app.run(args);
    }

    private static void ensureApplicationExist(String applicationName) {
        if (!applications().containsKey(applicationName)) {
            throw new RuntimeException(String.format(
                "The application <%s> doesn't exist. Valids:\n- %s",
                applicationName,
                String.join("\n- ", applications().keySet())
            ));
        }
    }

    private static HashMap<String, Class<?>> applications() {
        HashMap<String, Class<?>> applications = new HashMap<>();

        applications.put("mooc_backend", MoocBackendApplication.class);

        return applications;
    }

}
