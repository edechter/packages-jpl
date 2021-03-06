package jpl.fli;

/**
 * A Long Holder merely holds a long value.
 * 
 * <hr>
 * <i> Copyright (C) 1998 Fred Dushin
 * <p>
 * 
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Library Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * <p>
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Library Public License for more details.
 * <p>
 * </i>
 * <hr>
 * 
 * @author Fred Dushin <fadushin@syr.edu>
 * @version $Revision$
 */
public class LongHolder {
	public long value = 0L;

	public boolean equals(LongHolder lh) {
		return lh.value == this.value;
	}
}
