package com.robin;

import com.robin.resource.SuggestedTimesResource;
import com.robin.service.SuggestedTimesService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BackendChallengeApplication extends Application<BackendChallengeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BackendChallengeApplication().run(args);
    }

    @Override
    public String getName() {
        return "backend-challenge";
    }

    @Override
    public void initialize(final Bootstrap<BackendChallengeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final BackendChallengeConfiguration configuration,
                    final Environment environment) {
        final SuggestedTimesResource resource = new SuggestedTimesResource(new SuggestedTimesService());
        environment.jersey().register(resource);
    }

}
