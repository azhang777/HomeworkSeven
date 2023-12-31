
![img.png](img.png)
# Collections

Collections refer to data structures that can store objects. The `Collection` interface is the parent of all other interfaces, including Lists, Queue, and Set. Map is not part of the Collection interface but is a part of the Collections framework.

- **Interface and Implementation**: The Collection design includes an interface (e.g., List) and its corresponding implementations (e.g., ArrayList).

- **Interface Functions**: Common methods provided by the Collection interface include `add()`, `remove()`, `size()`, and `contains()`. These methods must be implemented by classes that use the interface.

- **Iterable Interface**: The `Collection` interface extends the `Iterable` interface, which includes the `Iterator` implementation. `Iterator` allows you to loop through a Collection.

# Lists

Lists are ordered collections of values that are indexed numerically. They are a subtype of the Collection interface.

- **List Subtypes**: Examples of List subtypes are `ArrayList`, `LinkedList`, `Vector`, and `Stack`.

- **Index-Based Access**: Each element in a List has an index, which allows for modification using indices.

- **Advantage of ArrayList**: ArrayLists can dynamically resize, unlike regular arrays.

- **Sublist**: The `sublist(inclusive, exclusive)` method returns a portion of the List.

# Maps

Maps are unordered collections of key-value pairs indexed by a key. Unlike Lists, which use numerical indices, Maps use keys to look up values. Map is not part of the Collection interface.

- **Map Interface**: The Map interface includes methods like `get()`, `put()`, `remove()`, and `values()`.

- **Map Implementations**: Some implementations of Map are `HashMap`, `TreeMap`, and `LinkedHashMap`. You can declare a Map to allow switching between implementations.

- **KeySet**: The `keySet()` method returns all keys of the map.

- **Values**: The `values()` method returns all values as a List.

- **Map.EntrySet**: `Map.EntrySet<>` allows you to iterate through a map and use key-value pairs.

- **Map Implementations**: Different Map implementations offer various behaviors: `HashMap` has no guaranteed order, `LinkedHashMap` maintains insertion order, and `TreeMap` sorts keys alphanumerically.

# Sets

Sets are unordered collections of unique values and are a subtype of the Collection interface.

- **Unique Values**: Sets do not allow duplicate values. The `add()` method is overridden to enforce uniqueness.

- **Set Implementations**: Some implementations of Sets are `HashSet`, `TreeSet`, and `EnumSet`.

- **Set Operations**: You can perform operations like finding common elements with `retainAll()` and combining sets with `addAll()` (no duplicates).

- **Sorting**: Sets are easier to sort compared to Lists. You can create a `TreeSet` for automatic sorting.

- **Complex Operations**: For complex set operations, such as union and intersection, consider using Venn diagrams as a visualization tool.

- **Hashcode and Equals**: HashMap and HashSet classes use a hashcode to find an empty slot. This implies that if an object equals another object, both should have the same hashcode and the same slot.
  
# Streams

Provide a way of performing aggregate operations over a collection.

  - **Problem with foreach and iterators:**: They are low-level coding constructs. They involve a lot of boilerplate code whenever we want to use them, which leads to worse readability and maintainability.

  - **Two types of stream operations:**
    - **Intermediate (Everything but last):**: These operations return a stream as a return type. This allows us to chain more streams together, hence the term "intermediate."
    - **Terminal (Last in pipeline):**: Terminal stream operations return the value as a return type. They are the last stream operations within a pipeline and are the ones that end the chain.

  - **The collector:**: The collector is a special terminal operation that allows us to build more complicated and interesting values that result from streams. It tells the stream how to build a particular type of value.

  - **Streams are not always better than loops!**: It's important to note that streams are not always superior to loops. For example, loops work better with checked exceptions.

# Collection Operations and Factories

In the JDK (Java Development Kit), there are various useful utilities and methods for creating different collections without the need for specific interfaces and implementations.

## Factories

Factories are methods that generate new instances of collections, including unmodifiable, immutable, empty, or wrapping collections.

- `Collections.unmodifiableList`: This method creates an unmodifiable list, preventing any modifications. Attempting to remove an object will result in an error.

- `Collections.unmodifiableMap` vs. `Map.copyOf`: Both methods create unmodifiable maps, preventing direct changes. However, `unmodifiableMap` reflects changes within the original map, while `copyOf` does not. It's important to note that `copyOf` does not allow null values.

- `List.of`, `Map.of`, etc.: These methods create immutable collections without the need for explicit instantiation. They provide a convenient way to create read-only collections.

## Operations

Operations in the JDK refer to useful algorithms and actions that can be performed on collections.

- `Collections.rotate` and `Collections.shuffle`: These methods work as their names suggest. `rotate` performs a rotation operation on a list, while `shuffle` shuffles the elements randomly.

## Immutable vs. Unmodifiable

Understanding the difference between immutable and unmodifiable collections is crucial:

- Immutable collections cannot be changed once they are created. They are like locked objects.

- Unmodifiable collections provide a protected view of the original collection and cannot be changed directly. They reflect changes in the original collection.

In summary, the JDK provides a variety of tools and methods for working with collections, allowing you to create and manipulate them effectively.

