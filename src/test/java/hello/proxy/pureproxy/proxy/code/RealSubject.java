package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

import static hello.proxy.utils.DevUtils.sleep;

@Slf4j
public class RealSubject implements Subject {
    @Override
    public String operation() {
        log.info("실제 객체 호출");
        sleep(1000);
        return "data";
    }
}
