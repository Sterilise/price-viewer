package com.start.priceviewer.version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    private final String version;

    @Autowired
    public VersionController(@Value("${app.version}") String version) {
        this.version = version;
    }

    @GetMapping
    public String getVersion() {
        return this.version;
    }
}
