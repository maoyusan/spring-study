package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public class Hello {

    @Autowired
    @Qualifier(value = "name")
    private Hi name;


    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Hi getName() {
        return name;
    }

    public void setName(Hi name) {
        this.name = name;
    }
}
