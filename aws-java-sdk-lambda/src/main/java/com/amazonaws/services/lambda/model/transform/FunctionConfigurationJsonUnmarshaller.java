/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FunctionConfiguration JSON Unmarshaller
 */
public class FunctionConfigurationJsonUnmarshaller implements Unmarshaller<FunctionConfiguration, JsonUnmarshallerContext> {

    public FunctionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        FunctionConfiguration functionConfiguration = new FunctionConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Runtime", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Handler", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setHandler(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSize", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setCodeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemorySize", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeSha256", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setCodeSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    functionConfiguration.setVpcConfig(VpcConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return functionConfiguration;
    }

    private static FunctionConfigurationJsonUnmarshaller instance;

    public static FunctionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FunctionConfigurationJsonUnmarshaller();
        return instance;
    }
}
