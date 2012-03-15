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

import org.gedcomx.rt.CommonModels;
import org.gedcomx.rt.RDFSubPropertyOf;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Basic interface for record data that is able to be partitioned.
 *
 * @author Ryan Heaton
 */
@XmlType ( name = "Partitionable" )
public interface Partitionable<T> {

  /**
   * The parts of a record resource.
   *
   * @return The parts of a record resource.
   */
  @RDFSubPropertyOf ( CommonModels.DUBLIN_CORE_NAMESPACE + "hasPart" )
  List<T> getParts();

  /**
   * The parts of the age.
   *
   * @param parts The parts of the age.
   */
  void setParts(List<T> parts);
}
