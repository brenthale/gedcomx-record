/**
 * Copyright 2011-2012 Intellectual Reserve, Inc.
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
package org.gedcomx.types;

import org.codehaus.enunciate.qname.XmlQNameEnum;
import org.codehaus.enunciate.qname.XmlQNameEnumValue;
import org.codehaus.enunciate.qname.XmlUnknownQNameEnumValue;
import org.gedcomx.common.URI;
import org.gedcomx.rt.CommonModels;

/**
 * An enumeration of known resource types. Many are defined by the
 * <a href="http://dublincore.org/documents/dcmi-type-vocabulary/">Dublin Core Type Vocabulary</a>. Others are new resource types
 * introduced by GEDCOM X.
 * 
 * @author Ryan Heaton
 */
@XmlQNameEnum (
  base = XmlQNameEnum.BaseType.URI
)
public enum ResourceType {

  /**
   * An aggregation of resources. A collection is described as a group; its parts may also be separately described.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Collection,

  /**
   * Data encoded in a defined structure. Examples include lists, tables, and databases. A dataset may be useful for direct machine processing.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Dataset,

  /**
   * A non-persistent, time-based occurrence. Metadata for an event provides descriptive information that is the basis for discovery
   * of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast,
   * conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Event,

  /**
   * A visual representation other than text. Examples include images and photographs of physical objects, paintings, prints, drawings,
   * other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both
   * electronic and physical representations.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Image,

  /**
   * A resource requiring interaction from the user to be understood, executed, or experienced. Examples include forms on
   * Web pages, applets, multimedia learning objects, chat services, or virtual reality environments.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  InteractiveResource,

  /**
   * A series of visual representations imparting an impression of motion when shown in succession. Examples include animations, movies,
   * television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable
   * as instances of the broader type Image.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  MovingImage,

  /**
   * An inanimate, three-dimensional object or substance. Note that digital representations of, or surrogates for, these objects should use
   * Image, Text or one of the other types.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  PhysicalObject,

  /**
   * A system that provides one or more functions. Examples include a photocopying service, a banking service, an authentication service,
   * interlibrary loans, a Z39.50 or Web server.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Service,

  /**
   * A computer program in source or compiled form. Examples include a C source file, MS-Windows .exe executable, or Perl script.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Software,

  /**
   * A resource primarily intended to be heard. Examples include a music playback file format, an audio compact disc, and
   * recorded speech or sounds.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Sound,

  /**
   * A static visual representation. Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is
   * to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of
   * the broader type Image.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  StillImage,

  /**
   * A resource consisting primarily of words for reading. Examples include books, letters, dissertations, poems, newspapers, articles,
   * archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text.
   */
  @XmlQNameEnumValue(
    namespace = CommonModels.DUBLIN_CORE_TYPE_NAMESPACE
  )
  Text,

  /**
   * A person. Instances of the type person must also be describable as instances of
   * the broader type Dataset.
   */
  Person,

  /**
   * A relationship between two persons. Instances of the type person must also be describable as instances of
   * the broader type Dataset.
   */
  Relationship,

  /**
   * A name of a person. Instances of the type person must also be describable as instances of
   * the broader type Dataset.
   */
  Name,

  /**
   * A gender of a person. Instances of the type person must also be describable as instances of
   * the broader type Dataset.
   */
  Gender,

  /**
   * A fact about a person or relationship. Instances of the type person must also be describable as instances of
   * the broader type Dataset.
   */
  Fact,

  /**
   * Something else.
   */
  @XmlUnknownQNameEnumValue
  OTHER;


  /**
   * Return the QName value for this enum.
   *
   * @return The QName value for this enum.
   */
  public URI toQNameURI() {
    return URI.create(org.codehaus.enunciate.XmlQNameEnumUtil.toURIValue(this));
  }

  /**
   * Get the enumeration from the QName.
   *
   * @param qname The qname.
   * @return The enumeration.
   */
  public static ResourceType fromQNameURI(URI qname) {
    return org.codehaus.enunciate.XmlQNameEnumUtil.fromURIValue(qname.toString(), ResourceType.class);
  }
}
