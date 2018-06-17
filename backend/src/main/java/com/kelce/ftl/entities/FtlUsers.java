
package com.kelce.ftl.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author BKelceoglu backend 2018 FtlUsers.java
 *
 */

@Entity
@Table(name = "ftl_users")
public class FtlUsers implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String email;
	@Column(nullable = true)
	@OneToMany(mappedBy = "user_missing")
	private Set<WhatisMissing> missing;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Set<WhatisMissing> getMissing()
	{
		return missing;
	}

	public void setMissing(Set<WhatisMissing> missing)
	{
		this.missing = missing;
	}

	@Override
	public String toString()
	{
		return "FtlUsers [username=" + username + ", password=" + password + ", email=" + email + "]";
	}

}
