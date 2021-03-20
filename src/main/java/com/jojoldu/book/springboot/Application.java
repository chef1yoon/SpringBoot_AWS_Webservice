package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트의 자동 설정, 스프링Bean읽기와 생성을 모두 자동으로 설정됩니다.
                       // @SpringBootApplication이 있는 위치부터 설정을 읽어야 하기 때문에 이 클래스는 항장 프로젝트의 최상단에 위치해야만 합니다.

public class Application { //프로젝트의 메인 클래스입니다.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //SpringApplication.run으로 인해 내장 WAS를 실행합니다.
                                                        //이렇게 되면 항상 서버 톰캣을 설치할 필요가 없게되고, 스프링 부트로 만들어진 Jar파일로 실행하면 됩니다.

    }
}

//꼭 스프링 부트에서만 내장 WAS를 사용할 수 있는것은 아니지만, 스프링 부트에서는 내장 WAS를 사용하는것을 권장하고 있습니다. 왜냐하면 언제 어디서나 같은 환경에서 스프링부트를 배포할 수 있기 때문입니다.
