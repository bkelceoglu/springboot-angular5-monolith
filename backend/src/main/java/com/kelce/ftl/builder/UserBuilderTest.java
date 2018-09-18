
package com.kelce.ftl.builder;

import javax.annotation.Generated;

/**
 * @author BKelceoglu backend 2018 UserBuilder.java
 *
 */

public class UserBuilderTest
{
	private String name;
	private String surname;
	private String address;

	@Generated("SparkTools")
	private UserBuilderTest(Builder builder)
	{
		this.name = builder.name;
		this.surname = builder.surname;
		this.address = builder.address;
	}

	public UserBuilderTest(String name, String surname, String address)
	{
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	/**
	 * Creates builder to build {@link UserBuilderTest}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder()
	{
		return new Builder();
	}

	/**
	 * Builder to build {@link UserBuilderTest}.
	 */
	@Generated("SparkTools")
	public static final class Builder
	{
		private String name;
		private String surname;
		private String address;

		private Builder()
		{
		}

		public Builder withName(String name)
		{
			this.name = name;
			return this;
		}

		public Builder withSurname(String surname)
		{
			this.surname = surname;
			return this;
		}

		public Builder withAddress(String address)
		{
			this.address = address;
			return this;
		}

		public UserBuilderTest build()
		{
			return new UserBuilderTest(this);
		}
	}

}
