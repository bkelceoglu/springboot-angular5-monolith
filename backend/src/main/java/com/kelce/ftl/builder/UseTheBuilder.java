
package com.kelce.ftl.builder;

/**
 * @author BKelceoglu backend 2018 UseTheBuilder.java
 *
 */

public class UseTheBuilder
{

	public void useBuilder()
	{
		UserBuilderTest builderTest = UserBuilderTest.builder().withName("aloo").withSurname("veli")
				.withAddress("adasas").build();

	}

}
