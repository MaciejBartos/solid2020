package pl.zzpj2020.cleancode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class DoItTest {

    @Test
    public void increaseValueForKey() {
        List<Integer> listOfKeys = new ArrayList<>();
        listOfKeys.add(2);
        listOfKeys.add(3);
        listOfKeys.add(3);

        ListToHashMapConverter listToHashMapConverter = new ListToHashMapConverter(listOfKeys);
        Map<Integer, Integer> map = listToHashMapConverter.getHashMap();

        assertEquals(1, (int) map.get(2));
        assertEquals(2, (int) map.get(3));
    }

    @Test
    public void getMinKey() {
        List<Integer> listOfKeys = new ArrayList<>();
        listOfKeys.add(2);
        listOfKeys.add(3);
        listOfKeys.add(3);
        listOfKeys.add(5);

        ListToHashMapConverter listToHashMapConverter = new ListToHashMapConverter(listOfKeys);
        Assert.assertEquals(2, listToHashMapConverter.getMinKey());

    }

    @Test
    public void getMaxKey() {
        List<Integer> listOfKeys = new ArrayList<>();
        listOfKeys.add(2);
        listOfKeys.add(3);
        listOfKeys.add(5);
        listOfKeys.add(3);

        ListToHashMapConverter listToHashMapConverter = new ListToHashMapConverter(listOfKeys);
        Assert.assertEquals(5, listToHashMapConverter.getMaxKey());
    }
}