package es.cabrerizo.fastblog.api;

import es.cabrerizo.fastblog.api.model.MessageDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api("Hello")
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public interface HelloApi {

    @ApiOperation(value = "Says 'Hello'")
    @GetMapping
    MessageDto hello();
}
