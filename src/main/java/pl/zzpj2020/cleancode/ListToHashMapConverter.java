package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToHashMapConverter {

    private Map<Integer, Integer> numberOfOccurrenceForGivenKey = new HashMap<Integer, Integer>();
    private int minKey = Integer.MAX_VALUE;
    private int maxKey = Integer.MIN_VALUE;

    public ListToHashMapConverter(List<Integer> integerList) {
        addListToMap(integerList);
    }

    private void addListToMap(List<Integer> integerList) {

        for (Integer integer : integerList) {
            increaseValueForKey(integer);
        }
    }

    private void increaseValueForKey(Integer key) {
        if (numberOfOccurrenceForGivenKey.containsKey(key)) {
            Integer value = numberOfOccurrenceForGivenKey.get(key);
            numberOfOccurrenceForGivenKey.put(key, value + 1);
        } else {
            numberOfOccurrenceForGivenKey.put(key, 1);
        }

        if (key > getMaxKey()) {
            setMaxKey(key);
        }

        if (key < getMinKey()) {
            setMinKey(key);
        }
    }


    private void setMinKey(int newMinValue) {
        minKey = newMinValue;
    }

    private void setMaxKey(int newMaxValue) {
        maxKey = newMaxValue;
    }

    public int getMinKey() {
        return minKey;
    }

    public int getMaxKey() {
        return maxKey;
    }

    public Map<Integer, Integer> getHashMap() {
        return new HashMap<>(numberOfOccurrenceForGivenKey);
    }

}