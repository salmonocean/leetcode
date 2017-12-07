package com.leetcode.algorithm._146;

import java.util.HashMap;

/**
 * @see https://leetcode.com/problems/lru-cache/description/
 * Tag: Double linked list
 * Tag: HashMap
 */
public class LRUCache {
    int size;
    DoubleLinkList<Integer> cache = new DoubleLinkList<Integer>();
    HashMap<Integer, DoubleLinkList.Link<Integer>> map = new HashMap<>();

    public LRUCache(int capacity) {
        size = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoubleLinkList.Link<Integer> node = map.get(key);

            cache.remove(node);
            cache.addFirst(node);

            return node.value;
        } else {
            return -1;
        }
    }

    public void set(int key, int value) {
        DoubleLinkList.Link<Integer> node;

        if (!map.containsKey(key)) {
            if (cache.size() < size) {
                node = cache.addFirst(key, value);
            } else {
                node = cache.removeLast();
                map.remove(node.key);

                node.key = key;
                node.value = value;
                node = cache.addFirst(node);
            }

            map.put(key, node);
        } else {
            node = map.get(key);
            node.value = value;

            cache.remove(node);
            cache.addFirst(node);
        }
    }

    static class DoubleLinkList<T> {
        static class Link<T> {
            Link prev, next;
            T key;
            T value;

            public Link(Link prev, Link next, T key, T value) {
                this.prev = prev;
                this.next = next;
                this.key = key;
                this.value = value;
            }
        }

        private Link<T> voidLink = new Link(null, null, null, null);
        int size = 0;

        public DoubleLinkList() {
            voidLink.prev = voidLink;
            voidLink.next = voidLink;
        }

        public Link<T> addFirst(T key, T value) {
            Link<T> first = new Link<>(null, null, key, value);

            addFirst(first);

            return first;
        }

        public Link<T>  addFirst(Link<T> first) {
            Link<T> oldFirst = voidLink.next;
            first.prev = voidLink;
            first.next = oldFirst;

            voidLink.next = first;
            oldFirst.prev = first;

            size++;

            return first;
        }

        public Link<T> addLast(T key, T value) {
            Link<T> last = new Link<>(null, null, key, value);

            addLast(last);

            return last;
        }

        public Link<T> addLast(Link<T> last) {
            Link<T> oldLast = voidLink.prev;
            last.prev = oldLast;
            last.next = voidLink;

            voidLink.prev = last;
            oldLast.next = last;

            size++;

            return last;
        }

        public Link<T> removeLast() {
            return remove(voidLink.prev);
        }

        public Link<T> remove(Link<T> node) {
            Link<T> prev = voidLink.prev;

            if (prev != voidLink) {
                node.prev.next = node.next;
                node.next.prev = node.prev;

                node.prev = null;
                node.next = null;

                size--;
            }

            return node;
        }

        public int size() {
            return size;
        }
    }
}
