package hmtri.dev.reactive.bookstore.service.author;

import hmtri.dev.reactive.bookstore.servicedto.AddAuthorRequest;
import io.reactivex.Single;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public Single<String> addAuthor(AddAuthorRequest addAuthorRequest) {
        return null;
    }
}
