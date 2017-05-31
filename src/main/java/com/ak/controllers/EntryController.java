package com.ak.controllers;

import com.ak.models.TrasiiBean;
import com.ak.services.TrasiiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by amolina on 19/05/17.
 */

@CrossOrigin
@RestController
public class EntryController {

    class Greeting {

        private final long id;
        private final String content;

        public Greeting(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private TrasiiService trassiService;

    @RequestMapping(value = "/entry", produces = {"application/json"})
    public String entry(){
        List<TrasiiBean> tmpResult = trassiService.findAll();
        return String.valueOf(tmpResult.size());
    }

    @RequestMapping(value="/hello-world", method= RequestMethod.GET)
    public @ResponseBody
    Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
