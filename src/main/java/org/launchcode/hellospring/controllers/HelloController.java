package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("form")
public class HelloController {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String language;

    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to hello
                "<input type='text' name='name'>" +
                "</form>" +
                "<form action='lang' method='post'>" +
                "<select name ='language' id='lang-select'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='French' >French</option>" +
                "<option value='English'>English</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='German'>German</option>" +
                "<option value='Italian'>Italian</option>" +
                "</select>" +
                "<input type='submit' value='Greet me' method='post'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
@RequestMapping
    public static String createMessage (String name, String language) {
        return language + ", " + name;
    }
}
