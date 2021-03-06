/*
 * Copyright (c) 2012, by Michal Ciebiada
 * This is not open source. Redistribution in any form is forbidden.
 */

package com.ciebiada.reddot.math;

public class OBasis {

    public Vec u, v, w;

    public OBasis(Vec w) {
        this.w = w;

        if (Math.abs(w.x) > Math.abs(w.y)) {
            Vec tmp = new Vec(0, 1, 0);
            u = w.cross(tmp);
            v = u.cross(w);
        } else {
            Vec tmp = new Vec(1, 0, 0);
            v = tmp.cross(w);
            u = w.cross(v);
        }
    }

    public Vec transform(float x, float y, float z) {
        return u.mul(x).add(v.mul(y)).add(w.mul(z));
    }

    public Vec transform(Vec vec) {
        return transform(vec.x, vec.y, vec.z);
    }
}
