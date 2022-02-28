package local.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import local.demo.library.LibraryService;
import local.demo.newfeature.NewFeatureService;

@SpringBootApplication(scanBasePackages = "local.demo")
@RestController
public class Application {

  private final LibraryService libraryService;
  private final NewFeatureService newFeatureService;

  public Application(LibraryService libraryService, NewFeatureService newFeatureService) {
    this.libraryService = libraryService;
    this.newFeatureService = newFeatureService;
  }

  @GetMapping("/")
  public String home() {
    return this.libraryService.message();
  }

  @GetMapping("/newfeature")
  public String newfeature() {
    return this.newFeatureService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}