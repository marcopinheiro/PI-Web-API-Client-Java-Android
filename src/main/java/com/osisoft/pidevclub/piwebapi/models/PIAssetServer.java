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

public class PIAssetServer {
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

	@SerializedName("IsConnected")
	private Boolean isConnected = null;

	@SerializedName("ServerVersion")
	private String serverVersion = null;

	@SerializedName("ServerTime")
	private String serverTime = null;

	@SerializedName("ExtendedProperties")
	private Map<String, PIValue> extendedProperties = null;

	@SerializedName("Links")
	private PIAssetServerLinks links = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIAssetServer() {
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

	public void setIsConnected(Boolean isConnected) { this.isConnected = isConnected;}

	public Boolean getIsConnected() { return this.isConnected;}

	public void setServerVersion(String serverVersion) { this.serverVersion = serverVersion;}

	public String getServerVersion() { return this.serverVersion;}

	public void setServerTime(String serverTime) { this.serverTime = serverTime;}

	public String getServerTime() { return this.serverTime;}

	public void setExtendedProperties(Map<String, PIValue> extendedProperties) { this.extendedProperties = extendedProperties;}

	public Map<String, PIValue> getExtendedProperties() { return this.extendedProperties;}

	public void setLinks(PIAssetServerLinks links) { this.links = links;}

	public PIAssetServerLinks getLinks() { return this.links;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
