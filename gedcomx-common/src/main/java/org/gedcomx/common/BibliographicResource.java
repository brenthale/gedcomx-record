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
package org.gedcomx.common;

import org.gedcomx.rt.CommonNamespaces;
import org.gedcomx.rt.RDFSubClassOf;
import org.gedcomx.rt.RDFSubPropertyOf;

import javax.xml.bind.annotation.XmlType;

/**
 * A bibliographic resource.
 *
 * @author Ryan Heaton
 */
@XmlType ( name = "BibliographicResource" )
@RDFSubClassOf ( CommonNamespaces.DUBLIN_CORE_NAMESPACE + "BibliographicResource" )
public interface BibliographicResource {

  /**
   * The bibliographic citation of a bibliographic resource.
   *
   * @return The bibliographic citation of a bibliographic resource.
   */
  @RDFSubPropertyOf ( CommonNamespaces.DUBLIN_CORE_NAMESPACE + "bibliographicCitation" )
  String getBibliographicCitation();
}