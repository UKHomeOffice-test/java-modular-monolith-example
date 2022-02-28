package local.demo.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootTest("service.message=Hello")
class LibraryServiceTests {

	@Autowired
	private LibraryService libraryService;

	@Test
	public void contextLoads() {
		assertThat(libraryService.message()).isNotNull();
	}

	@SpringBootApplication
	static class TestConfiguration {
	}
}
