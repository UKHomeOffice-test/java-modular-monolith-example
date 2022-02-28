package local.demo.newfeature;

import org.springframework.stereotype.Component;

@Component("newFeatureController")
class NewFeatureController {

    private String SomeDatabaseValue;

    NewFeatureController() {
        this.SomeDatabaseValue = "Retrieved database value";
    }

    String GetDatbaseValue() {
        return this.SomeDatabaseValue;
    }

}