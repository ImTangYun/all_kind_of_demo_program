package test;

import org.apache.thrift.TException;

/**
 * Created by tangyun on 16/11/3.
 */
public class HelloServiceHandler implements HelloService.Iface {

    public String ping() throws TException {
        return "hello";
    }
}
