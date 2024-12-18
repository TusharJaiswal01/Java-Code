import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
    }
}





import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getInt("age"));
        }
        con.close();
    }
}





<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<body>
    <h2>Welcome to JSP</h2>
    <p>Current Date: <%= new java.util.Date() %></p>
</body>
</html>





public class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}


import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello, Advanced Java!");
        writer.close();
    }
}



import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Client says: " + in.readLine());
    }
}


import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class AnnotationExample {
    @MyAnnotation(value = "Hello, Annotation!")
    public void sayHello() {
        System.out.println("This is an annotated method");
    }

    public static void main(String[] args) throws Exception {
        Method m = AnnotationExample.class.getMethod("sayHello");
        MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}



import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Advanced", "Code");
        list.forEach(s -> System.out.println(s));
    }
}