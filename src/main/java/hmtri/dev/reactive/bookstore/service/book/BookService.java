package hmtri.dev.reactive.bookstore.service.book;

import hmtri.dev.reactive.bookstore.servicedto.AddBookRequest;
import hmtri.dev.reactive.bookstore.servicedto.BookResponse;
import hmtri.dev.reactive.bookstore.servicedto.UpdateBookRequest;
import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public interface BookService {
    Single<Long> addBook(AddBookRequest addBookRequest);

    Completable updateBook(UpdateBookRequest updateBookRequest);

    Single<List<BookResponse>> getAllBooks();

    Single<BookResponse> getBookDetail(String id);

    Completable deleteBook(Long id);
}
