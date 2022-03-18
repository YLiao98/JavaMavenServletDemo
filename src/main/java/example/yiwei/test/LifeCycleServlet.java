package example.yiwei.test;
import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycleServlet implements Servlet {
    ServletConfig config = null;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        config = servletConfig;
        System.out.println("Init process...");

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<h2>this is from clicked button<h2>");
        System.out.println("Service process...");
    }

    @Override
    public String getServletInfo() {
        return "LifeCycleServlet";
    }

    @Override
    public void destroy() {

    }

    public ServletConfig getServletConfig(){
        return config;
    }
}
