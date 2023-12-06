//package com.example.ghact.conf;
//
//import com.example.ghact.handlers.HelloHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//@Configuration
//public class MainConf {
//
//    @Bean
//    RouterFunction<ServerResponse> router(HelloHandler helloHandler) {
//
//        return RouterFunctions
//                .route(RequestPredicates.GET("/hello"), helloHandler::hello)
//                ;
//    }
//}
