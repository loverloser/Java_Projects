package com.labanovich.dmdev.Generics;

public final class PairUtil {
    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        V value = pair.getValue();
        K key = pair.getKey();
        return new Pair<>(value, key);
    }
}
