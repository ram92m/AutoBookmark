package com.ramirmnp.bookmark.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookmark")
public class BookMarkController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String GetBookmarkDetail()
    {
        return "sup";
    }
}
