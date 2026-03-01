# Collections
## HashMap
- Used for O(1) retrieval and put
- Implementation Equals and hashCode method
- The keys must be immutable
- Working
  - Based on the hash algorithm, creates a bucket and value is stored in buckets
  - When hash collies, the second value is stored as a list.
  - In Java 8, if the list becomes 8 or more, it is a balanced tree like a red-black tree. Give a performance of O(log N)
  - At 6 elements, reverts back to list.
  - The capacity is doubled if the 75% of the buckets are filled, to avoid having many buckets with multiple values, the 75% is called the load factor and it is the default. The default initial capacity is 75.
  - Null key is stored in bucket zero.
- Summary
  - When we add an element to the map, HashMap calculates the bucket. If the bucket already contains a value, the value is added to the list (or tree) belonging to that bucket. If the load factor becomes bigger than the maximum load factor of the map, the capacity is doubled.
  - When we want to get a value from the map, HashMap calculates the bucket and gets the value with the same key from the list (or tree).
- Resizing
  - When load factor is hit and resizing occurs, hashmap internally does rehashing, it is a O(n) when it uses existing hash and capacity to create new hash, newIndex for the bucket will be between oldIndex and oldIndex + oldCapacity.

## Concurrent HashMap
- It is thread safe 
- Each bucket is an array of nodes 
- Each bucket is locked by locking the first node 
- Reads don’t block 
- initialCapacity and Load factor works similar to HashMap 
- It doesn’t allow null key or value 
- Aggregate/bulk operations like size(), isEmpty(), and iterators are weakly consistent — they don't represent an atomic snapshot of the map, so they may reflect only some of the concurrent modifications happening during their execution.

## TreeMap
- All the keys inserted are sorted in a natural order
- The internal implementation is a red-black tree
- For the sake of order, it sacrifices on speed, it is o(log n)
- Does not allow null 
- Not thread safe

## LinkedHashMap
- It is the same hashmap impl with 2 pointer, doubly-linked list, maintains insertion order.
the penalty for choosing an excessively high value for initial capacity is less severe for LinkedHashMap than for HashMap.
- Capacity and load factor logic remains same.
- Supports an alternative access-order mode (pass true to the 3rd constructor param) — every get() or put() moves the entry to the end, making it ideal for building an LRU cache.

## ArrayList/LinkedList
- LinkedList Doubly Linkedlist implementing list/deque interfaces.
- The insertion, addition and removal operations of an item are faster in a LinkedList
- A LinkedList consumes more memory than an ArrayList because every node in a LinkedList stores two references, one for its previous element and one for its next element, whereas ArrayList holds only data and its index.
- ArrayList wins in almost all real-world scenarios. LinkedList really only shines when you're doing frequent insertions/removals at the head of the list, or when using it as a queue/deque. For general-purpose use, ArrayList is the default choice.

## hashCode() and equals()

- In collections, context especially HashMap context, it is important to know that, if two objects are equal, they must always produce the same hashcode.
When two objects produce same hashCode, they need not be equal.

## Comparable
- Classes implementing Comparable Interface have objects that can be compared.
- These comparable objects can then be compared using Java Sorting.
- 1 means this is greater
- 0 means equals
- -1 means this is lesser
- Important to follow rule: A is greater than B, B is greater than C then A is also greater than C.

## Comparator
- Used to create a compactor component used in Java sorting.
- Sample rules as comparable but this is not part of the object.
- Classes need not implement Comparable to use Comparator, it is a separate component.

## Sort
- Sorting can work on List, LinkedList
- Collections.sort
- The class must have implemented Comparable or must pass a Comparator object.
