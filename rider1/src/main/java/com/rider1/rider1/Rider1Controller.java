package com.rider1.rider1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kenne
 */
@Controller
@RequestMapping("/rider")
public class Rider1Controller {
    @Autowired
    Rider1Service riderService;

    @PostMapping("/busfare")
    public String viewBusFare(double busFareAmount, Model model) {
        //riderService.addMoneyToBusFare(3.89);
        //model.addAttribute("busFare", riderService.addMoneyToBusFare(busFareAmount));
        return "/rider-busfare";
    }

    /*@GetMapping("/location")
    public String getRiderLocation(@PathVariable String location, Model model) {
        model.addAttribute("rider", riderService.getLocation(location));
        return "rider/rider-homepage";
    }*/

    /*@GetMapping("/delete/id={bookId}")
    public String deleteBook(@PathVariable long bookId, Model model) {
        bookService.deleteBook(bookId);
        return "redirect:/book/all";
    }*/

    /*@PostMapping("/create")
    public String createBook(Book book) {

        bookService.saveBook(book);
        return "redirect:/book/all";
    }*/

    /*@PostMapping("/update")
    public String addRiderMoneyToBusFare(double busFareAmount) {
        riderService.addMoneyToBusFare(busFareAmount);
        return "redirect:/rider/all";
    }*/

    /*@GetMapping("/new-book")
    public String newBookForm(Model model) {
        return "book/new-book";
    }

    @GetMapping("/update/busfare")
    public String updateBusFare(double busFareAmount, Model model) {
        model.addAttribute("rider", riderService.addMoneyToBusFare(busFareAmount));
        return "book/update-book";
    }*/
}
