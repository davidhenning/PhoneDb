package de.webcodr.phonedb

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND, reason = "This is not the phone you're looking for!")
class PhoneNotFoundException : RuntimeException() {

}