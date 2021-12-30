package com.cucumber.spring.util;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;



    public void getScreenShot(final String fileName) throws IOException {
        File srcfile = this.driver.getScreenshotAs(OutputType.FILE);
        Files.createDirectories(this.path);
        FileCopyUtils.copy(srcfile, this.path.resolve(fileName).toFile());

    }
}
