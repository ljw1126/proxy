package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements Component {

    private final Component target;

    public TimeDecorator(Component target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();

        String result = target.operation();

        long endTime = System.currentTimeMillis();
        long totalMillis = endTime - startTime;
        log.info("TimeDecorator 종료 = {}ms", totalMillis);

        return result;
    }
}
