package his.rec.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SpringFox {
    // @Bean
    // public Docket api() {
    //     return new Docket(DocumentationType.SWAGGER_2)
    //         .select()
    //         .apis(RequestHandlerSelectors.basePackage("com.localdev.springboot.flexstudio"))
    //             .paths(regex("/api/v1.*")).build().apiInfo(apiInfo() )
    //             .securitySchemes(Collections.singletonList(securitySchema()))
    //             .securityContexts(Collections.singletonList(securityContext())).pathMapping("/")
    //             .useDefaultResponseMessages(true);
    // }
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                         
          .build();                                           
    }
    
}