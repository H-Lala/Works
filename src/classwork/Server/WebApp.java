package classwork.Server;

import classwork.Server.Servlet.CalcServlet;
import classwork.Server.Servlet.HelloServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        HelloServlet helloServlet = new HelloServlet();
        CalcServlet calcServlet = new CalcServlet();
        ServletContextHandler servletHandler = new ServletContextHandler();
        servletHandler.addServlet(new ServletHolder(calcServlet),"/calc/*");
        servletHandler.addServlet(HelloServlet.class, "/hello/*");
        server.setHandler(servletHandler);
        server.start();
        server.join();
    }
}
