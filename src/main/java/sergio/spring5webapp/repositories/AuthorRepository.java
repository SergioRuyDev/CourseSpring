package sergio.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sergio.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
