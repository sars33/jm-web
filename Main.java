import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.MainServlet;
import servlets.NewServlet;


public class Main {
    public static void main(String[] args) throws Exception {
       // MainServlet mainServlet = new MainServlet();
        NewServlet newServlet = new NewServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(newServlet), "/");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
