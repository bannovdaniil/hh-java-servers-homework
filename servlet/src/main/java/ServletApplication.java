import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import resourse.ResourceCounter;

public class ServletApplication {
  private final static int PORT = 8081;

  public static void main(String[] args) throws Exception {
    Server server = createServer();
    server.start();
    server.join();
  }

  private static Server createServer() {
    Server server = new Server(PORT);
    ServletHandler servletHandler = new ServletHandler();
    servletHandler.addServletWithMapping(ResourceCounter.class, "/");
    server.setHandler(servletHandler);
    return server;
  }
}
