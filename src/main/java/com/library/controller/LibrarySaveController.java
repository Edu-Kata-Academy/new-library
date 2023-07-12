package com.library.controller;

import com.library.api.LibrarySaveV1;
import com.library.api.model.saveauthor.AuthorSaveRequest;
import com.library.api.model.saveauthor.AuthorSaveResponse;
import com.library.api.model.saveauthor.BookSaveRequest;
import com.library.api.model.savebook.BookSaveResponse;
import com.library.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LibrarySaveController implements LibrarySaveV1 {

  private final LibraryService libraryService;

  @Override
  public AuthorSaveResponse saveAuthor(AuthorSaveRequest request) {
    return libraryService.saveAuthor(request);
  }

  @Override
  public BookSaveResponse saveBooks(BookSaveRequest book) {
    return libraryService.saveBooks(book);
  }
}