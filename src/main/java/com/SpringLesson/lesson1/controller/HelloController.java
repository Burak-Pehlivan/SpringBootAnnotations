package com.SpringLesson.lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    // GET : Veri görüntülemek istediğimiz zaman kullanıyoruz.                      @GetMapping
    // POST : Veri kaydetmek istediğimiz zaman kullanıyoruz.                        @PostMapping
    // PUT : Veri güncellemek için kullanıyoruz.                                    @PutMapping
    // PATCH : Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz.     @PatchMapping
    // Örn: Parola güncellemek gibi.
    // DELETE: Veri silmek istediğimiz zaman kullanıyoruz.                          @DeleteMapping

    @GetMapping({"/message1","/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is : " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "my default message") String message){
        return "Your message is : " + message;
    }

    @GetMapping("/mymessage")
    public String getMyMessages(@RequestParam("m") String message){
        return "Your message is : " + message;
    }

    @GetMapping("/message/{m}")
    public String getMyMessage(@PathVariable("m") String message){
        return "Your message is : " + message;
    }

    // localhost:8080/api/hello
    @GetMapping(path = "/hello")     // Same -> @RequestMapping (path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping("/save")
    public String save(){
    return "Data saved.";
    }

    @DeleteMapping("/delete")
    public String delete(){
    return "Data Deleted.";
    }
}
