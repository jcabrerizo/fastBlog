package es.cabrerizo.fastblog.api.resource;

import es.cabrerizo.fastblog.api.HelloApi;
import es.cabrerizo.fastblog.api.model.MessageDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource implements HelloApi {
    @Override
    public MessageDto hello(){
        return new MessageDto("Hello");
    }
}
