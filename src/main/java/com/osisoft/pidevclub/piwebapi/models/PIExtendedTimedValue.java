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

public class PIExtendedTimedValue {
	@SerializedName("Annotations")
	private List<PIStreamAnnotation> annotations = null;

	@SerializedName("Timestamp")
	private String timestamp = null;

	@SerializedName("UnitsAbbreviation")
	private String unitsAbbreviation = null;

	@SerializedName("Good")
	private Boolean good = null;

	@SerializedName("Questionable")
	private Boolean questionable = null;

	@SerializedName("Substituted")
	private Boolean substituted = null;

	@SerializedName("Annotated")
	private Boolean annotated = null;

	@SerializedName("Value")
	private Object value = null;

	@SerializedName("Errors")
	private List<PIPropertyError> errors = null;

	@SerializedName("WebException")
	private PIWebException webException = null;

	public PIExtendedTimedValue() {
	}


	public void setAnnotations(List<PIStreamAnnotation> annotations) { this.annotations = annotations;}

	public List<PIStreamAnnotation> getAnnotations() { return this.annotations;}

	public void setTimestamp(String timestamp) { this.timestamp = timestamp;}

	public String getTimestamp() { return this.timestamp;}

	public void setUnitsAbbreviation(String unitsAbbreviation) { this.unitsAbbreviation = unitsAbbreviation;}

	public String getUnitsAbbreviation() { return this.unitsAbbreviation;}

	public void setGood(Boolean good) { this.good = good;}

	public Boolean getGood() { return this.good;}

	public void setQuestionable(Boolean questionable) { this.questionable = questionable;}

	public Boolean getQuestionable() { return this.questionable;}

	public void setSubstituted(Boolean substituted) { this.substituted = substituted;}

	public Boolean getSubstituted() { return this.substituted;}

	public void setAnnotated(Boolean annotated) { this.annotated = annotated;}

	public Boolean getAnnotated() { return this.annotated;}

	public void setValue(Object value) { this.value = value;}

	public Object getValue() { return this.value;}

	public void setErrors(List<PIPropertyError> errors) { this.errors = errors;}

	public List<PIPropertyError> getErrors() { return this.errors;}

	public void setWebException(PIWebException webException) { this.webException = webException;}

	public PIWebException getWebException() { return this.webException;}
}
