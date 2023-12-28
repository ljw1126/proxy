package hello.proxy.pureproxy.proxy.code;

import hello.proxy.utils.DevUtils;
import lombok.extern.slf4j.Slf4j;

import static hello.proxy.utils.DevUtils.*;

@Slf4j
public class RealSubject implements Subject {
    @Override
    public String operation() {
        log.info("실제 객체 호출");
        sleep(1000);
        return "data";
    }
}
