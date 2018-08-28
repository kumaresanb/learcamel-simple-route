package com.learncamel.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleDirectRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
				from("direct:sampleInput")
				.log("Recieved Messge is ${body} and Headers are ${headers}")
				.to("file:sampleOutput?fileName=output.txt");
		}

}
