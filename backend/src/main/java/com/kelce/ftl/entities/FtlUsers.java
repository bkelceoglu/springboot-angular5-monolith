
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

}
