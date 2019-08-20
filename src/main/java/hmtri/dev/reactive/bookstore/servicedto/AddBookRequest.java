package hmtri.dev.reactive.bookstore.servicedto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddBookRequest {
    private String title;
    private Long authorId;
}
