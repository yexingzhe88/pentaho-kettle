/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.core.row.value;

import org.pentaho.di.core.exception.KettleValueException;
import org.pentaho.di.core.row.ValueMetaInterface;

public class ValueMetaNumber extends ValueMetaBase implements ValueMetaInterface {

  public ValueMetaNumber() {
    this( null );
  }

  public ValueMetaNumber( String name ) {
    super( name, ValueMetaInterface.TYPE_NUMBER );
  }

  public ValueMetaNumber( String name, int length, int precision ) {
    super( name, ValueMetaInterface.TYPE_NUMBER, length, precision );
  }

  @Override
  public Object getNativeDataType( Object object ) throws KettleValueException {
    return getNumber( object );
  }

  @Override
  public Class<?> getNativeDataTypeClass() throws KettleValueException {
    return Double.class;
  }
}
