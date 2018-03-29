/**
 * 
 */
package com.guitar.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

/**
 * @author 212593107
 *
 */
public interface LocationJpaRepository extends JpaRepository<Location , Long> {

}
