package org.apache.hadoop.metrics2.sink.ganglia;

import org.apache.hadoop.metrics2.sink.ganglia.AbstractGangliaSink.GangliaSlope;

/**
 * class which is used to store ganglia properties
 */
class GangliaConf {
  private String units = AbstractGangliaSink.DEFAULT_UNITS;
  private GangliaSlope slope;
  private int dmax = AbstractGangliaSink.DEFAULT_DMAX;
  private int tmax = AbstractGangliaSink.DEFAULT_TMAX;

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder();
    buf.append("unit=").append(units).append(", slope=").append(slope)
        .append(", dmax=").append(dmax).append(", tmax=").append(tmax);
    return buf.toString();
  }

  /**
   * @return the units
   */
  String getUnits() {
    return units;
  }

  /**
   * @param units the units to set
   */
  void setUnits(String units) {
    this.units = units;
  }

  /**
   * @return the slope
   */
  GangliaSlope getSlope() {
    return slope;
  }

  /**
   * @param slope the slope to set
   */
  void setSlope(GangliaSlope slope) {
    this.slope = slope;
  }

  /**
   * @return the dmax
   */
  int getDmax() {
    return dmax;
  }

  /**
   * @param dmax the dmax to set
   */
  void setDmax(int dmax) {
    this.dmax = dmax;
  }

  /**
   * @return the tmax
   */
  int getTmax() {
    return tmax;
  }

  /**
   * @param tmax the tmax to set
   */
  void setTmax(int tmax) {
    this.tmax = tmax;
  }
}