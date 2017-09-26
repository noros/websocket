package wserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.inject.Inject;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Inject
  public ServletContextAware endpointExporterInitializer(final ApplicationContext applicationContext) {
    return servletContext -> {
      ServerEndpointExporter exporter = new ServerEndpointExporter();
      exporter.setApplicationContext(applicationContext);
      exporter.afterPropertiesSet();
    };
  }
}
