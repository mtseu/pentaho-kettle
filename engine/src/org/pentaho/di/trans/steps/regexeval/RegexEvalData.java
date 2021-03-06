/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
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

package org.pentaho.di.trans.steps.regexeval;

import java.util.regex.Pattern;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Runtime data for the RegexEval step.
 * 
 * @author Samatar Hassan
 * @author Daniel Einspanjer
 * @since 27-03-2008
 */
public class RegexEvalData extends BaseStepData implements StepDataInterface {

  public RowMetaInterface outputRowMeta;
  public RowMetaInterface conversionRowMeta;
  public int indexOfFieldToEvaluate;
  public int indexOfResultField;

  public Pattern pattern;

  public int[] positions;

  public RegexEvalData() {
    super();

    indexOfFieldToEvaluate = -1;
    indexOfResultField = -1;
  }
}
