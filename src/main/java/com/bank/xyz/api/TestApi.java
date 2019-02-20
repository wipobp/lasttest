package com.bank.xyz.api;


import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-02-20T10:32:50.861Z")

@Api(value = "test", description = "the test API")
public interface TestApi {

    @ApiOperation(value = "", notes = "", response = String.class, tags={ "teszt", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = String.class) })
    @RequestMapping(value = "/test",
        method = RequestMethod.GET)
    default ResponseEntity<String> testGet(@ApiParam(value = "", required = true) @RequestParam(value = "t", required = true) String t



) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
