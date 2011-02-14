/**
 *  Copyright (C) 2010 dennis zhuang (killme2008@gmail.com)
 *
 *  This library is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation; either version 2.1 of the License, or
 *  (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 **/
package com.googlecode.aviator.runtime.function.math;

import java.util.Map;

import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorFunction;
import com.googlecode.aviator.runtime.type.AviatorObject;


/**
 * math.pow(d1,d2) function
 * 
 * @author dennis
 * 
 */
public class MathPowFunction implements AviatorFunction {

    public AviatorObject call(Map<String, Object> env, AviatorObject... args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("math.pow(base,exp)");
        }
        Number left = FunctionUtils.getNumberValue(0, args, env);
        Number right = FunctionUtils.getNumberValue(1, args, env);
        return new AviatorDouble(Math.pow(left.doubleValue(), right.doubleValue()));

    }


    public String getName() {
        return "math.pow";
    }

}
