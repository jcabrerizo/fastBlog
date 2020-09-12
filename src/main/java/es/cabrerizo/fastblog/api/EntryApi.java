package es.cabrerizo.fastblog.api;

import es.cabrerizo.fastblog.api.model.EntryDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;

@Api("Entry")
@RequestMapping(value = "/entry", produces = MediaType.APPLICATION_JSON_VALUE)
public interface EntryApi {

    @PostMapping
    @ApiOperation(value = "Insert new entry on the database")
    void createEntry(
            @ApiParam(name = "newEntry", value = "Entry dto to be persisted")
                    EntryDto newEntry
    );

    @PutMapping
    @ApiOperation(value = "Updates an entry on the database")
    void editEntry(
            @ApiParam(name = "existingEntry", value = "Entry dto to be updated")
                    EntryDto existingEntry
    );

    @DeleteMapping
    @ApiOperation(value = "Removes an entry from the database")
    void deleteEntry(
            @ApiParam(name = "idEntry", value = "idEntry to be removed")
                Integer idEntry
    );

    @GetMapping("/{idEntry}")
    @ApiOperation(value = "Returns an existing entry on the database")
    EntryDto getEntry(
            @ApiParam(name = "idEntry", value = "idEntry to be returned")
            @PathVariable Integer idEntry);

    @GetMapping("/list")
    @ApiOperation(value = "Returns all entries from the database")
    List<EntryDto> getEntries();

}
