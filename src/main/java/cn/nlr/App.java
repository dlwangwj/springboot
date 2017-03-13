package cn.nlr;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
    public static void main( String[] args )
    {
    	SpringApplication application = new SpringApplication(App.class);

        /*

         * Banner.Mode.OFF:关闭;

         * Banner.Mode.CONSOLE:控制台输出，默认方式;

         * Banner.Mode.LOG:日志输出方式;

         */
         application.setBannerMode(Banner.Mode.OFF); 
         application.run(args); 
        System.out.println( "Hello World!" );
    }
}
