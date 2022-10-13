/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lagon
 */
public class Histogram<T> {
    
    private final Map<T, Integer> map = new HashMap<T, Integer>();
    
    public Integer get(T key){
        return this.map.get(key);
    }
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T key){
        map.put(key, this.map.containsKey(key) ? this.map.get(key) + 1 : 1);
    }
    
}
