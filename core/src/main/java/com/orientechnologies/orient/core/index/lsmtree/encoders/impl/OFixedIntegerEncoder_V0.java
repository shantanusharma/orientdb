/*
 *
 *  *  Copyright 2010-2016 OrientDB LTD (http://orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://orientdb.com
 *
 */
package com.orientechnologies.orient.core.index.lsmtree.encoders.impl;

import com.orientechnologies.orient.core.index.lsmtree.encoders.OEncoder;
import com.orientechnologies.orient.core.index.lsmtree.encoders.OIntegerEncoder;
import com.orientechnologies.orient.core.index.lsmtree.encoders.OUnsignedIntegerEncoder;

/**
 * @author Sergey Sitnikov
 */
public class OFixedIntegerEncoder_V0 implements OIntegerEncoder, OUnsignedIntegerEncoder {

  @Override
  public int version() {
    return 0;
  }

  @Override
  public int minimumSize() {
    return 4;
  }

  @Override
  public int maximumSize() {
    return 4;
  }

  @Override
  public int exactSize(Integer value) {
    return 4;
  }

  @Override
  public void encode(Integer value, OEncoder.Stream stream) {
    encodeInteger(value, stream);
  }

  @Override
  public int exactSizeInStream(OEncoder.Stream stream) {
    return 4;
  }

  @Override
  public Integer decode(OEncoder.Stream stream) {
    return decodeInteger(stream);
  }

  @Override
  public int exactSizeInteger(int value) {
    return 4;
  }

  @Override
  public void encodeInteger(int value, Stream stream) {
    stream.writeInteger(value);
  }

  @Override
  public int decodeInteger(Stream stream) {
    return stream.readInteger();
  }

}