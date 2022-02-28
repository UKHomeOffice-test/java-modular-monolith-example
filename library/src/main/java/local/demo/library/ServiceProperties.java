package local.demo.library;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
class ServiceProperties {

  /**
   * A message for the service.
   */
  private String message;

  String getMessage() {
    return message;
  }

  void setMessage(String message) {
    this.message = message;
  }
}