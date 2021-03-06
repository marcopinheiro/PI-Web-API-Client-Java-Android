/*
 *
 * Copyright 2018 OSIsoft, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   <http://www.apache.org/licenses/LICENSE-2.0>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.osisoft.pidevclub.piwebapi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.osisoft.pidevclub.piwebapi.models.*;

public class PIElementTemplate {
	@SerializedName("WebId")
	private String webId = null;

	@SerializedName("Id")
	private String id = null;

	@SerializedName("Name")
	private String name = null;

	@SerializedName("Description")
	private String description = null;

	@SerializedName("Path")
	private String path = null;

	@SerializedName("AllowElementToExtend")
	private Boolean allowElementToExtend = null;

	@SerializedName("BaseTemplate")
	private String baseTemplate = null;

	@SerializedName("InstanceType")
	private String instanceType = null;

	@SerializedName("NamingPattern")
	private String namingPattern = null;

	@SerializedName("CategoryNames")
	private List<String> categoryNames = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PIValue> extendedProperties = null;

	@SerializedName("Severity")
	private String severity = null;

	@SerializedName("CanBeAcknowledged")
	private Boolean canBeAcknowledged = null;

	@SerializedName("Links")
	private PIElementTemplateLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIElementTemplate() {
	}


	public void setWebId(String webId) { this.webId = webId;}

	public String getWebId() { return this.webId;}

	public void setId(String id) { this.id = id;}

	public String getId() { return this.id;}

	public void setName(String name) { this.name = name;}

	public String getName() { return this.name;}

	public void setDescription(String description) { this.description = description;}

	public String getDescription() { return this.description;}

	public void setPath(String path) { this.path = path;}

	public String getPath() { return this.path;}

	public void setAllowElementToExtend(Boolean allowElementToExtend) { this.allowElementToExtend = allowElementToExtend;}

	public Boolean getAllowElementToExtend() { return this.allowElementToExtend;}

	public void setBaseTemplate(String baseTemplate) { this.baseTemplate = baseTemplate;}

	public String getBaseTemplate() { return this.baseTemplate;}

	public void setInstanceType(String instanceType) { this.instanceType = instanceType;}

	public String getInstanceType() { return this.instanceType;}

	public void setNamingPattern(String namingPattern) { this.namingPattern = namingPattern;}

	public String getNamingPattern() { return this.namingPattern;}

	public void setCategoryNames(List<String> categoryNames) { this.categoryNames = categoryNames;}

	public List<String> getCategoryNames() { return this.categoryNames;}

	public void setExtendedProperties(Map<String, PIValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PIValue> getExtendedProperties() { return this.extendedProperties;}

	public void setSeverity(String severity) { this.severity = severity;}

	public String getSeverity() { return this.severity;}

	public void setCanBeAcknowledged(Boolean canBeAcknowledged) { this.canBeAcknowledged = canBeAcknowledged;}

	public Boolean getCanBeAcknowledged() { return this.canBeAcknowledged;}

	public void setLinks(PIElementTemplateLinks links) { this.links = links;}

	public PIElementTemplateLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
