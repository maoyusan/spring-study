import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    Object classObject;


    public MyProxy(Object classObject) {
        this.classObject = classObject;
    }

    public Object getClassObject() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), classObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(classObject, args);
    }

}
