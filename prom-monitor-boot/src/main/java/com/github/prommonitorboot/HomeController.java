package com.github.prommonitorboot;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HomeController {

    private final Counter homeRequests;

    public HomeController(MeterRegistry meterRegistry) {
       homeRequests = Counter.builder("home_views")
                .baseUnit("times")
                .description("Counts the total number of requests to home controller.")
                .tags("controller", "home")
                .register(meterRegistry);

    }

    @RequestMapping(value = "/")
    public Map<String, String> home(){
        homeRequests.increment();
        return Collections.singletonMap("hello", "world");
    }

}
