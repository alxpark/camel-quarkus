/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.quarkus.component.sap.netweaver.it;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.CamelContext;
import org.jboss.logging.Logger;

@Path("/sap-netweaver")
@ApplicationScoped
public class SapNetweaverResource {

    private static final Logger LOG = Logger.getLogger(SapNetweaverResource.class);

    private static final String COMPONENT_SAP_NETWEAVER = "sap-netweaver";
    @Inject
    CamelContext context;

    @Path("/load/component/sap-netweaver")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadComponentSapNetweaver() throws Exception {
        /* This is an autogenerated test */
        if (context.getComponent(COMPONENT_SAP_NETWEAVER) != null) {
            return Response.ok().build();
        }
        LOG.warnf("Could not load [%s] from the Camel context", COMPONENT_SAP_NETWEAVER);
        return Response.status(500, COMPONENT_SAP_NETWEAVER + " could not be loaded from the Camel context").build();
    }
}