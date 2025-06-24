package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            if (!res.containsKey(value) || res.get(value) > key) {
                res.put(value, key);
            }
        }
        return res;
    }
}
