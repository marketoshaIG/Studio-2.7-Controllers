package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displaySkills(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String userForm(){
        return "<html>" +
                "<body>" +
                "<form action='/results' method='post'>" +
                "<table>" +
                "<tr>" +
                "<td><label for='name'>Your Name:</label></td>" +
                "<td><input type='text' name='name'></td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='firstLang'>First favorite language:</label></td>" +
                "<td><select name='firstFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select></td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='secondLang'>Second favorite language:</label></td>" +
                "<td><select name='secondFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select></td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='thirdLang'>Third favorite language:</label></td>" +
                "<td><select name='thirdFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select></td>" +
                "</tr>" +
                "<tr>" +
                "<td></td>" +
                "<td><input type='submit' value='Submit'></td>" +
                "</tr>" +
                "</table>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
    @ResponseBody// done for tonight

    @PostMapping("/form")
    public String formSubmit(@RequestParam String name, @RequestParam String firstFavLang, @RequestParam String secondFavLang, @RequestParam String thirdFavLang){
        System.out.println(name);
        return "<html>" +

                "<body>" +
                "<h1>Hi "+name+"</h1>"+
                "<ol>" +
                "<li>My first fav lang is: "+firstFavLang+"</li>" +
                "<li>My second fav lang is: "+secondFavLang+"</li>" +
                "<li>My third fav lang is: "+thirdFavLang+"</li>" +

                "</ol>";

    }
    @ResponseBody
    @PostMapping("/results")
    public String displayResults(@RequestParam String name, @RequestParam String firstFavLang, @RequestParam String secondFavLang, @RequestParam String thirdFavLang) {
        return "<html>" +
                "<body>" +
                "<h1>Form Results</h1>" +
                "<h2>Here is the information you submitted:</h2>" +
                "<ol>" +
                "<li>Name: " + name + "</li>" +
                "<li>1st fav language: " + firstFavLang + "</li>" +
                "<li>2nd fav language: " + secondFavLang + "</li>" +
                "<li>3rd fav language: " + thirdFavLang + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}