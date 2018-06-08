
package com.kelce.ftl.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author BKelceoglu backend 2018 WhatisMissing.java
 *
 */

@Entity
@Table(name = "what_is_missing")
public class WhatisMissing implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long whatisId;

	@JoinColumn(name = "id", nullable = false)
	@ManyToOne()
	private FtlUsers user_missing;

}
