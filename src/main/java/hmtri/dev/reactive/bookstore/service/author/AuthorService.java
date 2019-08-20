package hmtri.dev.reactive.bookstore.service.author;

import hmtri.dev.reactive.bookstore.servicedto.AddAuthorRequest;
import io.reactivex.Single;

public interface AuthorService {
    Single<String> addAuthor(AddAuthorRequest addAuthorRequest);
}
