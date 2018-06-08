
package com.kelce.ftl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kelce.ftl.entities.FtlUsers;

/**
 * @author BKelceoglu backend 2018 UserRepo.java
 *
 */

@Repository
public interface UserRepo extends JpaRepository<FtlUsers, Long>
{

}
