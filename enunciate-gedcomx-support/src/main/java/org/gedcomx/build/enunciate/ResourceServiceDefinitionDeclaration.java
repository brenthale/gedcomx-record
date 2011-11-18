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
package org.gedcomx.build.enunciate;

import com.sun.mirror.declaration.TypeDeclaration;
import org.codehaus.enunciate.contract.jaxrs.Resource;
import org.codehaus.enunciate.contract.jaxrs.ResourceMethod;
import org.gedcomx.rt.www.LinkDefinition;
import org.gedcomx.rt.www.ResourceServiceDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ryan Heaton
 */
public class ResourceServiceDefinitionDeclaration extends Resource {

  private final String name;
  private final String namespace;
  private final List<StatusCode> statusCodes;
  private final List<LinkRelationship> linkRelationships;

  public ResourceServiceDefinitionDeclaration(TypeDeclaration delegate) {
    super(delegate);

    ResourceServiceDefinition rsdInfo = delegate.getAnnotation(ResourceServiceDefinition.class);
    String name = rsdInfo.name();
    if ("##default".equals(name)) {
      name = delegate.getSimpleName();
    }
    this.name = name;

    String namespace = rsdInfo.namespace();
    if ("##default".equals(namespace)) {
      //todo: use xml schema namespace?
      namespace = "";
    }
    this.namespace = namespace;

    this.statusCodes = ResourceServiceProcessor.extractStatusCodes(delegate);

    this.linkRelationships = ResourceServiceProcessor.extractLinkRelationships(delegate);

    for (ResourceMethod resourceMethod : getResourceMethods()) {
      resourceMethod.putMetaData("statusCodes", ResourceServiceProcessor.extractStatusCodes(resourceMethod));
      resourceMethod.putMetaData("linkRelationships", ResourceServiceProcessor.extractLinkRelationships(resourceMethod));
    }
  }

  @Override
  public String getPath() {
    return null;
  }

  @Override
  public Resource getParent() {
    return null;
  }

  public String getName() {
    return name;
  }

  public String getNamespace() {
    return namespace;
  }

  public List<StatusCode> getStatusCodes() {
    return statusCodes;
  }

  public List<LinkRelationship> getLinkRelationships() {
    return linkRelationships;
  }

}