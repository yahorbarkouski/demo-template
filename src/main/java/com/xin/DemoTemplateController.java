package com.xin;

import io.micronaut.http.annotation.*;

@Controller("/demoTemplate")
public class DemoTemplateController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}