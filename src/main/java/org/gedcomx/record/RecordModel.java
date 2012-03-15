/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.record;

import org.gedcomx.rt.Model;
import org.gedcomx.rt.Models;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Ryan Heaton
 */
@XmlTransient
@Models ( {
  @Model (
    id = "gxr",
    namespace = RecordModel.GEDCOMX_RECORD_V1_NAMESPACE,
    label = "Record Model",
    description = "The record model contains the objects necessary for modeling genealogical record data.",
    version = "v1",
    xmlMediaType = RecordModel.GEDCOMX_RECORD_V1_XML_MEDIA_TYPE,
    jsonMediaType = RecordModel.GEDCOMX_RECORD_V1_JSON_MEDIA_TYPE,
    definesRDFSchema = true
  )
} )
public class RecordModel {

  private RecordModel() {}

  public static final String GEDCOMX_RECORD_V1_NAMESPACE = "http://gedcomx.org/record/v1/";
  public static final String GEDCOMX_RECORD_V1_XML_MEDIA_TYPE = "application/x-gedcom-record-v1+xml";
  public static final String GEDCOMX_RECORD_V1_JSON_MEDIA_TYPE = "application/x-gedcom-record-v1+json";

}