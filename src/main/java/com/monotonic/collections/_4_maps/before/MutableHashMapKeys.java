package com.monotonic.collections._4_maps.before;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MutableHashMapKeys
{
    public static void main(String[] args)
    {
        var brokenMap = new HashMap<MutableString, String>();

        var value = "abc";

        var key = new MutableString(value);
        brokenMap.put(key, value);

        System.out.println(brokenMap.get(key));
        // abc = {abc}
        System.out.println(brokenMap);
        //key is set to def, but the hashmap key is still abc?
        key.set("def");

        //why would this give null? and not def?
        /*
        However, when you call key.set("def"), you're effectively modifying the key
        object itself. If the key object's hash code or equality has
        changed, the HashMap may not be able to locate the corresponding
        value because it's searching for the key based on its old hash code
        and equality.

        When you print brokenMap.get(key) after changing the key to "def", '
        it returns null because the HashMap cannot find a key "def"
        with the modified key object.
         */
        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);
    }

    private static class MutableString
    {
        private String value;

        public MutableString(final String value)
        {
            set(value);
        }

        public String get()
        {
            return value;
        }

        public void set(final String value)
        {
            Objects.requireNonNull(value);
            this.value = value;
        }

        public boolean equals(final Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final MutableString that = (MutableString) o;

            return value.equals(that.value);
        }

        public int hashCode()
        {
            return value.hashCode();
        }

        public String toString()
        {
            return value;
        }
    }
}
