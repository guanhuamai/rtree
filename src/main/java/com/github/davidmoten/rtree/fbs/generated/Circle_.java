// automatically generated by the FlatBuffers compiler, do not modify

package com.github.davidmoten.rtree.fbs.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;

import com.github.davidmoten.rtree.geometry.*;
import com.github.davidmoten.rtree.internal.util.ObjectsHelper;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Circle_ extends Struct implements Circle {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Circle_ __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float radius() { return bb.getFloat(bb_pos + 8); }

  public static int createCircle_(FlatBufferBuilder builder, float x, float y, float radius) {
    builder.prep(4, 12);
    builder.putFloat(radius);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }

  @Override
  public boolean intersects(Circle c) {
    return Circle.Helper.intersects(this, c);
  }

  @Override
  public boolean intersects(Point point) {
    return Circle.Helper.intersects(this, point);
  }

  @Override
  public boolean intersects(Line line) {
    return Circle.Helper.intersects(this, line);
  }

  @Override
  public double distance(Rectangle r) {
    return Circle.Helper.distance(this, r);
  }

  @Override
  public Rectangle mbr() {
    return Circle.Helper.mbr(this);
  }

  @Override
  public boolean intersects(Rectangle r) {
    return Circle.Helper.intersects(this, r);
  }

  @Override
  public String toString() {
    return Circle.Helper.toString(this);
  }

  @Override
  public int hashCode() {
    return Circle.Helper.hashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    com.github.davidmoten.guavamini.Optional<Circle_> other = ObjectsHelper.asClass(obj, Circle_.class);
    if (other.isPresent()) {
      return Circle.Helper.equals(this, other.get());
    } else
      return false;
  }
}

