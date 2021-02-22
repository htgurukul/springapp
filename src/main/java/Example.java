import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@EnableAutoConfiguration
public class Example {

@Autowired
Environment environment;
@RequestMapping("/")
String testConnection(){
    return "Version V1 !! Your server is up and running at port: "+environment.getProperty("local.server.port");
}



public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
