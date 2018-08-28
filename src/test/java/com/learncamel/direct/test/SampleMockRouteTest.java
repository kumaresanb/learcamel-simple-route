package com.learncamel.direct.test;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.learncamel.direct.SampleMockRoute;

public class SampleMockRouteTest extends CamelTestSupport {

	@Override
	protected RoutesBuilder createRouteBuilder() throws Exception {
		return new SampleMockRoute();
	}

	@Test
	public void sampleRouteMockTest() throws InterruptedException {
		String input="Hello1";
		MockEndpoint mockEndpoint=getMockEndpoint("mock:output");
		mockEndpoint.expectedBodiesReceived(input);
		
		template.sendBody("direct:sampleInput", "Hello");
		assertMockEndpointsSatisfied();

	}

}
