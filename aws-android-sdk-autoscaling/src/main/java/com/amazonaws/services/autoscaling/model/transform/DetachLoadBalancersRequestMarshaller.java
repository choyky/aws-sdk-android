/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Detach Load Balancers Request Marshaller
 */
public class DetachLoadBalancersRequestMarshaller implements Marshaller<Request<DetachLoadBalancersRequest>, DetachLoadBalancersRequest> {

    public Request<DetachLoadBalancersRequest> marshall(DetachLoadBalancersRequest detachLoadBalancersRequest) {

        if (detachLoadBalancersRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DetachLoadBalancersRequest> request = new DefaultRequest<DetachLoadBalancersRequest>(detachLoadBalancersRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DetachLoadBalancers");
        request.addParameter("Version", "2011-01-01");

        if (detachLoadBalancersRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(detachLoadBalancersRequest.getAutoScalingGroupName()));
        }

        java.util.List<String> loadBalancerNamesList = detachLoadBalancersRequest.getLoadBalancerNames();
        int loadBalancerNamesListIndex = 1;

        for (String loadBalancerNamesListValue : loadBalancerNamesList) {
            if (loadBalancerNamesListValue != null) {
                request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
            }

            loadBalancerNamesListIndex++;
        }

        return request;
    }
}