package java.util;
import dataflow.quals.Pure;

import checkers.nullness.quals.Nullable;

// Subclasses of this interface/class may opt to prohibit null elements
public abstract class Dictionary<K extends @Nullable Object, V extends @Nullable Object> {
  public Dictionary() { throw new RuntimeException("skeleton method"); }
  @Pure public abstract int size();
  @Pure public abstract boolean isEmpty();
  public abstract Enumeration<K> keys();
  public abstract Enumeration<V> elements();
  public abstract @Pure @Nullable V get(@Nullable Object a1);
  public abstract @Nullable V put(K a1, V a2);
  public abstract @Nullable V remove(Object a1);
}
