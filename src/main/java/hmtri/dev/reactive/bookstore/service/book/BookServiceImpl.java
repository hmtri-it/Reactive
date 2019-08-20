package hmtri.dev.reactive.bookstore.service.book;

import hmtri.dev.reactive.bookstore.servicedto.AddBookRequest;
import hmtri.dev.reactive.bookstore.servicedto.BookResponse;
import hmtri.dev.reactive.bookstore.servicedto.UpdateBookRequest;
import io.reactivex.Completable;
import io.reactivex.Single;

import java.util.List;

public class BookServiceImpl implements BookService{


    @Override
    public Single<Long> addBook(AddBookRequest addBookRequest) {
        return null;
    }

    @Override
    public Completable updateBook(UpdateBookRequest updateBookRequest) {
        return null;
    }

    @Override
    public Single<List<BookResponse>> getAllBooks() {
        return null;
    }

    @Override
    public Single<BookResponse> getBookDetail(String id) {
        return null;
    }

    @Override
    public Completable deleteBook(Long id) {
        return null;
    }
}
