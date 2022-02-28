package local.demo.newfeature;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class NewFeatureService {

    @Autowired
	private final NewFeatureController newFeatureController;

	public NewFeatureService(NewFeatureController newFeatureController) {
		this.newFeatureController = newFeatureController;
	}

	public String message() {
		return this.newFeatureController.GetDatbaseValue();
	}

}
