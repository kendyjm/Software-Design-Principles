package org.formation.microservice.userService;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * Repository for Member data implemented using Spring Data JPA.
 * 
 * @author Paul Chapman
 */
public interface MemberRepository extends Repository<Member, Long> {
	/**
	 * Find an Member with the specified Member number.
	 *
	 * @param MemberNumber
	 * @return The Member if found, null otherwise.
	 */
	public Member findById(long id);

	/**
	 * Find Members whose owner name contains the specified string
	 * 
	 * @param partialName
	 *            Any alphabetic string.
	 * @return The list of matching Members - always non-null, but may be
	 *         empty.
	 */
	public List<Member> findByNomContainingIgnoreCase(String partialNom);
	
	/**
	 * Save , use it to register a new user
	 */
	public Member save(Member user);
	
	/**
	 * Find Members with email and password
	 * @param emailAddress
	 * @param lastname
	 * @return
	 */
	public Member findFirstByEmailAndPassword(String email, String password);
	
	/**
	 * Fetch the number of Members known to the system.
	 * 
	 * @return The number of Members.
	 */
	@Query("SELECT count(*) from Member")
	public int countMembers();
}
