package example.micronaut;

import java.util.List;

import example.model.response.Sample;
import example.service.SampleService;
import example.service.SampleServiceImpl;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/sample")
public class HelloController {

    SampleService sampleService = new SampleServiceImpl();

    @Get("/") // <2>
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sample> index() {
        List<Sample> sampleList = sampleService.getSampleList();
        return sampleList;
    }
}
