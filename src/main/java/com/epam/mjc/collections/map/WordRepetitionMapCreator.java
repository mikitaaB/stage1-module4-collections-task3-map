package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();
        String[] words = sentence.toLowerCase().split("[^\\p{L}]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                res.put(word, res.getOrDefault(word, 0) + 1);
            }
        }
        return res;
    }
}
