package hello.proxy.app.v2;

import hello.proxy.utils.DevUtils;

import static hello.proxy.utils.DevUtils.*;

public class OrderRepositoryV2 {

    public void save(String itemId) {
        // 저장 로직
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생");
        }
        sleep(1000);
    }
}
