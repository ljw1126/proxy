package hello.proxy.pureproxy.concreteproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeProxy extends ConcreteLogic {
    private ConcreteLogic concreteLogic;

    public TimeProxy(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();

        String result = concreteLogic.operation();

        long endTime = System.currentTimeMillis();
        long totalMillis = endTime - startTime;
        log.info("TimeDecorator 종료 = {}ms", totalMillis);

        return result;
    }
}
