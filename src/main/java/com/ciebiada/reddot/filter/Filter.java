/*
 * Copyright (c) 2012, by Michal Ciebiada
 * This is not open source. Redistribution in any form is forbidden.
 */

package com.ciebiada.reddot.filter;

import com.ciebiada.reddot.math.Sample;

public interface Filter {

    Sample transform(Sample sample);
}
