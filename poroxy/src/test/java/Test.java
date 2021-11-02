import javax.xml.ws.Holder;

public class Test {
    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy(new Host());
        HostInterFace host = (HostInterFace) myProxy.getClassObject();
        host.a();
        System.out.println("host = " + host);
    }
}
