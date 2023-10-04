package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;

/** Provide an cyclic {@link Iterator} for a {@link NavigableMap}.
 * The {@link Iterator} navigates the entries of the map
 * according to the map's ordering.
 * If the {@link Iterator} hits the last entry of the map,
 * it will then continue from the first entry.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class CyclicIteration<K, V> implements Iterable<Map.Entry<K, V>> {
    private final NavigableMap<K, V> navigablemap;
    private final NavigableMap<K, V> tailmap;

    /** Construct an {@link Iterable} object,
     * so that an {@link Iterator} can be created  
     * for iterating the given {@link NavigableMap}.
     * The iteration begins from the starting key exclusively.
     */
    public CyclicIteration(NavigableMap<K, V> navigablemap, K startingkey) {
        if (navigablemap == null || navigablemap.isEmpty()) {
            this.navigablemap = null;
            this.tailmap = null;
        } else {
            this.navigablemap = navigablemap;
            this.tailmap = navigablemap.tailMap(startingkey, false);
        }
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new CyclicIterator();
    }

    /** An {@link Iterator} for {@link CyclicIteration}. */
    private class CyclicIterator implements Iterator<Map.Entry<K, V>> {
        /** The first entry to begin. */
        private final Map.Entry<K, V> first;
        private boolean hasnext;
        private Iterator<Map.Entry<K, V>> i;
        /** The next entry. */
        private Map.Entry<K, V> next;

        private CyclicIterator() {
            hasnext = navigablemap != null;
            if (hasnext) {
                i = tailmap.entrySet().iterator();
                first = nextEntry();
                next = first;
            } else {
                i = null;
                first = null;
                next = null;
            }
        }

        private Map.Entry<K, V> nextEntry() {
            if (!i.hasNext()) {
                i = navigablemap.entrySet().iterator();
            }
            return i.next();
        }

        @Override
        public boolean hasNext() {
            return hasnext;
        }

        @Override
        public Map.Entry<K, V> next() {
            if (!hasnext) {
                throw new NoSuchElementException();
            }

            final Map.Entry<K, V> curr = next;
            next = nextEntry();
            hasnext = !next.equals(first);
            return curr;
        }

        /** Not supported */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}
