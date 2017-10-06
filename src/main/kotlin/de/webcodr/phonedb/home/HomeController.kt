package de.webcodr.phonedb.home

import de.webcodr.phonedb.Phone
import de.webcodr.phonedb.PhoneNotFoundException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun home(@RequestParam(value = "phoneId", defaultValue = "1") phoneId: String): Phone? {
        if (phoneId == "1") {
            return Phone(1, "Apple iPhone X")
        }

        throw PhoneNotFoundException()
    }
}