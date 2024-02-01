package Generics;
import java.util.*;
public class CustomClass<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addEle(T ele){
        list.add(ele);
    }
    public void removeEle(T ele){
        list.remove(ele);
    }

    public String toString(){
        return list.toString();
    }
}
