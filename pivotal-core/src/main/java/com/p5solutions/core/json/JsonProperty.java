/* Pivotal 5 Solutions Inc. - Core Java library for all other Pivotal Java Modules.
 * 
 * Copyright (C) 2011  KASRA RASAEE
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */
package com.p5solutions.core.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JsonProperty: Used to identify the type when deserializing. This is most
 * useful when trying to identify the type of element within an array. An
 * example would to be to deserialize into List<XYZ> where
 * 
 * @JsonProperty(value=XYZ.class)
 * 
 * @author Kasra Rasaee
 * @since 2010-04-10
 * 
 * @see JsonDeserializer
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER })
@Inherited
public @interface JsonProperty {
	Class<?> value();
}
